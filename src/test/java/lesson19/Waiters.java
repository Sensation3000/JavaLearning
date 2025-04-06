package lesson19;

/*
Ожидания в Selenium

• Implicit Waits (Неявные ожидания) – задаются на уровне драйвера
и применяются ко всем элементам, автоматически увеличивая время
ожидания перед возникновением ошибки из-за их отсутствия.
Помогают избежать сбоев при быстром выполнении тестов.
• Explicit Waits (Явные ожидания) – позволяют задать ожидание для
конкретного элемента или условия перед выполнением действия.
Используются, когда необходимо дожидаться определенного состояния
элемента, например, его кликабельности или видимости.
• Fluent Waits (Гибкие ожидания) – дают возможность задать
максимальное время ожидания и интервал повторных проверок
элемента или условия. Подходят для ситуаций, когда время появления
элемента в DOM может варьироваться.

https://www.selenium.dev/documentation/webdriver/waits/
*/

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Waiters {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testImplicitWait() {
        /*
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        т.к прописали все в BeforeMethod, в каждом тесте это уже не надо писать
        */

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        /*
        Неявное ожидание (Implicit Wait)
        Применяется ко всем элементам в тесте, устанавливая общее
        время ожидания перед выбросом исключения, если элемент не
        найден.
        */

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.findElement(By.id("my-text-id")).sendKeys("Selenium");
        driver.findElement(By.tagName("button")).click();
        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();

        assertEquals(value, "Received!");

        /*
        driver.quit();
        т.к прописали все в AfterMethod, в каждом тесте это уже не надо писать
        */
    }

    @Test
    public void testExplicitWait() throws IOException {
        /*
        Явное ожидание (Explicit Wait)
        Используется для ожидания конкретного элемента или условия
        перед выполнением действия.
        */
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //создается вэйтер от драйвера с ожиданием в 10 секунд

        WebElement landscape = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("landscape")));
        // ExpectedConditions - утилитарный класс, у которого много статических методов
        // этот вэйтер будет запрашивать у драйвера этот элемент, локатор которого был передан,
        // будет это делать в течение 10 секунд и пока этот элемент не будет видимый, он будет продолжать делать запрос
        // когда этот элемент станет видимым, он его вернет

        //в методы можно передавать локатор или сам элемент

        Assert.assertTrue(landscape.getAttribute("src").contains("landscape"));
    }

    @Test
    public void testFluentWait() {
        /*
        Гибкое ожидание (Fluent Wait)
        Позволяет настроить максимальное время ожидания, частоту
        проверок и игнорируемые исключения.
        */

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))  //как часто опрашиваем страницу при поиске элемента
                .ignoring(NoSuchElementException.class);  //игнорируем какую-то ошибку

        WebElement landscape = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("landscape")));
        Assert.assertTrue(landscape.getAttribute("src").contains("landscape"));
    }
}
