package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import pages.CouponPage;
import step_definitions.step_impl.AdminPage_impl;
import step_definitions.step_impl.CouponPage_impl;
import testData.AdminInfo;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage_impl adminPage = new AdminPage_impl();

    @Given("User opens admin page")
    public void user_opens_admin_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));
    }
    @When("User verifies admin page title is Dashboard")
    public void user_verifies_admin_page_title_is_Dashboard() {
        Assert.assertEquals("Coupon Codes Management", AdminPage.getTitle());
    }



    @When("User sign in admin page")
    public void user_sign_in_admin_page() {
        AdminPage_impl.adminSignIn();
    }

    @When("User navigates to featured tour page")
    public void user_navigates_to_featured_tour_page() {
        AdminPage_impl.adminSignIn();
    }

    @When("Click Book Now")
    public void click_Book_Now() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Verifies In Coupon Code field input created coupon code")
    public void verifies_In_Coupon_Code_field_input_created_coupon_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }




}
