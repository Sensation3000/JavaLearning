package jenkins.page;

import jenkins.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PipelineConfigurationPage extends BasePage {

    public PipelineConfigurationPage(WebDriver driver) {
        super(driver);
    }

    public PipelineConfigurationPage sendDescription(String text) {
        getDriver().findElement(By.xpath("//textarea[@name='description']")).sendKeys(text);

        return this;
    }

    public PipelineConfigurationPage checkByLabel(String label) {
        getDriver().findElement(By.xpath("//label[contains(text(),'%s')]".formatted(label))).click();

        return this;
    }

    public PipelineProjectPage clickSave() {
        getDriver().findElement(By.cssSelector("button[name='Submit']")).click();

        return new PipelineProjectPage(getDriver());
    }
}
