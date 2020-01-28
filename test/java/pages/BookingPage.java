package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BookingPage {
    private static WebDriver driver = Driver.getDriver();
    public BookingPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='col'])[6]")
    public static WebElement FirstfeatureTour;

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']")
    public static WebElement bookNow_Btn;

    @FindBy(xpath = "//input[@class='o2 coupon form-bg-light']")
    public static WebElement applyCoupon;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public static WebElement submit_Btn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public static WebElement verifyCoupon;

    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public static WebElement cookies_Btn;

    @FindBy(xpath = "(//div[@class='col'])[13]")
    public static WebElement SecondfeatureTour;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm btn-block'])[5]")
    public static WebElement LastTourPackage;

    @FindBy(xpath = "//p[.='Day Visit of Petra from Oman']")
    public static WebElement popUpPage;

    @FindBy(xpath = "//input[@name='firstname']")
    public static WebElement FullName;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public static WebElement Phone;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public static WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public static WebElement Address;

    @FindBy(xpath = "//button[@id='ClickMyButton']")
    public static WebElement Submit_Btn;

    @FindBy(xpath = "(//div[@class='content'])[1]/h4")
    public static WebElement UnpaidSign;

    @FindBy(xpath = "//button[@class='btn btn-default arrivalpay']")
    public static WebElement PayOn_Btn;

    @FindBy(xpath = "//div[@class='content']//h4")
    public static WebElement StatusMsg;


}
