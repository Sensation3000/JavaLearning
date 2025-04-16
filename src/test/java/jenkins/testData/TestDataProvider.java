package jenkins.testData;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "itemTypes")
    public Object[][] itemTypes() {
        return new Object[][]{
                {"Freestyle project"},
                {"Pipeline"},
                {"Multi-configuration project"},
                {"Folder"},
                {"Multibranch Pipeline"},
                {"Organization Folder"}
        };
    }
}
