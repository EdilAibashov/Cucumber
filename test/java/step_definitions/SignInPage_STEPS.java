package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignInPage;
import step_definitions.step_impl.SignIn_impl;
import testData.NewUserInfo;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class SignInPage_STEPS {
    SignIn_impl signIn_impl = new SignIn_impl();
    SignInPage signInPage = new SignInPage();

    @Given("I Navigate to Sign In page")
    public void i_Navigate_to_Sign_In_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }

    @When("I Create new user")
    public void i_Create_new_user() {

       SignIn_impl.CreateAcct();
    }

    @And("I Verify new user is created by checking if first name")
    public void i_Verify_new_user_is_created_by_checking_if_first_name() {
        SeleniumUtils.waitForPageToLoad();
        Assert.assertEquals(signIn_impl.userInfo.getFirstName()+" "+signIn_impl.userInfo.getLastName(),signInPage.Verify.getText() );
    }


}
