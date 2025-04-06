package lesson19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    private WebDriverWait wait5;
    private WebDriverWait wait10;

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    //дизайн паттерны lazy load
    protected WebDriverWait getWait5() {
        // если метод getWait5 в течение теста не будет вызван, то и объект не будет создан
        // если метод будет вызван, то и объект будет создан
        // экономим память и ресурсы
        // если в тесте уже один раз вызван метод и создан объект, то повторно создаваться не будет

        // их надо обнулять, т.к они созданы для конкретного драйвера
        // в AfterMethod нужно прописать wait5 = null; wait10 = null;
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
