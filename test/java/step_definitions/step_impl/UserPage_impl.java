package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.UserPage;
import testData.CouponInfo;
import util.Driver;
import util.SeleniumUtils;

public class UserPage_impl {
    private static WebDriver driver = Driver.getDriver();
   public static void FeatureTour(){
       UserPage userPage = new UserPage();

   }
   public static void FeatureT(){
       SeleniumUtils.highlightElement(UserPage.featureTour);
       SeleniumUtils.click(UserPage.featureTour);
   }
   public static void BookNow(){
       CouponInfo coupon = new CouponInfo();
       SeleniumUtils.highlightElement(UserPage.bookNow_Btn);
       SeleniumUtils.click(UserPage.bookNow_Btn);
       SeleniumUtils.sendKeys(UserPage.applyCoupon,coupon.getStartDate());
       SeleniumUtils.highlightElement(UserPage.submit_Btn);
       SeleniumUtils.click(UserPage.submit_Btn);


   }

}
