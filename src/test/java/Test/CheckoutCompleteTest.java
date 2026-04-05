package Test;
import Base.BaseTest;
import Pages.*;
import Utils.ScrollingViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckoutCompleteTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = Utils.DataProviders.class)
    public void verifyLogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        assertTrue(login.isLogoDisplayed());
        login.doLogin(config.getUsername(), config.getPassword());
        wait.implicitWait(Duration.ofSeconds(1));
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyProductpage() throws InterruptedException {
        ProductsPage prodpage = new ProductsPage(driver);
        assertTrue(prodpage.isProductPageLogoDisplayed());
        assertTrue(prodpage.isProductLabelDisplayed());
        assertTrue(prodpage.isProductNameDisplayed());
        prodpage.clickInAllAddToCartButton();
        assertTrue(prodpage.isRemoveCartButtonDisplayed());
        prodpage.clickAddToCartIcon();
        wait.implicitWait(Duration.ofSeconds(1));
    }

    @Test(dependsOnMethods = "verifyProductpage")
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

    @Test(dependsOnMethods = "verifyYourCartPage")
    public void verifyCheckoutInfoPage() throws InterruptedException, IOException {
        CheckoutInfoPage checkinfo = new CheckoutInfoPage(driver);
        wait.implicitWait(Duration.ofSeconds(1));
        Assert.assertTrue(checkinfo.isCheckoutInfoLabelDisplayed());
        checkinfo.enterFirstName(config.getFname());
        checkinfo.enterLastName(config.getLname());
        checkinfo.enterZipCode(config.getZIPCode());
        checkinfo.clickContinueButton();
        wait.implicitWait(Duration.ofSeconds(1));
    }

    @Test(dependsOnMethods = "verifyCheckoutInfoPage")
    public void verifyCheckoutPage() throws InterruptedException {
        CheckoutPage checkout = new CheckoutPage(driver);
        ScrollingViewHelper scroll = new ScrollingViewHelper(driver);
        assertTrue(checkout.isCheckoutPageLabelDisplayed());
        scroll.forscrollingview();
        wait.implicitWait(Duration.ofSeconds(1));
        assertTrue(checkout.isPaymentInfoLabelDisplayed());
        assertTrue(checkout.isShippingInfoLabelDisplayed());
        assertTrue(checkout.isItemTotalLabelDisplayed());
        Assert.assertTrue(checkout.isTaxLabelDisplayed());
        Assert.assertTrue(checkout.isTotalTotalLabelDisplayed());
        double sumofallproducts = checkout.getSumOfProducts();
        double taxamount = checkout.getTax();
        double totalprice = checkout.getTotalPrice();
        assertEquals(totalprice, sumofallproducts + taxamount, "Price Total Not matching");
        checkout.clickFinishButton();
        wait.implicitWait(Duration.ofSeconds(1));
    }

    @Test(dependsOnMethods = "verifyCheckoutPage")
    public void verifyCheckoutCompletePage() throws InterruptedException {
        CheckoutCompletePage checkcomp = new CheckoutCompletePage(driver);
        Assert.assertTrue(checkcomp.isCheckoutCompleteLabelDisplayed());
        Assert.assertTrue(checkcomp.isThankyouOrderLabelDisplayed());
        checkcomp.clickBackhomeButton();
        wait.implicitWait(Duration.ofSeconds(1));
    }
}
