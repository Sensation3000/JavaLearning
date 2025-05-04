package jenkins.page;

import jenkins.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

//   private final WebDriver driver;

//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//    }
//    т.к наследуемся от базовой страницы нам уже не нужно использовать свое поле, мы наследуемся

    @FindBy(id = "main-panel")
    private WebElement mainPanel;

    public HomePage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver,this);
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

    public boolean isJobListEmpty(){
        return mainPanel.getText().contains("Welcome to Jenkins");
    }

    public FreestyleProjectPage clickFreestyleProjectOnDashboard(String projectName) {
        getWait5().until(ExpectedConditions.visibilityOf(getDriver().findElement(
                        By.xpath("//a[@class='jenkins-table__link model-link inside']/span[text()='%s']".formatted(projectName)))))
                .click();

        return new FreestyleProjectPage(getDriver());
    }

    public List<String> getProjectNameList() {
        if (isJobListEmpty()) {
            return List.of();
        }
        return getDriver().findElements(By.cssSelector(".jenkins-table__link > span:nth-child(1)")).stream()
                .map(WebElement::getText).toList();
    }
}
