package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestUtils {

    public static void goToHomePage(WebDriver driver) {
        driver.findElement(By.id("jenkins-name-icon")).click();
    }

    public static void goToHomePage2(BaseTest baseTest) {
        baseTest.getWait10()
                .until(ExpectedConditions.elementToBeClickable(By.id("jenkns-name-icon")))
                .click();
    }
}
