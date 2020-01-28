package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPages.CouponPage;
import testData.CouponInfo;
import util.Driver;
import util.SeleniumUtils;

public class CouponPage_impl {
    private static WebDriver driver = Driver.getDriver();
        public static void couponSignIn() {
            CouponInfo coupon = new CouponInfo();

            SeleniumUtils.sleep(5000);
            SeleniumUtils.click(CouponPage.Add_Btn);
            SeleniumUtils.click(CouponPage.Percentage);
            SeleniumUtils.sendKeys(CouponPage.Percentage, coupon.getPercentage());
            SeleniumUtils.click(CouponPage.MaxUses);
            SeleniumUtils.sendKeys(CouponPage.MaxUses, coupon.getMaxUses());
//        SeleniumUtils.sendKeys(CouponPage.StartDate, coupon.getStartDate());
            SeleniumUtils.click(CouponPage.StartDate);
            SeleniumUtils.click(CouponPage.St_click);
            SeleniumUtils.sleep(6000);
            SeleniumUtils.sendKeys(CouponPage.Exp_click, coupon.getExpDate());
            SeleniumUtils.sleep(2000);
            SeleniumUtils.click(CouponPage.allTours);
            SeleniumUtils.click(CouponPage.allCars);
            SeleniumUtils.sendKeys(CouponPage.couponNum, coupon.getCouponNum());
            SeleniumUtils.click(CouponPage.Creat_Btn);
            SeleniumUtils.click(CouponPage.Submit_Btn);
            SeleniumUtils.sleep(5000);

        }
        public static void veriFycoupon(){
            CouponInfo coupon = new CouponInfo();
            Assert.assertEquals(coupon.getCouponNum(),coupon.getCouponNum());
        }
}

