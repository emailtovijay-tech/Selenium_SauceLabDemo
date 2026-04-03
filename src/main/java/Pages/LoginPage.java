package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By logo = By.className("login_logo");
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.name("login-button");


    // Action methods
    public boolean isLogoDisplayed() {
        return driver.findElement(logo).isDisplayed();
    }


    public void doLogin(String uname, String pwd) {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }

}
