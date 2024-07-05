package org.example.stepDefs;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.HomePage;
import org.example.pages.PaymentPage;
import org.example.pages.resultsPage;
import org.openqa.selenium.WebDriver;

public class BookingStepDefs {

    BasePage base = new BasePage();
    HomePage home = new HomePage();
    PaymentPage pay =new PaymentPage();
    resultsPage result = new resultsPage();

    @Given("user choose route")
    public void ChooseRoutes(){
        home.clickNextRouteBtn();
        home.clickSpecificRouteBtn();
    }

    @When("user select a Bus")
    public void SearchForBus() {
        home.clickSearchForBusBtn();
    }
    @And("user search a seat")
    public void SelectSeat() {
        result.clickSelectSeatBtn();
    }

    @And("user find a seat")
    public void SelectAvailableSeat() {
        result.clickAvailableSeatBtn();
        result.clickAvailableSeatBtn();
    }
    @And("user Select BoardingDropping Points")
    public void SelectBoardingDroppingPoints() {
        result.clickBoardingPointSelect();
        result.clickDroppingPointSelect();
    }

    @And("user fill cusstomer details")
    public void FillCustomerDetails() {
        result.setMobileNoTxtFld("6789125987");
        result.setEmailTxtFld("test@test.com");
    }

    @And("user Fill Passenger Details")
    public void FillPassengerDetails(String name, String age, String gender, String concession, String country, int passengerIndex) {
        result.setNameTxtFld(name,passengerIndex);
        result.setAgeTxtFld(age,passengerIndex);

    }

    @And("user Click Make Payment")
    public void ClickMakePayment() {
        result.clickMakePaymentBtn();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("user confirm payment")
    public void AddPaymentData() {
        WebDriver driver=null;
        driver.switchTo().frame(pay.getIframe());
        pay.clickPaymentMethodBtn();
        pay.setCardNoTxtFld("378282246310005");
        pay.setCardExpiryTxtFld("03/26");
        pay.setCardCvvTxtFld("1234");
    }




}
