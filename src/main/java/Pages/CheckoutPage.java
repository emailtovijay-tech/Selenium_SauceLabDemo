package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    By checkoutPageLabel = By.xpath("//span[text() ='Checkout: Overview']");
    By paymentInfoLabel = By.xpath("//div[text() ='Payment Information:']");
    By shippingInfoLabel = By.xpath("//div[text() ='Shipping Information:']");
    By priceTotalLabel = By.xpath("//div[text() ='Price Total']");
    By itemTotalLabel = By.className("summary_subtotal_label");
    By taxLabel = By.className("summary_tax_label");
    By totalLabel = By.className("summary_total_label");
    By productPrice = By.className("inventory_item_price");
    By finishButton = By.id("finish");


    //Action Methods
    public boolean isCheckoutPageLabelDisplayed() {
        return driver.findElement(checkoutPageLabel).isDisplayed();
    }

    public boolean isPaymentInfoLabelDisplayed() {
        return driver.findElement(paymentInfoLabel).isDisplayed();
    }

    public boolean isShippingInfoLabelDisplayed() {
        return driver.findElement(shippingInfoLabel).isDisplayed();
    }

    public boolean isPriceTotalLabelDisplayed() {
        return driver.findElement(priceTotalLabel).isDisplayed();
    }

    public boolean isItemTotalLabelDisplayed() {
        return driver.findElement(itemTotalLabel).isDisplayed();
    }

    public boolean isTaxLabelDisplayed() {
        return driver.findElement(taxLabel).isDisplayed();
    }

    public boolean isTotalTotalLabelDisplayed() {
        return driver.findElement(totalLabel).isDisplayed();
    }


    public double getSumOfProducts() {
        List<WebElement> productprices = driver.findElements(productPrice);

        double sum = 0;

        for (WebElement ele : productprices) {
            String priceText = ele.getText();

            priceText = priceText.replace("$", "");
            double price = Double.parseDouble(priceText);
            sum = sum + price;

        }
        return sum;

    }

    public double getTotalPrice() {
        String totalpricetext = driver.findElement(totalLabel).getText();
        totalpricetext = totalpricetext.replace("Total: $", "");
        double totalprice = Double.parseDouble(totalpricetext);
        return totalprice;
    }
    public double getTax() {
        String taxText = driver.findElement(taxLabel).getText();
        taxText = taxText.replace("Tax: $", "");
        return Double.parseDouble(taxText);
    }

    public void clickFinishButton()
    {
        driver.findElement(finishButton).click();
    }



}
