/*package Test;

import Base.BaseTest;
import Pages.CheckoutInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class CheckoutInfoTest extends BaseTest {



    @Test
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

}
*/