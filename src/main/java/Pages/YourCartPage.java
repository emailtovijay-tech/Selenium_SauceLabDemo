package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage
{
    WebDriver driver;

    public YourCartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators

    By cartPageLogo = By.className("app_logo");
    By cartPageTitle = By.className("title");
    By firstProductName = By.xpath("//div[text()='Sauce Labs Backpack']");
    By secondProductName = By.xpath("//div[text()='Sauce Labs Bike Light']");
    By continueShoppingButton = By.id("continue-shopping");
    By checkoutButton = By.name("checkout");


    //ActionMethods

    public boolean isCartPageLogoDisplayed()
    {
        return driver.findElement(cartPageLogo).isDisplayed();
    }

    public boolean isCartpageTitleDisplayed()
    {
        return driver.findElement(cartPageTitle).isDisplayed();
    }

    public boolean isFirstProductDisplayed()
    {
        return driver.findElement(firstProductName).isDisplayed();
    }

    public boolean isSecondProductDisplayed()
    {
        return driver.findElement(secondProductName).isDisplayed();
    }

    public void clickContinueShoppingButton()
    {
        driver.findElement(continueShoppingButton).click();
    }

    public void clickCheckoutButton()
    {
        driver.findElement(checkoutButton).click();
    }

}
