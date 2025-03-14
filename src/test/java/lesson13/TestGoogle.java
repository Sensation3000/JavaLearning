package lesson13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle {
    @Test
    public void testGoogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.sendKeys("selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@value = 'Поиск в Google']"));
        Thread.sleep(3000);

        searchButton.click();

        Thread.sleep(1000);

        WebElement firstSite = driver.findElement(By.xpath("//cite[1]"));
        String siteText = firstSite.getText();

        Assert.assertEquals(siteText, "https://www.selenium.dev");
        driver.quit();
    }
}
