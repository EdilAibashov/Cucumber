package pages.AdminPages;
//Scenarios:
//        1. Login to admin page and verify title
//           login : admin@phptravels.com
//           passwd : demoadmin
//        a. Url: //phptravels.net/admin
//        b. Title: Dashboard
//        2. Navigate to Coupons page and create new coupon
//        a. Click Add
//        b. Fill following:
//        i. Enabled
//        ii. Percentage
//        iii. Max.uses
//        iv. Start date
//        v. End date
//        vi. Check All Tours, All Cars
//        vii. Input coupon code
//        viii. Click Submit
//        ix. Verify coupon is created
//        3. Navigate to user website
//        a. Verify title is "PHPTRAVELS | Travel Technology Partner"
//        4. Open any featured tour
//        a. Click Book Now
//        b. In Coupon Code field input created coupon code
//        c. Click "Enter coupon"
//        d. Verify following text is displayed
//        "10% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page." (10% comes from what we entered earlier)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class AdminPage {
    private static WebDriver driver = Driver.getDriver();


    public AdminPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public static WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block ladda-button fadeIn animated btn-lg']")
    public static WebElement signIn_Btn;
    @FindBy(xpath = "//a[.=' Coupons']")
    public static WebElement couponPage;


    public static String getTitle(){
        return driver.getTitle();
    }


}
