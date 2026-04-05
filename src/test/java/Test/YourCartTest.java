/*package Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.YourCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class YourCartTest extends BaseTest

{
    @Test
    public void verifyLogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isLogoDisplayed());
        login.doLogin(config.getUsername(), config.getPassword());
        Thread.sleep(1500);
    }

    @Test
    public void verifyProductpage() throws InterruptedException {
        ProductsPage prodpage = new ProductsPage(driver);
        Assert.assertTrue(prodpage.isProductPageLogoDisplayed());
        Assert.assertTrue(prodpage.isProductLabelDisplayed());
        Assert.assertTrue(prodpage.isProductNameDisplayed());
        prodpage.clickAddToCartbuttonforFirstProduct();
        Assert.assertTrue(prodpage.isRemoveCartButtonDisplayed());
        prodpage.clickAddToCartIcon();
        Thread.sleep(1500);
    }

    @Test
    public void verifyYourCartPage() throws InterruptedException {
        YourCartPage cart = new YourCartPage(driver);
        ProductsPage prodpage = new ProductsPage(driver);
        assertTrue(cart.isCartpageTitleDisplayed());
        assertTrue(cart.isCartPageLogoDisplayed());
        //cart.clickContinueShoppingButton();
        wait.implicitWait(Duration.ofSeconds(1));
        // prodpage.clickAddToCartbuttonforSecondProduct();
        // prodpage.clickAddToCartIcon();
        assertTrue(cart.isFirstProductDisplayed());
        assertTrue(cart.isSecondProductDisplayed());
        cart.clickCheckoutButton();
        wait.implicitWait(Duration.ofSeconds(1));

    }

}
*/