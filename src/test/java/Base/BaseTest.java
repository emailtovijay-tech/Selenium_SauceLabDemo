package Base;

import Utils.ConfigReader;
import Utils.DriverFactory;
import Utils.WaitHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;
    protected WaitHelper wait;
    protected ConfigReader config;

    @BeforeClass
    public void setup() throws IOException {
        ChromeOptions options = new ChromeOptions();
        DriverFactory df = new DriverFactory();
        config = new ConfigReader();

        // Disable notifications
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--incognito");

        driver = df.browser(config.getBrowser(), options);

        driver.get(config.getUrl());

        driver.manage().window().maximize();

        wait = new WaitHelper(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public void handleRandomAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
            System.out.println("No alert was present" + e);
        }
    }

}
