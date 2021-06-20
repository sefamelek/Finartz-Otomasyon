package PageObjectModel;

import Drivers.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.mustache.Value;

import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;
public class finartzPage extends AbstractClass {

    WebDriver driver;

    public finartzPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userN;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passW;
    @FindBy(xpath = "//strong[contains(.,'4. Login')]")
    private WebElement header;
    @FindBy(css = " center > b")
    private WebElement statusM;
    @FindBy(css = " blockquote > p")
    private WebElement infoM;
    @FindBy(xpath = "//input[contains(@type,'button')]")
    private WebElement testLoginB;
    @FindBy(xpath = "//input[@value='save']")
    private WebElement saveB;


    @FindBy(id="react-autowhatever-1-section-0-item-0")
    private WebElement ChooseC1;
    @FindBy(id="DepartureDate")
    private WebElement DateB;
    @FindBy(xpath = "(//div[contains(@class,'content')])[134]")
    private WebElement DateC;
    @FindBy(id="oneWayCheckbox")
    private WebElement oneWayC;
    @FindBy(xpath = "//button[contains(.,'Ucuz bilet bul')]")
    private WebElement FindBestD;
    @FindBy(xpath = "(//span[contains(.,'Seç')])[1]")
    private WebElement ChooseF;
    @FindBy(xpath = "//input[@id='contact_email']")
    private WebElement Email;
    @FindBy(xpath = "//input[@id='contact_cellphone']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='firstName_0']")
    private WebElement FirstN;
    @FindBy(xpath = "//input[@id='lastName_0']")
    private WebElement LastN;
    @FindBy(xpath = "//select[@id='birthDateDay_0']")
    private WebElement BirtdayD;
    @FindBy(xpath = "//select[@id='birthDateMonth_0']")
    private WebElement BirtdayM;
    @FindBy(xpath = "//select[@id='birthDateYear_0']")
    private WebElement BirtdayY;
    @FindBy(xpath = "//input[@id='publicId_0']")
    private WebElement IdN;
    @FindBy(xpath = "//label[contains(.,'Erkek')]")
    private WebElement Gender;
    @FindBy(xpath = "//input[@id='healthCode_0']")
    private WebElement HealthC;
    @FindBy(xpath = "//button[contains(.,'Ödemeye ilerle')]")
    private WebElement ProceedToC;
    @FindBy(xpath = "//input[@id='cardnumber']")
    private WebElement CardN;
    @FindBy(xpath = "//select[@id='creditCardMonth']")
    private WebElement CreditCardM;
    @FindBy(xpath = "//select[@id='creditCardYear']")
    private WebElement CreditCardY;
    @FindBy(xpath = "//input[@id='cvc']")
    private WebElement CvcN;
    @FindBy(xpath = "//input[@id='cardholder']")
    private WebElement CardH;
    @FindBy(xpath = "//input[contains(@class,'accept-store-card custom-control-input')]")
    private WebElement AgreementC;
    @FindBy(xpath = "(//button[contains(.,'Satın Al')])[1]")
    private WebElement SuccessB;
    @FindBy(xpath = "//div[contains(@class,'popover-content')]")
    private WebElement PlsEnterCardN;



    public void UserN(String userName) {sendKeysFunction(userN,userName); }
    public void EMail(String EMail) { sendKeysFunction(Email, EMail); }
    public void passW(String passWord) {sendKeysFunction(passW,passWord); }
    public void checkTitle(){ AssertTitle(userN,"Login example page to test the PHP MySQL online system"); }
    public void header(){ Assertion(header,"4. Login"); }
    public void statusM(){ Assertion(statusM,"**No login attempted**"); }
    public void infoM(){ Assertion(infoM,"Enter your login details you added on the previous page and test the login.\n" +
            "The success or failure will be shown above."); }
    public void testLoginButton(){clickFunction(testLoginB);}
    public void saveButton(){click(saveB);}
    public void statusMessagesS(){ Assertion(statusM,"**Successful Login**"); }
    public void statusMessagesF(){ Assertion(statusM,"**Failed Login**"); }
    //public void pageMessageGetPassword(){ System.out.println("Page Message :  " + driver.switchTo().alert().getText());}
   public void pageMessageGetUsername(){PageMessageGet("Username too short.  The username must be at least 4 characters in length.");}
   public void pageMessageGetPassword(){PageMessageGet("Password too short.  The password must be at least 4 characters in length.");}


}
