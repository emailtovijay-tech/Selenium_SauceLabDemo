package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    WebDriver driver;

    public WebDriver browser(String br, ChromeOptions options) {

        if (br.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options);
        }
        else if (br.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (br.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        return driver;
    }

}