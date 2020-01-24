package pages;

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


    @FindBy(xpath = "(//input[@id='rate'])[1]")
    public static WebElement Percentage;

    @FindBy(xpath = "(//input[@id='max'])[1]")
    public static WebElement MaxUses;

    @FindBy(xpath = "(//input[@name='startdate'])[1]")
    public static WebElement StartDate;

    @FindBy(xpath = "(//input[@name='expdate'])[1]")
    public static WebElement ExpDate;
}
