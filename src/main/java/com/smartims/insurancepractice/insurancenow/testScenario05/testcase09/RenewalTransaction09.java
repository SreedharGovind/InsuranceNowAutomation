package com.smartims.insurancepractice.insurancenow.testScenario05.testcase09;

import com.smartims.insurancepractice.insurancenow.voClasses.RenewalStartVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class RenewalTransaction09 {
    public void getRenewalStart(ChromeDriver driver) throws IOException, InterruptedException {
        RenewalStartVO rsvo = new RenewalStartVO();
        rsvo.setRenewalPolicyNumber(ExcelUtils_05.getCellValueByLabel("renewalPolicyNumber"));
        rsvo.setrenewalStartTransaction(ExcelUtils_05.getCellValueByLabel("renewalStartTransaction"));
        rsvo.setRenewalStartDescription(ExcelUtils_05.getCellValueByLabel("renewalStartDescription"));

        driver.findElement(By.id(Constant_Renewal.renewalPolicyNumber)).sendKeys(rsvo.getRenewalPolicyNumber());
        driver.findElement(By.id(Constant_Renewal.renewalToolbarSearch)).click();
        driver.findElement(By.id(Constant_Renewal.renewalTransaction)).click();
        driver.findElement(By.id(Constant_Renewal.renewalStartTransaction)).sendKeys(rsvo.getrenewalStartTransaction());
        driver.findElement(By.id(Constant_Renewal.renewalStartSelect)).click();
        driver.findElement(By.id(Constant_Renewal.renewalStartTransactionLongDescription)).sendKeys(rsvo.getRenewalStartDescription());
        driver.findElement(By.id(Constant_Renewal.renewalStart)).click();
        driver.findElement(By.id(Constant_Renewal.renewalStartFinesh)).click();
        driver.findElement(By.id(Constant_Renewal.renewalStartProcess)).click();
    }
}
