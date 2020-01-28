package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPages.AdminPage;
import testData.AdminInfo;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_impl {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();

    public static void adminSignIn() {
        AdminInfo admin = new AdminInfo();
        SeleniumUtils.sendKeys(AdminPage.userName, admin.getLogin());
        SeleniumUtils.sendKeys(AdminPage.password, admin.getPasswrd());
        SeleniumUtils.click(AdminPage.signIn_Btn);
        SeleniumUtils.click(AdminPage.couponPage);
    }



}
