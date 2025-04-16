package lesson23;

import lesson21.common.BaseTest;
import lesson21.common.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


//доработали фреймовк для того, чтобы  связанные тесты работали:
//не удаляем созданное между связанными тестами
//все тесты сортируются таким образом, чтобы связанные тесты всегда выполнялись друг за другом

// в BaseTest поставили listener OrderForTests для того, чтобы наши тесты сортировались
// и правильно запускались связанные тесты
// также появились классы OrderForTests, OrderforTestsTest, OrderUtils

public class FreestyleProjectTest extends BaseTest {
    private static final String PROJECT_NAME = "TestProject1";
    @Test
    public void testCreate (){

        getDriver().findElement(By.linkText("Create a job")).click();
        getDriver().findElement(By.id("name")).sendKeys(PROJECT_NAME);
        getDriver().findElement(By.className("label")).click();
        getDriver().findElement(By.id("ok-button")).click();
        getWait10().until(ExpectedConditions.visibilityOfElementLocated(By.id("general")));
        getDriver().findElement(By.id("jenkins-home-link")).click();

        String actualName = getDriver()
                .findElement(By.xpath("//table[@id='projectstatus']//tbody//a[@class='jenkins-table__link model-link inside']"))
                .getText();

        Assert.assertEquals(actualName, PROJECT_NAME);
    }

    @Test (dependsOnMethods = "testCreate")
    public void testCreateFreestyleProjectWithNoneSCM() {
        Actions action = new Actions( getDriver());

        // 1 вариант открытия настроек созданного проекта - через боковое меню
        // TestUtils.openJobByName(getDriver(), PROJECT_NAME);
        // getDriver().findElement(By.xpath("//a[@href='/job/" + PROJECT_NAME + "/configure']")).click();

        // 2 вариант открытия настроек созданного проекта - через дропдаун меню
        TestUtils.moveAndClickWithJS(getDriver(), getDriver().findElement(By.xpath("//td/a/span[text() = '%s']/../button".formatted(PROJECT_NAME))));
        getDriver().findElement(By.xpath("//a[@href='/job/" + PROJECT_NAME + "/configure']")).click();

        //3 вариант открытия настроек созданного проекта - вернуться обратно на страницу раньше
        //getDriver().navigate().back();

        action.moveToElement(getDriver().findElement(
                By.xpath("//label[text()='None']"))).perform();
        getDriver().findElement(By.name("Submit")).click();
        WebElement result = getDriver().findElement(
                By.cssSelector("#main-panel > div.jenkins-app-bar > div.jenkins-app-bar__content.jenkins-build-caption > h1"));
        Assert.assertEquals(result.getText(), PROJECT_NAME);
    }
}
