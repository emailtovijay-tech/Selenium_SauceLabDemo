/*package Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {

    @Test
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
}
*/