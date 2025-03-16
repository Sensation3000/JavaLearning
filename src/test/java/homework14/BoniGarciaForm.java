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
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoniGarciaForm {
    private WebDriver driver;

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

    private final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";
    private String name = "Adelya";
    private String password = "12345678";
    private String textarea = "something important";

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
    }


    @Test
    public void testBonigarciaWebFormByCssSelectors() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//div/a[@href='web-form.html']")).click();
        WebElement header = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Web form");

        WebElement textInput = driver.findElement(By.cssSelector("#my-text-id"));
        //driver.findElement(By.id("my-text-id"));
        textInput.sendKeys(name);

        WebElement passwordInput = driver.findElement(By.cssSelector("[name='my-password']"));
        passwordInput.sendKeys(password);

        WebElement textareaInput = driver.findElement(By.cssSelector("[name='my-textarea']"));
        textareaInput.sendKeys(textarea);

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


    }
}
