package com.smartims.insurancepractice.insurancenow.testscenario04;
import com.smartims.insurancepractice.insurancenow.voClasses.CancellationVO;
import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
public class Cancellation_04 {
      public void getcancellation(ChromeDriver driver) throws IOException, InterruptedException {
            Actions actions = new Actions(driver);


            CredentialsVO cvo = new CredentialsVO();
            CancellationVO clvo = new CancellationVO();

            clvo.setCancellationCancellationType(ExcelUtils_04.getCellValueByLabel("cancellationCancellationType"));
            clvo.setCancellationDescription(ExcelUtils_04.getCellValueByLabel("cancellationDescription"));
            clvo.setCancellationReason(ExcelUtils_04.getCellValueByLabel("cancellationReason"));
            clvo.setCancellationType(ExcelUtils_04.getCellValueByLabel("cancellationType"));
            clvo.setCancellationEffectiveDate(ExcelUtils_04.getCellValueByLabel("cancellationEffectiveDate"));
            clvo.setCancellationNoticeDate(ExcelUtils_04.getCellValueByLabel("cancellationNoticeDate"));
            clvo.setCancellationAdditionalNoticeText(ExcelUtils_04.getCellValueByLabel("cancellationAdditionalNoticeText"));
            clvo.setCancellationStartTransaction(ExcelUtils_04.getCellValueByLabel("cancellationStartTransaction"));

            driver.findElement(By.id("j_username")).sendKeys("admin");
            driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);
            WebElement policyTab = driver.findElement(By.xpath(Constants_04.policySearchTab));
            actions.moveToElement(policyTab).perform();
            policyTab.click();
            driver.findElement(By.xpath(Constants_04.policyNumberTextField)).sendKeys("PA0000010-01");
            WebElement searchButton = driver.findElement(By.xpath(Constants_04.searchButton));
            actions.moveToElement(searchButton).perform();
            searchButton.click();
            Thread.sleep(2000);
//        WebElement BillingTab = driver.findElement(By.id(Constants_03.billingTabId));
//
//        actions.moveToElement(BillingTab).perform();
//        policyTab.click();
            driver.findElement(By.id(Constants_04.billingTabId)).click();
            WebElement AdminTAb = driver.findElement(By.id(Constants_04.adminTabId));
            actions.moveToElement(AdminTAb).perform();
            policyTab.click();
            Thread.sleep(2000);
            driver.findElement(By.id(Constants_04.changeDateId)).click();
            WebElement ChangeDate = driver.findElement(By.id(Constants_04.changeDateId));
            actions.moveToElement(ChangeDate).perform();
            policyTab.click();
        }}

