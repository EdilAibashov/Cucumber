package step_definitions.step_impl;

import org.junit.Assert;
import pages.SignInPage;
import testData.NewUserInfo;
import util.SeleniumUtils;

public class SignIn_impl {
    public NewUserInfo userInfo = new NewUserInfo();
    SignInPage signInPage = new SignInPage();


    public static void CreateAcct(){
        NewUserInfo userInfo = new NewUserInfo();
        SignInPage signInPage = new SignInPage();
        signInPage.SignIn_Btn.click();
        SeleniumUtils.sendKeys(signInPage.Email_Ctnr, userInfo.getEmail());
        SeleniumUtils.click(signInPage.Creat_Btn);
        String firstName = userInfo.getFirstName();
        SeleniumUtils.sendKeys(signInPage.FirstName, firstName);
        String lastName = userInfo.getLastName();
        SeleniumUtils.sendKeys(signInPage.LastName, lastName);
        SeleniumUtils.sendKeys(signInPage.Passwd, userInfo.getPassword());
        SeleniumUtils.click(signInPage.Day_Btn);
        SeleniumUtils.click(signInPage.date);
        SeleniumUtils.click(signInPage.Month_Btn);
        SeleniumUtils.click(signInPage.month);
        SeleniumUtils.click(signInPage.Years_Btn);
        SeleniumUtils.click(signInPage.year);
        SeleniumUtils.sendKeys(signInPage.Compani, "TLA");
        SeleniumUtils.sendKeys(signInPage.Address, "9090 Main street");
        SeleniumUtils.sendKeys(signInPage.City, "Alexandria");
        SeleniumUtils.click(signInPage.State_Btn);
        SeleniumUtils.click(signInPage.State);
        SeleniumUtils.sendKeys(signInPage.zipCode, "22311");
        SeleniumUtils.sendKeys(signInPage.MPhone, userInfo.getCellPhoneNum());
        SeleniumUtils.sendKeys(signInPage.Alias, "9090 Main street");
        SeleniumUtils.click(signInPage.Submit_Btn);

    }

    public static void SignInVerify(){

    }
}
