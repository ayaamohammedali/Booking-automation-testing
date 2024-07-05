package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    BasePage base = new BasePage();

    public By nextRouteBtn = By.xpath("//div[contains(@class, 'popular-routes')]//a[contains(@class, 'carousel-control-next')]");
    public void clickNextRouteBtn() {
       base.clickElement(nextRouteBtn);
    }

    public By specificRouteBtn = By.xpath("//div[@class=\"carousel-item active\"]//li[1]//a[contains(@onclick, '1467469338690')]");
    public void clickSpecificRouteBtn() {
        base.clickElement(specificRouteBtn);
    }

    private By departureDatePicker = By.id("txtJourneyDate");
    public void clickDepartureDatePicker() {
        base.clickElement(departureDatePicker);
    }

    private By departureDatePickerNextBtn = By.xpath("//a[@class='ui-datepicker-next ui-corner-all']");
    public WebElement getDepartureDatePickerNextBtn() {
        return base.findElement(departureDatePickerNextBtn);
    }

    private By departureDatePickerDayBtn = By.xpath("//div[@id='ui-datepicker-div']//a[normalize-space(text())='8']");
    public WebElement getDepartureDatePickerDayBtn() {
        return base.findElement(departureDatePickerDayBtn);
    }

    private By searchForBusBtn = By.xpath("//button[contains(@class, 'btn-booking')]");
    public void clickSearchForBusBtn() {
        base.clickElement(searchForBusBtn);
    }

}
