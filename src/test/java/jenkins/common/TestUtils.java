package jenkins.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TestUtils {

    /*
    Сначала статические поля, константы -
    Сначала private, protected, package, потом public
    static String NAME;

    Потом идут не статические поля
    Сначала private, protected, package, потом public
    String name;

    Потом идут методы
    Сначала private, protected, package, потом public
    String getName(){};

    Иногда предпочитают private методы ставить в самом низу
     */

    public static void gotoHomePage(BaseTest baseTest) {
        baseTest.getWait10()
                .until(ExpectedConditions.elementToBeClickable(By.id("jenkins-home-link")))
                .click();
    }

    public static WebElement waitForHomePageLoad(BaseTest baseTest) {
        return baseTest
                .getWait5()
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/logout']")));
    }

    public static String generateRandomAlphanumeric() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void moveAndClickWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('mouseenter'));", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('click'));", element);
    }

    public static void scrollAndClickWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    /**
     * Creates a new item in Jenkins with specified name and type.
     *
     * @param baseTest   current test instance (this)
     * @param itemName   name for the new item (must be unique)
     * @param itemTypeId numeric identifier for item type (1-6)
     *                   <p>1 = Freestyle project</p>
     *                   <p>2 = Pipeline</p>
     *                   <p>3 = Multi-configuration project</p>
     *                   <p>4 = Folder</p>
     *                   <p>5 = Multibranch Pipeline</p>
     *                   <p>6 = Organization Folder</p>
     * @throws IllegalArgumentException if:
     *                                  <p>itemTypeId is not between 1-6<p/>
     *                                  <p>itemName is empty or already exists<p/>
     * @example newItemCreate(this, " MyPipeline ", 2); // Creates a Pipeline
     */
    public static void newItemCreate(BaseTest baseTest, String itemName, int itemTypeId) {
        if (itemName.isBlank()) {
            throw new IllegalArgumentException("Item name cannot be empty or whitespace");
        }

        gotoHomePage(baseTest);
        uniqueItemNameCheck(baseTest.getDriver(), itemName);

        baseTest.getWait5().until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//span[text()='New Item']/preceding-sibling::span")))
                .click();
        baseTest.getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.className("jenkins-input")))
                .sendKeys(itemName);

        scrollAndClickWithJS(baseTest.getDriver(),
                baseTest.getWait5().until(ExpectedConditions.elementToBeClickable(
                        (By.xpath("//span[contains(text(), '" + getItemTypeName(itemTypeId) + "')]")))));
        scrollAndClickWithJS(baseTest.getDriver(),
                baseTest.getWait5().until(ExpectedConditions.elementToBeClickable
                        (By.id("ok-button"))));

        gotoHomePage(baseTest);
    }

    private static String getItemTypeName(int typeId) {
        return switch (typeId) {
            case 1 -> "Freestyle project";
            case 2 -> "Pipeline";
            case 3 -> "Multi-configuration project";
            case 4 -> "Folder";
            case 5 -> "Multibranch Pipeline";
            case 6 -> "Organization Folder";
            default -> throw new IllegalArgumentException("Invalid item type: " + typeId);
        };
    }

    private static void uniqueItemNameCheck(WebDriver driver, String itemName) {
        if (!driver.findElements(By.xpath("//td/a/span")).isEmpty()) {
            List<WebElement> existingItems = driver.findElements
                    (By.xpath("//td/a/span"));

            List<String> itemsNames = new ArrayList<>();

            for (WebElement element : existingItems) {
                itemsNames.add(element.getText());
            }

            if (itemsNames.contains(itemName)) {
                throw new IllegalArgumentException("Item name '" + itemName + "' already exists");
            }
        }
    }

    public static void createFolder(WebDriver driver, String folderName) {
        driver.findElement(By.linkText("New Item")).click();
        driver.findElement(By.id("name")).sendKeys(folderName);
        driver.findElement(By.xpath("//*[@id='j-add-item-type-nested-projects']/ul/li[1]")).click();
        driver.findElement(By.id("ok-button")).click();
    }

    public static void createFreestyleProject(WebDriver driver, String projectName) {
        driver.findElement(By.linkText("New Item")).click();
        driver.findElement(By.id("name")).sendKeys(projectName);
        driver.findElement(By.xpath("//span[contains(text(),'Freestyle project')]/ancestor::li")).click();
        driver.findElement(By.id("ok-button")).click();
    }

    public static void openJobByName(WebDriver driver, String jobName) {
        new Actions(driver).moveToElement(driver.findElement(By.xpath(String.format("//a[@href='job/%s/']/span", jobName))))
                .click().perform();
    }

    public static void logout(BaseTest baseTest) {
        WebElement logoutLink = waitForHomePageLoad(baseTest);
        logoutLink.click();
    }

    public static void createNewUser(BaseTest baseTest, String userName, String password, String fullName, String email) {
        baseTest.getWait5().until(ExpectedConditions.elementToBeClickable(By.linkText("Manage Jenkins"))).click();
        baseTest.getWait5()
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='securityRealm/']")))
                .click();
        baseTest.getWait5().until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Create User"))).click();
        baseTest.getDriver().findElement(By.name("username")).sendKeys(userName);
        baseTest.getDriver().findElement(By.name("password1")).sendKeys(password);
        baseTest.getDriver().findElement(By.name("password2")).sendKeys(password);
        baseTest.getDriver().findElement(By.name("fullname")).sendKeys(fullName);
        baseTest.getDriver().findElement(By.name("email")).sendKeys(email);
        baseTest.getDriver().findElement(By.name("Submit")).click();

        final String newUserLink = String.format("a[href='user/%s/']", userName).toLowerCase();
        baseTest.getWait5()
                .until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(newUserLink), userName));
    }

    public static WebElement waitUntilVisible5(BaseTest baseTest, By element) {
        try {
            return baseTest.getWait5().until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            throw new RuntimeException("Element DIDN'T APPEAR during 5 seconds: " + element, e);
        }
    }

    public static WebElement waitUntilVisible10(BaseTest baseTest, By element) {
        try {
            return baseTest.getWait5().until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            throw new RuntimeException("Element DIDN'T APPEAR during 10 seconds: " + element, e);
        }
    }
    public static void createProject(BaseTest baseTest) {
        baseTest.getDriver().findElement(By.linkText("New Item")).click();
    }
}
