package homework14;

/*
Вариации поиска локаторов/селекторов

Text input
By.name("my-text");
By.id("my-text-id");
By.cssSelector("#my-text-id");
By.xpath("//input[@name='my-text']");

passwordInput
By.name("my-password")
By.cssSelector("input[name='my-password']
By.xpath("//input[@name='my-password']")

textareaInput
By.name("my-text")
By.cssSelector("[name='my-textarea']")
By.xpath("//textarea[@name='my-textarea']")

disabledInput
By.name("my-disabled")
By.cssSelector("[placeholder='Disabled input']")
By.cssSelector("[placeholder='Disabled input']")

dropDownSelect
By.name("my-select")
By.className("form-select")
By.cssSelector("[name='my-select']")

DropdownDataList
By.name("my-datalist")
By.cssSelector("[list='my-options']")
By.xpath("//input[@list='my-options']")


*/


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertFalse;

public class BoniGarciaForm {
    private final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";
    private WebDriver driver;
    private String name = "Adelya";
    private String password = "12345678";
    private String textarea = "something important";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBonigarciaWebFormByName() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//div/a[@href='web-form.html']")).click();
        WebElement header = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Web form");

        WebElement textInput = driver.findElement(By.name("my-text"));
        textInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.name("my-password"));
        passwordInput.sendKeys(password);

        WebElement textareaInput = driver.findElement(By.name("my-textarea"));
        textareaInput.sendKeys(textarea);

        WebElement disabledInput = driver.findElement(By.name("my-disabled"));
        assertFalse(disabledInput.isEnabled());

        WebElement readonlyInput = driver.findElement(By.name("my-readonly"));
        String readonlyText = readonlyInput.getAttribute("value");
        Assert.assertEquals(readonlyText, "Readonly input");

        WebElement dropDownSelect = driver.findElement(By.name("my-select"));
        Select openThisSelectMenu = new Select(dropDownSelect);
        openThisSelectMenu.selectByVisibleText("One");

        WebElement DropdownDataList = driver.findElement(By.name("my-datalist"));
        DropdownDataList.sendKeys("Moscow");

        WebElement fileInput = driver.findElement(By.name("my-file"));
        String relativeFilePath = "src/test/java/uploadFiles/img.png";
        File fileToUpload = new File(relativeFilePath);
        String absoluteFilePath = fileToUpload.getAbsolutePath();
        fileInput.sendKeys(absoluteFilePath);

    }


    @Test
    public void testBonigarciaWebFormByCssSelectors() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//div/a[@href='web-form.html']")).click();
        WebElement header = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Web form");

        WebElement textInput = driver.findElement(By.cssSelector("#my-text-id"));
        //other choice is driver.findElement(By.id("my-text-id"));
        textInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.cssSelector("[name='my-password']"));
        passwordInput.sendKeys(password);

        WebElement textareaInput = driver.findElement(By.cssSelector("[name='my-textarea']"));
        textareaInput.sendKeys(textarea);

        WebElement disabledInput = driver.findElement(By.cssSelector("[placeholder='Disabled input']"));
        Assert.assertFalse(disabledInput.isEnabled());
        String disabledInputText = disabledInput.getDomAttribute("placeholder");
        Assert.assertTrue(disabledInputText.contains("Disabled input"));

        WebElement readonlyInput = driver.findElement(By.cssSelector("[value='Readonly input']"));
        String readonlyText = readonlyInput.getAttribute("value");
        Assert.assertEquals(readonlyText, "Readonly input");

        WebElement dropDownSelect = driver.findElement(By.cssSelector("[name='my-select']"));
        //other choice driver.findElement(By.className("form-select"));
        Select openThisSelectMenu = new Select(dropDownSelect);
        openThisSelectMenu.selectByVisibleText("Two");

        WebElement DropdownDataList = driver.findElement(By.cssSelector("[list='my-options']"));
        DropdownDataList.sendKeys("Saint-Petersburg");

        WebElement fileInput = driver.findElement(By.cssSelector("[type='file']"));
        String relativeFilePath = "src/test/java/uploadFiles/img.png";
        File fileToUpload = new File(relativeFilePath);
        String absoluteFilePath = fileToUpload.getAbsolutePath();
        fileInput.sendKeys(absoluteFilePath);

    }

    @Test
    public void testBonigarciaWebFormByXpath() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//div/a[@href='web-form.html']")).click();
        WebElement header = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Web form");

        WebElement textInput = driver.findElement(By.xpath("//input[@name='my-text']"));
        textInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='my-password']"));
        passwordInput.sendKeys(password);

        WebElement textareaInput = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
        textareaInput.sendKeys(textarea);

        WebElement disabledInput = driver.findElement(By.xpath("//input[@placeholder='Disabled input']"));
        assertFalse(disabledInput.isEnabled());

        WebElement dropDownSelect = driver.findElement(By.xpath("//select"));
        Select openThisSelectMenu = new Select(dropDownSelect);
        openThisSelectMenu.selectByVisibleText("Three");

        WebElement readonlyInput = driver.findElement(By.xpath("//input[@value='Readonly input']"));
        String readonlyText = readonlyInput.getAttribute("value");
        Assert.assertEquals(readonlyText, "Readonly input");

        WebElement DropdownDataList = driver.findElement(By.xpath("//input[@list='my-options']"));
        DropdownDataList.sendKeys("Saint-Petersburg");

        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        String relativeFilePath = "src/test/java/uploadFiles/img.png";
        File fileToUpload = new File(relativeFilePath);
        String absoluteFilePath = fileToUpload.getAbsolutePath();
        fileInput.sendKeys(absoluteFilePath);

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);

        WebElement formSubmitted = driver.findElement(By.xpath("//h1[text()='Form submitted']"));

        Assert.assertTrue(formSubmitted.isDisplayed(), "Verifying if the confirmation page is displayed");
    }
}
