package jenkins;

import jenkins.page.HomePage;
import jenkins.testData.TestDataProvider;
import jenkins.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewItemTestToPom extends BaseTest {
    @Test
    public void testCheckItemsTypes() {
        final List<String> EXPECTED_ITEM_TYPES_TEXT_LIST = new ArrayList<>(List.of(
                "Freestyle project",
                "Pipeline",
                "Multi-configuration project",
                "Folder",
                "Multibranch Pipeline",
                "Organization Folder"));

        List<String> actualItemsTypesTextList = new HomePage (getDriver())
                .clickNewItemOnLeftSidePanel()
                .getItemTypesTextList();

        Assert.assertEquals(actualItemsTypesTextList, EXPECTED_ITEM_TYPES_TEXT_LIST, "Error!");
    }

    @Test (dataProvider = "itemTypes", dataProviderClass = TestDataProvider.class)
    public void testCheckItemsTypes2(String expectedItemTypeText) {

        String actualItemTypeText = new HomePage(getDriver())
                .clickNewItemOnLeftSidePanel()
                .getItemTypeText(expectedItemTypeText);

        Assert.assertEquals(actualItemTypeText, expectedItemTypeText, "Error!");
    }
}
