package com.smartims.insurancepractice.insurancenow.testscenario03.testcase06;

import com.smartims.insurancepractice.insurancenow.testscenario03.Constants_03;

import com.smartims.insurancepractice.insurancenow.testscenario03.ExcelUtils_03;

import com.smartims.insurancepractice.insurancenow.voClasses.PaymentVO;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


import java.io.IOException;

import java.time.Duration;


public class Payment_06 {

    public void testCase_06(ChromeDriver driver) throws InterruptedException, IOException {

        Actions actions = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        PaymentVO pvo = new PaymentVO();

        pvo.setPaymentScreenPolicyNumber(ExcelUtils_03.getCellValueByLabel("paymentScreenPolicyNumber"));
        pvo.setPaymentScreenPremiumAmount(ExcelUtils_03.getCellValueByLabel("paymentScreenPremiumAmount"));

        pvo.setPaymentScreenBankAccountEntryType(ExcelUtils_03.getCellValueByLabel("paymentScreenBankAccountEntryType"));

        pvo.setPaymentScreenBankAccountType(ExcelUtils_03.getCellValueByLabel("paymentScreenBankAccountType"));

        pvo.setPaymentScreenAccountNumber(ExcelUtils_03.getCellValueByLabel("paymentScreenAccountNumber"));

        pvo.setPaymentScreenRoutingNumber(ExcelUtils_03.getCellValueByLabel("paymentScreenRoutingNumber"));

        pvo.setPaymentScreenName(ExcelUtils_03.getCellValueByLabel("paymentScreenName"));

        WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));

        actions.moveToElement(policyTab).perform();

        policyTab.click();

        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys(pvo.getPaymentScreenPolicyNumber());

        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));

        actions.moveToElement(searchButton).perform();

        searchButton.click();

        driver.findElement(By.xpath(Constants_03.makePayment)).click();

        driver.findElement(By.id(Constants_03.pay)).click();

        driver.findElement(By.id(Constants_03.newACH)).click();

        driver.findElement(By.id(Constants_03.newPremiumAmount)).sendKeys(pvo.getPaymentScreenPremiumAmount(), Keys.TAB);

        driver.findElement(By.id(Constants_03.bankAccountEntryType)).sendKeys(pvo.getPaymentScreenBankAccountEntryType(), Keys.TAB);

        driver.findElement(By.id(Constants_03.bankAccountType)).sendKeys(pvo.getPaymentScreenBankAccountType());

        driver.findElement(By.id(Constants_03.accountNumber)).sendKeys(pvo.getPaymentScreenAccountNumber());

        driver.findElement(By.id(Constants_03.routingNumber)).sendKeys(pvo.getPaymentScreenRoutingNumber());

        driver.findElement(By.id(Constants_03.achName)).sendKeys(pvo.getPaymentScreenName());

        driver.findElement(By.xpath(Constants_03.submitPaymentButton)).click();

        driver.findElement(By.id(Constants_03.submitPaymentOk)).click();

    }

}
