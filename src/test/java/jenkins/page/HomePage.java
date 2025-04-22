package jenkins.page;

import jenkins.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

//   private final WebDriver driver;

//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//    }
//    т.к наследуемся от базовой страницы нам уже не нужно использовать свое поле, мы наследуемся


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickAddDescriptionButton() {
        //driver.findElement(By.id("description-link")).click();
        getDriver().findElement(By.id("description-link")).click();
        return this;
    }

    public Boolean isDescriptionTextAreaDisplayed() {
        return getDriver().findElement(By.name("description")).isDisplayed();
    }

    public HomePage sendDescription(String text) {
        getDriver().findElement(By.cssSelector("#description > form > div.jenkins-form-item.tr > div.setting-main.help-sibling > textarea")).sendKeys(text);
        return this;
    }

    public HomePage clickSaveDescriptionButton() {
        getDriver().findElement(By.cssSelector("#description > form > div:nth-child(3) > button")).click();
        return this;
    }

    public String getDescriptionText() {
        return getDriver().findElement(By.cssSelector("#description > div:nth-child(1)")).getText();
    }

    public NewItemPage createJob() {
        getDriver().findElement(By.xpath("//span[text()='Create a job']")).click();

        return new NewItemPage(getDriver());
    }

    public NewItemPage clickNewItemOnLeftSidePanel() {
        getWait10().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Item']/ancestor::span[@class='task-link-wrapper ']"))).click();

        return new NewItemPage(getDriver());
    }
}
