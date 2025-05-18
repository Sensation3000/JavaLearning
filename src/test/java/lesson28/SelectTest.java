package lesson28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

public class SelectTest {
    WebDriver driver;
    private static final String BASE_URL = "https://www.selenium.dev/selenium/web/selectPage.html";

    @BeforeMethod
    void setup() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    void tearDown() {
        driver.getPageSource();
        driver.quit();
    }


    //выбор 1 значения из выпадающего списка
    @Test
    public void testSimpleDropDown() throws InterruptedException {

        final WebElement selectWithoutMultiple = driver.findElement(By.id("selectWithoutMultiple"));

        Select simpleDropDown = new Select(selectWithoutMultiple);
        Thread.sleep(1000); //это только для показа используем
        simpleDropDown.selectByValue("two");

        String newValue = selectWithoutMultiple.getAttribute("value");
        System.out.println(newValue);
        Assert.assertEquals(newValue, "two");
        Thread.sleep(3000);
    }

    //множественный выбор
    //когда есть аттрибут multiple
    @Test
    public void testMupltipleSelect() throws InterruptedException {

        WebElement selectElement = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));

        Select multiSelect = new Select(selectElement);
        multiSelect.selectByIndex(2);
        Thread.sleep(1000);

        multiSelect.deselectByIndex(0);
        Thread.sleep(1000);

        //multiSelect.selectByVisibleText("cheddar");

        System.out.println(selectElement.getAttribute("value"));
        System.out.println(multiSelect.getAllSelectedOptions().stream().map(WebElement :: getText).collect(Collectors.toList()));
        Thread.sleep(3000);

    }
}
