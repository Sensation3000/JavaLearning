package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class JenkinsTest extends BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));

        //обращаемся к урл, логину и паролю, но при этом не светим их в гитхабе
        //для этого создаем файл .properties куда прописываем в формате ключ = значение наши данные
        //этот файл отмечаем в gitignore, чтобы не заливался на гихаб

        //p.s. т.к в 21 уроке заменила файл properties на то, как реально указано в проекте Jenkins,
        //этот класс работать не будет.
        // Как только вернуть файл в тот же вид как было, то есть в такой как указано ниже, все заработает
        //        host = указываем сайт
        //        login = указываем логин
        //        password = указываем пароль



        FileInputStream fis;
        Properties property = new Properties();

        fis = new FileInputStream("src/test/resources/.properties");
        property.load(fis);

        String host = property.getProperty("host");
        String login = property.getProperty("username");
        String password = property.getProperty("password");

        driver.get(host);
        driver.findElement(By.id("j_username")).sendKeys(login);
        driver.findElement(By.id("j_password")).sendKeys(password);
        driver.findElement(By.name("Submit")).click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testExplicitWait() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/view/all/newJob']")));
        button.click();

        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "New Item");
    }

    @Test
    public void testCreateFreeStyleProject() {
        final String projectName = "FreestyleProjectTestName";

        driver.findElement(By.xpath("//a[@href='/view/all/newJob']")).click();
        driver.findElement(By.id("name")).sendKeys(projectName);
        driver.findElement(By.className("hudson_model_FreeStyleProject")).click();
        driver.findElement(By.id("ok-button")).click();
        driver.findElement(By.name("Submit")).click();
        TestUtils.goToHomePage(driver);
        //TestUtils.goToHomePage2(this);

        Assert.assertEquals(
                driver.findElement(By.cssSelector(".jenkins-table__link > span:nth-child(1)")).getText(),
                projectName);
    }
}

