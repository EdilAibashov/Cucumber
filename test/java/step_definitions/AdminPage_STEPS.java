package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPages.AdminPage;
import step_definitions.step_impl.AdminPage_impl;
import util.ConfigReader;
import util.Driver;

public class AdminPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage_impl adminPage = new AdminPage_impl();

    @Given("User opens admin page")
    public void user_opens_admin_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));
    }

    @When("User sign in admin page")
    public void user_sign_in_admin_page() {
        AdminPage_impl.adminSignIn();
    }
    @When("User verifies admin page title is Dashboard")
    public void user_verifies_admin_page_title_is_Dashboard() {
        Assert.assertEquals("Dashboard", AdminPage.getTitle());
    }
}
