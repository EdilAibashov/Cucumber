package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.UserPage;
import step_definitions.step_impl.UserPage_impl;
import util.Driver;

public class UserPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    UserPage userPage = new UserPage();
    @When("Opens any featured tour")
    public void opens_any_featured_tour() {
        UserPage_impl.FeatureT();

    }
    @When("Click Book Now")
    public void click_Book_Now() {
      UserPage_impl.BookNow();
    }

    @Then("In Coupon Code field input created coupon code")
    public void in_Coupon_Code_field_input_created_coupon_code() {
        Assert.assertEquals("17% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.",UserPage.verifyCoupon.getText());

    }

}
