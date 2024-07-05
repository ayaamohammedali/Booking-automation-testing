package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    BasePage base = new BasePage();

    public By iframe = By.xpath("//iframe[@class='razorpay-checkout-frame']");
    public WebElement getIframe() {
        return base.findElement(iframe);
    }

    public By paymentMethodBtn = By.xpath("//button[@class=\"new-method has-tooltip false svelte-sps7l1\"][1]");
    public void clickPaymentMethodBtn() {
        base.clickElement(paymentMethodBtn);
    }

    public By cardNoTxtFld = By.id("card_number");
    public void setCardNoTxtFld(String cardNo) {
        base.sendKeysToElement(cardNoTxtFld, cardNo);
    }

    public By cardExpiryTxtFld = By.id("card_expiry");
    public void setCardExpiryTxtFld(String cardExpiry) {
        base.sendKeysToElement(cardExpiryTxtFld, cardExpiry);
    }

    public By cardCvvTxtFld = By.id("card_cvv");
    public void setCardCvvTxtFld(String cardCvv) {
        base.sendKeysToElement(cardCvvTxtFld, cardCvv);
    }
}
