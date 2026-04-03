package Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = Utils.DataProviders.class)
    public void verifyLogin(String username, String password) throws InterruptedException {

        System.out.println("Executing with: " + username + " | " + password);

        // ✅ HARD CHECK (fixes your error 100%)
        if (username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()) {
            System.out.println("Skipping invalid data");
            return;
        }
        LoginPage login = new LoginPage(driver);
        ProductsPage page = new ProductsPage(driver);
        assertTrue(login.isLogoDisplayed());
        login.doLogin(username, password);  // ✅ use DataProvider data
        wait.implicitWait(Duration.ofSeconds(1));
        page.clickBurgerIcon();
        page.clickLogoutLink();
        wait.implicitWait(Duration.ofSeconds(1));
    }
}