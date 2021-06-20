package Steps;

import Drivers.Driver;
import PageObjectModel.finartzPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class finartzStep {

    private WebDriver driver;
    finartzPage finartzPage = new finartzPage();


    @Given("^go to add a user page" + "$")
    public void addAUser() throws Throwable {

        driver= Driver.getDriver();
        driver.get("http://thedemosite.co.uk/savedata.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Website opened.");
    }

    @And("^go to login page" + "$")
    public void gotologinpage() throws Throwable {
        driver= Driver.getDriver();
        driver.get("http://thedemosite.co.uk/login.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Website opened.");
    }

    @And ("^check tab title$")  public void CheckTitle() throws Throwable { finartzPage.checkTitle();System.out.println("tab title is checked"); }
    @And ("^check header$")  public void header() throws Throwable { finartzPage.header();System.out.println("header is checked"); }
    @And ("^check status message$")  public void statusMessage() throws Throwable { finartzPage.statusM();System.out.println("status message is checked"); }
    @And ("^check info message$")  public void infoMessage() throws Throwable { finartzPage.infoM();System.out.println("info message is checked"); }
    @And ("^input username \"([^\"]*)\"$") public void userName(String userName) throws Throwable{finartzPage.UserN(userName);System.out.println("username entered");}
    @And ("^input password \"([^\"]*)\"$") public void passWord(String passWord) throws Throwable{finartzPage.passW(passWord);System.out.println("password entered");}
    @And ("^click test login Button$") public void testLoginButton() throws Throwable {finartzPage.testLoginButton();System.out.println("clicked test login button");}
    @Then ("^click save Button$") public void saveButton() throws Throwable {finartzPage.saveButton();System.out.println("clicked save button");}

    @When ("^check status message for succesfull login$")  public void statusMessageSucces() throws Throwable { finartzPage.statusMessagesS();System.out.println("status message is checked"); }
    @When ("^check status message for failed login$")  public void statusMessageFailed() throws Throwable { finartzPage.statusMessagesF();System.out.println("status message is checked. Scenario is successful completed"); }
    @When ("^check page message short username$") public void pageMessageGetUsername() throws Throwable{finartzPage.pageMessageGetUsername();System.out.println("Username is short");}
    @When ("^check page message short password$") public void pageMessageGetPassword() throws Throwable{finartzPage.pageMessageGetPassword();System.out.println("Password is short");}
    @And ("^close chrome$") public void closeChrome() throws Throwable{driver.quit();System.out.println("Chrome Kapatıldı..");}

    @After
    public void quitDriver() throws Throwable{

        Thread.sleep(2000);

}

}
