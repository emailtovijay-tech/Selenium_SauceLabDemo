package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage {
    WebDriver driver;

    public CheckoutInfoPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators
    By checkoutYourInfoLabel = By.xpath("//span[@class='title' and text()='Checkout: Your Information']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By zipCode = By.name("postalCode");
    By continueButton = By.name("continue");


    //ActionMethods

    public boolean isCheckoutInfoLabelDisplayed()
    {
        return driver.findElement(checkoutYourInfoLabel).isDisplayed();
    }

    public void enterFirstName(String fname)
    {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname)
    {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterZipCode(String zip)
    {
        driver.findElement(zipCode).sendKeys(zip);
    }

    public void clickContinueButton()
    {
        driver.findElement(continueButton).click();
    }
}
