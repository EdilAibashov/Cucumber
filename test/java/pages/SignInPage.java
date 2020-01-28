package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class SignInPage {
    private static WebDriver driver = Driver.getDriver();
    public SignInPage(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[@class='login']")
    public  WebElement SignIn_Btn;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement Creat_Btn;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement Email_Ctnr;

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    public WebElement Mr_Btn;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement Passwd;

    @FindBy(xpath = "//div[@id='uniform-days']")
    public WebElement Day_Btn;

    @FindBy(xpath = "(//option[@value='16'])[1]")
    public  WebElement date;

    @FindBy(xpath = "//div[@id='uniform-months']")
    public WebElement Month_Btn;

    @FindBy(xpath = "(//option[@value='2'])[2]")
    public WebElement month;

    @FindBy(xpath = "//div[@id='uniform-years']")
    public WebElement Years_Btn;

    @FindBy(xpath = "//option[@value='1991']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement FirstN;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastN;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement Compani;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement Address;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement Address2;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement City;

    @FindBy(xpath = "//div[@id='uniform-id_state']")
    public WebElement State_Btn;

    @FindBy(xpath = "//option[.='Virginia']")
    public WebElement State;


    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    public WebElement MPhone;

    @FindBy(xpath = "//input[@id='alias']")
    public WebElement Alias;

    @FindBy(xpath = "//button[@id='submitAccount']")
    public WebElement Submit_Btn;

    @FindBy(xpath = "//a[@title='View my customer account']")
    public WebElement Verify;








}
