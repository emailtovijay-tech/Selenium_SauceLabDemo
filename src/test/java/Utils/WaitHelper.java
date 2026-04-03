package Utils;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WaitHelper {
    WebDriver driver;

    // Constructor to initialize driver
    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    // Method to apply implicit wait
    public void implicitWait(Duration timeout) {
        driver.manage().timeouts().implicitlyWait(timeout);
    }
}
