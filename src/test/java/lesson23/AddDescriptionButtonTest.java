package lesson23;

import jenkins.common.BaseTest;
import jenkins.page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDescriptionButtonTest extends BaseTest {
    // Page Object Model (POM).
    // Когда пишем тест, мы работаем с моделью странице в виде объекта
    // Создаем некоторую модель, получаем из нее объект и этот объект характеризует какую-то страницу

    // Разделяем тест на 2 части - тестируемый объект - public и действия private


    @Test
    public void testAddDescriptionButton() {
        WebDriver driver = getDriver();

        WebElement addDescriptionButton = driver.findElement(By.id("description-link"));
        addDescriptionButton.click();

        WebElement descriptionTextArea = driver.findElement(By.name("description"));
        Assert.assertTrue(descriptionTextArea.isDisplayed());
    }

    @Test
    public void testAddDescriptionButtonPom() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAddDescriptionButton();
        Assert.assertTrue(homePage.isDescriptionTextAreaDisplayed());
    }


    @Test
    public void testAddDescriptionButtonPom2() {
        final String text = "new description text";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAddDescriptionButton();
        homePage.sendDescription(text);
        homePage.clickSaveDescriptionButton();

        Assert.assertEquals(homePage.getDescriptionText(), text);
    }

    @Test
    public void testAddDescriptionButtonPomChain() {
        // потому что на HomePage мы сделали не void методы, а с return this (HomePagе),
        // мы теперь можем сделать последовательность/цепь вызовов методов

        final String expectedDescription = "new description text";

        String actualDescription = new HomePage(getDriver())
                .clickAddDescriptionButton()
                .sendDescription(expectedDescription)
                .clickSaveDescriptionButton()
                .getDescriptionText();

        Assert.assertEquals(actualDescription, expectedDescription);
    }
}
