package pages.AdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class CouponPage {
    private static WebDriver driver = Driver.getDriver();
    public CouponPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[.=' Add']")
    public static WebElement Add_Btn;
    @FindBy(xpath = "(//input[@id='rate'])[1]")
    public static WebElement Percentage;
    @FindBy(xpath = "(//input[@id='max'])[1]")
    public static WebElement MaxUses;
    @FindBy(xpath = "(//input[@name='startdate'])[1]")
    public static WebElement StartDate;
    @FindBy(xpath = "(//td[@class='day  active'])[1]")
    public static WebElement St_click;
    @FindBy(xpath = "(//input[@name='expdate'])[1]")
    public static WebElement Exp_click;
    @FindBy(xpath = "(//input[@value='tours'])[1]")
    public static WebElement allTours;
    @FindBy(xpath = "(//input[@value='cars'])[1]")
    public static WebElement allCars;
    @FindBy(xpath = "//input[@id='codeadd']")
    public static WebElement couponNum;
    @FindBy(xpath = "//button[@id='add']")
    public static WebElement Creat_Btn;
    @FindBy(xpath = "//button[@class='btn btn-primary submitcoupon']")
    public static WebElement Submit_Btn;
}
