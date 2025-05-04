package lesson27;

import jenkins.common.BasePage;
import jenkins.page.NewItemPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FindByOnAnyPage extends BasePage {

    @FindBy(id = "main-panel")
    private WebElement mainPanel;

    @FindBy(css = "#description > div:nth-child(1)")
    private WebElement descriptionText;

    @FindBy(id = "description-link")
    private WebElement descriptionButton;

    @FindBy(name = "description")
    private WebElement descriptionTextArea;

    @FindBy(css = "#description > form > div.jenkins-form-item.tr > div.setting-main.help-sibling > textarea")
    private WebElement description;

    @FindBy(xpath = "//span[text()='Create a job']")
    private WebElement newJob;

    @FindBy(css = "#description > form > div:nth-child(3) > button")
    private  WebElement saveDescriptionButton;

    @FindBy(xpath = "//span[text()='New Item']/ancestor::span[@class='task-link-wrapper ']")
    private WebElement newItemButtonOnLeftSidePanel;

    public FindByOnAnyPage(WebDriver driver) {
        super(driver);

        //PageFactory.initElements(driver,this); //добавляем метод в конструктор
        //а чтобы не писать это на каждой странице, прописываем это в BaseTest или BaseModel в зависимости от архитектуры фреймворка
    }

    public FindByOnAnyPage clickAddDescriptionButton() {
        descriptionButton.click();
        return this;
    }

    public Boolean isDescriptionTextAreaDisplayed() {
        return descriptionTextArea.isDisplayed();
    }

    public FindByOnAnyPage sendDescription(String text) {
        description.sendKeys(text);
        return this;
    }

    public FindByOnAnyPage clickSaveDescriptionButton() {
        saveDescriptionButton.click();
        return this;
    }

    public String getDescriptionText() {
        return descriptionText.getText();
    }

    public NewItemPage clickCreateJob() {
        newJob.click();

        return new NewItemPage(getDriver());
    }

    public NewItemPage clickNewItemOnLeftSidePanel() {
        getWait10().until(ExpectedConditions.elementToBeClickable(newItemButtonOnLeftSidePanel)).click();
        return new NewItemPage(getDriver());
    }

    public boolean isJobListEmpty(){
        return mainPanel.getText().contains("Welcome to Jenkins");
    }

}







