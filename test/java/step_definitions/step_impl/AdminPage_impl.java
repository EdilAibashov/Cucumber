package step_definitions.step_impl;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import pages.CouponPage;
import pages.HomePage;
import pages.RegisterPage;
import testData.AdminInfo;
import testData.CouponInfo;
import testData.NewUserInfo;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_impl {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();

    public static void adminSignIn(){
        AdminInfo admin = new AdminInfo();
        CouponInfo coupon = new CouponInfo();
//        SeleniumUtils.click(AdminPage.userNameClick);
        SeleniumUtils.sendKeys(AdminPage.userName, admin.getLogin());
//        SeleniumUtils.click(AdminPage.passwordClick);
        SeleniumUtils.sendKeys(AdminPage.password, admin.getPasswrd());
        SeleniumUtils.click(AdminPage.signIn_Btn);
        SeleniumUtils.click(AdminPage.couponPage);
        SeleniumUtils.sleep(5000);
        SeleniumUtils.click(AdminPage.Add_Btn);
        SeleniumUtils.sendKeys(AdminPage.Percentage, coupon.getPercentage());
        SeleniumUtils.sendKeys(AdminPage.MaxUses, coupon.getMaxUses());
        SeleniumUtils.click(AdminPage.StartDate);
        SeleniumUtils.click(AdminPage.St_click);
        SeleniumUtils.sleep(2000);
        SeleniumUtils.click(AdminPage.Exp_click);
        SeleniumUtils.click(AdminPage.allTours);
        SeleniumUtils.click(AdminPage.allCars);
        SeleniumUtils.sendKeys(AdminPage.couponNum, coupon.getCouponNum());
        SeleniumUtils.click(AdminPage.Creat_Btn);
        SeleniumUtils.click(AdminPage.Submit_Btn);
    }
}
