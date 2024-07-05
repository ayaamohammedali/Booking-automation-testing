package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class resultsPage {

    BasePage base = new BasePage();

    public By selectSeatBtn = By.xpath("//div[@class=\"s-result-list\"]//input[@id=\"SrvcSelectBtnForward0\"][1]");
    public void clickSelectSeatBtn() {
        base.clickElement(selectSeatBtn);
    }

    public By availableSeatBtn = By.xpath("//div[contains(@id, \"seatlayout-Forward1\")]//li[contains(@class, \"availSeatClass\")][1]");
    public void clickAvailableSeatBtn() {
        base.clickElement(availableSeatBtn);
    }

    public By boardingPointSelect = By.xpath("//ul[@class=\"bordingPoint-list\"]//li[contains(@class, \"boarding\")]");
    public void clickBoardingPointSelect() {
        base.clickElement(boardingPointSelect);
    }

    public By droppingPointSelect = By.xpath("//ul[@class=\"bordingPoint-list\"]//li[contains(@class, \"droping\")]");
    public void clickDroppingPointSelect() {
        base.clickElement(droppingPointSelect);
    }

    public By mobileNoTxtFld = By.xpath("//div[@id=\"Forwardprofile\"]//input[@id=\"mobileNo\"]");
    public void setMobileNoTxtFld(String mobileNo) {
        base.sendKeysToElement(mobileNoTxtFld, mobileNo);
    }

    public By emailTxtFld = By.xpath("//div[@id=\"Forwardprofile\"]//input[@id=\"email\"]");
    public void setEmailTxtFld(String email) {
        base.sendKeysToElement(emailTxtFld, email);
    }

    public void setNameTxtFld(String name, int passengerIndex) {
        By nameTxtFld = By.xpath("//div[@id=\"PaxTblForward\"]//input[@id=\"passengerNameForward" + passengerIndex + "\"]");
        base.sendKeysToElement(nameTxtFld, name);
    }

    public void setAgeTxtFld(String age, int passengerIndex) {
        By ageTxtFld = By.xpath("//div[@id=\"PaxTblForward\"]//input[@id=\"passengerAgeForward" + passengerIndex + "\"]");
        base.sendKeysToElement(ageTxtFld, age);
    }

    public WebElement getGenderDropDown(int passengerIndex) {
        By genderDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"genderCodeIdForward" + passengerIndex + "\"]");
        return base.findElement(genderDropDown);
    }

    public WebElement getConcessionDropDown(int passengerIndex) {
        By concessionDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"concessionIdsForward" + passengerIndex + "\"]");
        return base.findElement(concessionDropDown);
    }

    public WebElement getCountryDropDown(int passengerIndex) {
        By countryDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"nationalityForward" + passengerIndex + "\"]");
        return base.findElement(countryDropDown);
    }

    private By makePaymentBtn = By.id("PgBtn");
    public void clickMakePaymentBtn() {
        base.clickElement(makePaymentBtn);
    }
}
