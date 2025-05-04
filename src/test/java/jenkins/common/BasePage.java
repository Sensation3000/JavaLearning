package jenkins.common;

import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BaseModel{

    public BasePage(WebDriver driver) {
        super(driver);
    }
}
