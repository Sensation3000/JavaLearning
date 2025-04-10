package lesson21;
import lesson21.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePageTest extends BaseTest {

    @Test
    public void testWelcome(){

        String text = getDriver().findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(text, "Welcome to Jenkins!");
    }
}
