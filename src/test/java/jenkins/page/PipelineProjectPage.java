package jenkins.page;


import jenkins.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PipelineProjectPage extends BasePage {

    public PipelineProjectPage(WebDriver driver) {
        super(driver);
    }

    public String getProjectName() {
        return getDriver().findElement(By.className("page-headline")).getText();
    }

    public String getDescription() {
        return getDriver().findElement(By.cssSelector("#description >div")).getText();
    }
}
