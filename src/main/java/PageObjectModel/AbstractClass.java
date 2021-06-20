package PageObjectModel;

import Drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

public class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);


    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void click(WebElement clickEl){

        wait.until(ExpectedConditions.elementToBeClickable(clickEl));

        clickEl.click();
    }


    public void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);
    }

    public void selectByVisibleText(WebElement selectElement,String value){
        //Select slc = new Select(dropdown);
        Select se = new Select(selectElement);
        //wait.until(ExpectedConditions.visibilityOf(selectElement));
        //slct.selectByVisibleText(value);
        se.selectByValue(value);
        //selectByVisibleText(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element){

        Select slc = new Select(dropdown);

        slc.selectByVisibleText(element);

    }
    public void selectElementFromD(WebElement dropdown,String element){

        Select slc = new Select(dropdown);

        slc.selectByVisibleText(element);

    }



    public void Assertion(WebElement actual,String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message :  " + actual.getText());


    }

    public void AssertTitle(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(driver.getTitle(),expected);
        System.out.println("Page Title :  " + driver.getTitle());


    }

    public void PageMessageGet(String expected){
        //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(  driver.switchTo().alert().getText(),expected);
        System.out.println("Page Message :  " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }






}
