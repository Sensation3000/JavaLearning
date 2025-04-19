package jenkins;

import jenkins.testData.TestDataProvider;
import jenkins.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewItemTest extends BaseTest{

    @Test
    public void testCheckItemsTypes() {
        final List<String> expectedItemsTypes = new ArrayList<>(List.of(
                "Freestyle project",
                "Pipeline",
                "Multi-configuration project",
                "Folder",
                "Multibranch Pipeline",
                "Organization Folder"));

        getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/view/all/newJob']"))).click();

        List<WebElement> itemsTypes = getDriver().findElements(By.xpath("//span[@class='label']"));
        List<String> actualItemsTypes = new ArrayList<>();
        for (WebElement element : itemsTypes) {
            actualItemsTypes.add(element.getDomProperty("innerText"));
        }

        Assert.assertEquals(actualItemsTypes, expectedItemsTypes, "Error!");
    }

    @Test (dataProvider = "itemTypes", dataProviderClass = TestDataProvider.class)
    public void testCheckItemsTypes2(String expectedItemType) {

        getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/view/all/newJob']"))).click();
        String actualItemType = getDriver().findElement(By.xpath("//span[text()='" + expectedItemType + "']")).getText();

        Assert.assertEquals(actualItemType, expectedItemType, "Error!");
    }
}
