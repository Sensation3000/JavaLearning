package lesson21.common;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

@Listeners(FilterForTests.class)
// ставим listener, чтобы отслеживать только измененные классы и запускать только их
// нужно, чтобы CI ранился только для них, а не для всех тестов в  проекте

//если изменится какой-то класс, который не является тестовым, то CI запуститься на все тесты

public abstract class BaseTest {

    private WebDriverWait wait5;
    private WebDriverWait wait10;

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod(Method method) {
        ProjectUtils.logf("Run %s.%s", this.getClass().getName(), method.getName());

        JenkinsUtils.clearData();

        driver = ProjectUtils.createDriver();
        ProjectUtils.get(driver);
        JenkinsUtils.login(driver);

        getWait10().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".empty-state-block h1")));
    }

    @AfterMethod
    protected void afterMethod(Method method, ITestResult testResult) {
        if (!testResult.isSuccess()) {
            try {
                File screenshotDir = new File("screenshots");
                if (!screenshotDir.exists() && !screenshotDir.mkdirs()) {
                    throw new RuntimeException("Failed to create a folder for screenshots");
                }
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                String className = testResult.getTestClass().getRealClass().getSimpleName();
                String testName = testResult.getMethod().getMethodName();
                String fileName = className + "." + testName + ".png";

                File destination = new File(screenshotDir, fileName);
                Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (ProjectUtils.isRunCI() || testResult.isSuccess() || ProjectUtils.closeIfError()) {
            JenkinsUtils.logout(driver);
            driver.quit();
            wait5 = null;
            wait10 = null;
        }

        ProjectUtils.logf("Execution time is %.3f sec", (testResult.getEndMillis() - testResult.getStartMillis()) / 1000.0);
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return wait5;
    }

    protected WebDriverWait getWait10() {
        if (wait10 == null) {
            wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return wait10;
    }
}
