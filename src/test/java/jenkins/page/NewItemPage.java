package jenkins.page;

import jenkins.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewItemPage extends BasePage {

    public NewItemPage(WebDriver driver) {
        super(driver);
    }

    public NewItemPage sendItemName(String name) {
        getDriver().findElement(By.id("name")).sendKeys(name);

        return this;
    }

    public PipelineConfigurationPage selectPipelineAndClickOk() {
        getDriver().findElement(By.xpath("//span[text()='Pipeline']")).click();
        getDriver().findElement(By.id("ok-button")).click();

        return new PipelineConfigurationPage(getDriver());
    }

    public List<String> getItemTypesTextList() {
        List<String> itemTypesTextList = new ArrayList<>();
        List<WebElement> webElementList = getDriver().findElements(By.xpath("//li[@role='radio']//span"));
        for (WebElement webElement: webElementList) {
            itemTypesTextList.add(webElement.getText());
        }
        return itemTypesTextList;
    }

    public String getItemTypeText(String itemType){
        return getDriver().findElement(By.xpath("//span[text()='" + itemType + "']")).getText();
    }

    public NewItemPage selectFreestyle() {
        getDriver().findElement(By.cssSelector(".hudson_model_FreeStyleProject")).click();

        return this;
    }

    public FreestyleConfigurationPage selectFreestyleAndClickOk() {
        selectFreestyle();
        getDriver().findElement(By.id("ok-button")).click();

        return new FreestyleConfigurationPage(getDriver());
    }
}
