package step_definitions.step_impl;

import jdk.jfr.Percentage;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import pages.CouponPage;
import testData.CouponInfo;
import util.Driver;
import util.SeleniumUtils;

public class CouponPage_impl {
    private static WebDriver driver = Driver.getDriver();
    CouponPage couponPage = new CouponPage();

    public static void filloutCoupon(){
        CouponInfo coupon = new CouponInfo();

        SeleniumUtils.sendKeys(CouponPage.Percentage, coupon.getPercentage());
        SeleniumUtils.sendKeys(CouponPage.MaxUses, coupon.getMaxUses());
        SeleniumUtils.sendKeys(CouponPage.StartDate, coupon.getStartDate());
        SeleniumUtils.sendKeys(CouponPage.ExpDate, coupon.getExpDate());




    }
}
