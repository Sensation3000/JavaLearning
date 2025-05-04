package lesson27;

import jenkins.common.BaseTest;
import jenkins.page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FreestyleProjectTest extends BaseTest {

    private static final String PROJECT_NAME = "TestProject";

    @Test
    public void testCreateFreestyleProject() {
        String projectName = new HomePage(getDriver())
                .clickNewItemOnLeftSidePanel()
                .sendItemName(PROJECT_NAME)
                .selectFreestyleAndClickOk()
                .clickSaveButton()
                .getProjectName();

        Assert.assertEquals(projectName, PROJECT_NAME);
    }

    @Test(dependsOnMethods = "testCreateFreestyleProject")
    public void testDeleteFreestyleProject() {
        List<String> projectNameList = new HomePage(getDriver())
                .clickFreestyleProjectOnDashboard(PROJECT_NAME)
                .clickLeftSideMenuDelete()
                .clickPopUpYesDeleteProject()
                .getProjectNameList();

        Assert.assertListNotContainsObject(projectNameList, PROJECT_NAME, "The project is not deleted");
    }
}
