package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import testData.CouponInfo;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_impl {
    private static WebDriver driver = Driver.getDriver();
   public static void FeatureTour(){
       BookingPage bookingPage = new BookingPage();

   }
   public static void FeatureT(){
       SeleniumUtils.sleep(2000);
       SeleniumUtils.highlightElement(BookingPage.SecondfeatureTour);
       SeleniumUtils.click(BookingPage.SecondfeatureTour);
   }
   public static void BookNow(){

//       CouponInfo coupon = new CouponInfo();
//       SeleniumUtils.highlightElement(BookingPage.bookNow_Btn);
//       SeleniumUtils.click(BookingPage.bookNow_Btn);
//       SeleniumUtils.sendKeys(BookingPage.applyCoupon,coupon.getStartDate());
//       SeleniumUtils.highlightElement(BookingPage.submit_Btn);
//       SeleniumUtils.click(BookingPage.submit_Btn);
       SeleniumUtils.sleep(2000);
       SeleniumUtils.sleep(2000);
       SeleniumUtils.click(BookingPage.LastTourPackage);


   }
    public static void verifyTitle(){
        Assert.assertEquals("17% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.", BookingPage.verifyCoupon.getText());
    }
    public static void clickButton(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "book now":
                SeleniumUtils.click(BookingPage.Submit_Btn);
                break;
            case "cookies":
                SeleniumUtils.click(BookingPage.cookies_Btn);
                break;
        }
    }
    public static void PopUp(){
       SeleniumUtils.sleep(2000);
       Assert.assertEquals("Day Visit of Petra from Oman", BookingPage.popUpPage.getText());
    }
    public static void InfoInput(){
       SeleniumUtils.sleep(2000);
       SeleniumUtils.sendKeys(BookingPage.FullName, "John Doe");
       SeleniumUtils.sendKeys(BookingPage.Phone, "7185467789");
       SeleniumUtils.sendKeys(BookingPage.Address, "77990 Main Street. Fairfax, VA. 22311");
       SeleniumUtils.sendKeys(BookingPage.Email, "JohnDoe@gmail.com");
   }
    public static void UnpaidStatus(){
       Assert.assertEquals(BookingPage.UnpaidSign.getText(),"Your booking status is Unpaid");
   }
   public static void PayOn(){
       SeleniumUtils.click(BookingPage.PayOn_Btn);
   }
   public static void AlertAccpt(){
       Driver.AlertMsg();
   }
   public static void AllertMessg(){
       Assert.assertEquals("Are you sure you want to pay at arrival?",driver.switchTo().alert().getText());
   }
   public static void ReservMSG(){
       SeleniumUtils.sleep(2000);
       Assert.assertEquals(BookingPage.StatusMsg.getText(), "Your booking status is Reserved");

   }

}
