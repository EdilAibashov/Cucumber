package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AdminPages.CouponPage;
import pages.HomePage;
import step_definitions.step_impl.AdminPage_impl;
import step_definitions.step_impl.CouponPage_impl;
import util.ConfigReader;
import util.Driver;

public class CouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    CouponPage couponPage = new CouponPage();
        @When("User navigates to featured tour page")
        public void user_navigates_to_featured_tour_page () {
            CouponPage_impl.couponSignIn();
        }

        @Then("Verifies In Coupon Code field input created coupon code")
        public void verifies_In_Coupon_Code_field_input_created_coupon_code () {
            CouponPage_impl.veriFycoupon();
            Driver.closeDriver();
        }
    }

