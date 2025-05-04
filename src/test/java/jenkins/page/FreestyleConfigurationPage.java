package jenkins.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import jenkins.common.BasePage;


public class FreestyleConfigurationPage extends BasePage {

    @FindBy(css = "button[name='Submit']")
    private WebElement saveButton;

    public FreestyleConfigurationPage(WebDriver driver) {
        super(driver);
    }

    public FreestyleProjectPage clickSaveButton() {
        getWait5().until(ExpectedConditions.elementToBeClickable(saveButton)).click();

        return new FreestyleProjectPage(getDriver());
    }
}

