package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import step_definitions.step_impl.BookingPage_impl;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookingPage bookingPage = new BookingPage();
    @When("Opens {string} featured tour")
    public void opens_featured_tour(String string) {
        BookingPage_impl.FeatureT();
    }
    @Then("I select last tour package option from the list")
    public void i_select_last_tour_package_option_from_the_list() {
      BookingPage_impl.BookNow();
    }
    @Then("I should see pop up window")
    public void i_should_see_pop_up_window() {
        BookingPage_impl.PopUp();
    }
    @When("I fill out the form and click submit")
    public void i_fill_out_the_form_and_click_submit() {
        BookingPage_impl.InfoInput();
        BookingPage_impl.clickButton("book now");
        BookingPage_impl.clickButton("cookies");
    }
    @Then("I should see message {string}")
    public void i_should_see_message(String string) {
        BookingPage_impl.UnpaidStatus();
    }
    @Then("I click on {string}")
    public void i_click_on(String string) {
        BookingPage_impl.PayOn();
    }
    @Then("I should see pop up window to confirm")
    public void i_should_see_pop_up_window_to_confirm() {
        BookingPage_impl.AllertMessg();
    }
    @When("I accept the pop up window")
    public void i_accept_the_pop_up_window() {
        BookingPage_impl.AlertAccpt();
    }
    @Then("I should see message2 {string}")
    public void i_should_see_message2(String string) {
        BookingPage_impl.ReservMSG();
    }


//    @When("Click Book Now")
//    public void click_Book_Now() {
//        BookingPage_impl.BookNow();
//    }
//
//    @Then("In Coupon Code field input created coupon code")
//    public void in_Coupon_Code_field_input_created_coupon_code() {
//        BookingPage_impl.verifyTitle();
//    }
}