package jenkins.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import jenkins.common.BasePage;

public class FreestyleProjectPage extends BasePage {

    public FreestyleProjectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Delete Project']")
    private WebElement leftSideMenuDelete;

    @FindBy(css = "[data-id='ok']")
    private WebElement popUpYesDeleteProject;


    public String getProjectName() {
        return getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.className("page-headline"))).getText();
    }

    public FreestyleProjectPage clickLeftSideMenuDelete() {
        leftSideMenuDelete.click();

        return this;
    }

    public HomePage clickPopUpYesDeleteProject() {
        popUpYesDeleteProject.click();

        return new HomePage(getDriver());
    }
}
