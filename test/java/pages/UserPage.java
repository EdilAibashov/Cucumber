package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class UserPage {
    private static WebDriver driver = Driver.getDriver();
    public UserPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//div[@class='col'])[6]")
    public static WebElement featureTour;

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']")
    public static WebElement bookNow_Btn;

    @FindBy(xpath = "//input[@class='o2 coupon form-bg-light']")
    public static WebElement applyCoupon;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public static WebElement submit_Btn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public static WebElement verifyCoupon;
}
