package com.smartims.insurancepractice.insurancenow.testScenario01.testcase02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class CustomerCreation_02 {
    public void getCutomerCreation(ChromeDriver driver) throws IOException,InterruptedException{

        Actions action = new Actions(driver);
        WebElement customer =driver.findElement(By.xpath("//*[@id=\"Menu_Policy\"]"));
        action.moveToElement(customer).perform();
        driver.findElement(By.id("Menu_Policy_NewCustomerAndQuote")).click();
        driver.findElement(By.id("Customer.EntityTypeCd")).sendKeys("Individual");
        driver.findElement(By.id("CustomerName.GivenName")).sendKeys("Ben");
        driver.findElement(By.id("CustomerName.Surname")).sendKeys("Stocks");
        driver.findElement(By.id("CustomerPersonal.BirthDt")).sendKeys("07/09/2000");
        driver.findElement(By.id("ResetCommercialName")).click();
        driver.findElement(By.id("ResetIndexName")).click();
        driver.findElement(By.id("CustomerLookupAddr.PrimaryNumber")).sendKeys("882");
        driver.findElement(By.id("CustomerLookupAddr.StreetName")).sendKeys("Main");
        driver.findElement(By.id("CustomerLookupAddr.City")).sendKeys("Wolfforth");
        driver.findElement(By.id("CustomerLookupAddr.StateProvCd")).sendKeys("Texas");
        driver.findElement(By.id("CustomerLookupAddr.PostalCode")).sendKeys("79382");
        driver.findElement(By.id("CustomerLookupAddr.addrVerifyImg")).click();
        driver.findElement(By.id("DefaultAddress")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("CopyAddress")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("CustomerPhonePrimary.PhoneName")).sendKeys("Mobile");
        driver.findElement(By.id("CustomerPhonePrimary.PhoneNumber")).sendKeys("12446678");
        driver.findElement(By.id("CustomerEmail.EmailAddr")).sendKeys("Email@gmail.com");
        driver.findElement(By.id("CustomerPersonal.BestWayToContact")).sendKeys("Email");
        driver.findElement(By.id("CustomerPersonal.BestTimeToContact")).sendKeys("Morning");
        driver.findElement(By.id("Save")).click();
//        New quote from Customer
        driver.findElement(By.xpath("//*[@id=\"SaveAndQuote\"]/span")).click();
        driver.findElement(By.id("BasicPolicy.ControllingStateCd")).sendKeys("Texas");
        driver.findElement(By.id("BasicPolicy.EffectiveDt")).sendKeys("09/11/2023");
        driver.findElement(By.id("BasicPolicy.ProgramType")).sendKeys("Texas Ranger");
        driver.findElement(By.id("Continue")).click();
        driver.findElement(By.id("ProviderNumber")).sendKeys("QATeam");
        driver.findElement(By.id(ConstantsClass.continueButton)).click();
        driver.findElement(By.id("BasicPolicy.NoLapse")).sendKeys("No");
        driver.findElement(By.id("BasicPolicy.UninsuredMoreThanThirtyDays")).sendKeys("No");
    }
}
