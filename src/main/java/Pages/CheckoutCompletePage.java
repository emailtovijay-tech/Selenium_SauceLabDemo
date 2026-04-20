package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class CheckoutCompletePage {
    WebDriver driver;

    public CheckoutCompletePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators

    By checkoutCompleteLabel = By.xpath("//span[text() = 'Checkout: Complete!']");
    By thankyouOrderLabel = By.xpath("//h2[text() = 'Thank you for your order!']");
    By backhomeButton = By.id("back-to-products");

    //ActionMethods

    public boolean isCheckoutCompleteLabelDisplayed()
    {
        return driver.findElement(checkoutCompleteLabel).isDisplayed();
    }

    public boolean isThankyouOrderLabelDisplayed()
    {
        return driver.findElement(thankyouOrderLabel).isDisplayed();
    }

    public void clickBackhomeButton()
    {
        driver.findElement(backhomeButton).click();


    }

}
