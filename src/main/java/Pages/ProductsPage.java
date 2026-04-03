package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators

    By productScreenLabel = By.className("title");
    By productPageLogo = By.className("app_logo");
    By productNamefirst = By.xpath("//div[text()='Sauce Labs Backpack']");
    By addToCartButton1stProduct = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2ndProduct = By.id("add-to-cart-sauce-labs-bike-light");
    By removeToCartButton = By.id("remove-sauce-labs-backpack");
    By addToCartIcon = By.className("shopping_cart_link");
    By allAddtocardButton = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory ");
    By burgerIcon = By.className("bm-burger-button");
    By logoutLink = By.id("logout_sidebar_link");

    public boolean isProductLabelDisplayed() {
        return driver.findElement(productScreenLabel).isDisplayed();
    }

    public boolean isProductPageLogoDisplayed() {
        return driver.findElement(productPageLogo).isDisplayed();
    }

    public boolean isProductNameDisplayed() {
        return driver.findElement(productNamefirst).isDisplayed();
    }


    public void clickAddToCartbuttonforFirstProduct() {
        driver.findElement(addToCartButton1stProduct).click();

    }

    public void clickAddToCartbuttonforSecondProduct() {
        driver.findElement(addToCartButton2ndProduct).click();

    }

    public boolean isRemoveCartButtonDisplayed() {
        return driver.findElement(removeToCartButton).isDisplayed();
    }

    public void clickAddToCartIcon() {
        driver.findElement(addToCartIcon).click();

    }

    public void clickInAllAddToCartButton() {
        List<WebElement> allProducts = driver.findElements(allAddtocardButton);

        for (WebElement product : allProducts) {
            product.click();
        }

    }

    public void clickBurgerIcon() {
        driver.findElement(burgerIcon).click();
    }

    public void clickLogoutLink() {
        driver.findElement(logoutLink).click();
    }

}
