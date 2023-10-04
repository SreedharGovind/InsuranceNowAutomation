package com.smartims.insurancepractice.insurancenow.testScenario02.testCase_04;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class CustomerCreation_04 {

    void getCustomerCreation(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

        Actions action = new Actions(driver);
        WebElement customer = driver.findElement(By.xpath(ConstantsClass.menuPolicyButton));
        action.moveToElement(customer).perform();
        driver.findElement(By.id(ConstantsClass.menuPolicyNewCustomerAndQuote)).click();
        driver.findElement(By.id(ConstantsClass.newCustomerEntityTypeCode)).sendKeys("Individual");
        driver.findElement(By.id(ConstantsClass.newCustomerGivenName)).sendKeys("Ben");
        driver.findElement(By.id(ConstantsClass.newCustomerSurname)).sendKeys("Stocks");
        driver.findElement(By.id(ConstantsClass.newCustomerDateOfBirth)).sendKeys("07/09/2000");
        driver.findElement(By.id(ConstantsClass.newCustomerResetCommercialName)).click();
        driver.findElement(By.id(ConstantsClass.newCustomerResetIndexName)).click();
        driver.findElement(By.id(ConstantsClass.newCustomerAddressPrimaryNumber)).sendKeys("882");
        driver.findElement(By.id(ConstantsClass.newCustomerAddressStreetName)).sendKeys("Main");
        driver.findElement(By.id(ConstantsClass.newCustomerCity)).sendKeys("Wolfforth");
        driver.findElement(By.id(ConstantsClass.newCustomerState)).sendKeys("Texas");
        driver.findElement(By.id(ConstantsClass.newCustomerPostalCode)).sendKeys("79382");
        driver.findElement(By.id(ConstantsClass.newCustomerAddressVerifyingImg)).click();
        driver.findElement(By.id(ConstantsClass.newCustomerDefaultAddress)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(ConstantsClass.copyMailingAddress)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(ConstantsClass.newCustomerPrimaryPhoneName)).sendKeys("Mobile");
        driver.findElement(By.id(ConstantsClass.newCustomerPrimaryPhoneNumber)).sendKeys("12446678");
        driver.findElement(By.id(ConstantsClass.newCustomerEmailAddress)).sendKeys("Email@gmail.com");
        driver.findElement(By.id(ConstantsClass.newCustomerBestWayToContact)).sendKeys("Email");
        driver.findElement(By.id(ConstantsClass.newCustomerBestTimeToContact)).sendKeys("Morning");
        driver.findElement(By.xpath(ConstantsClass.saveButton)).click();
        driver.findElement(By.xpath(ConstantsClass.saveAndQuoteButton)).click();


    }
}
