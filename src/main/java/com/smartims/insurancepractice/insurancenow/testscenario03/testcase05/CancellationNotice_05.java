package com.smartims.insurancepractice.insurancenow.testscenario03.testcase05;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import com.smartims.insurancepractice.insurancenow.testscenario03.Constants_03;
import com.smartims.insurancepractice.insurancenow.testscenario03.ExcelUtils_03;
import com.smartims.insurancepractice.insurancenow.voClasses.CancellationNoticeVO;
import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class CancellationNotice_05 {
    public void getcancellationNotice(ChromeDriver driver) throws IOException {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CancellationNoticeVO cno = new CancellationNoticeVO();
        cno.setCancellationNoticeNoticeDate(ExcelUtils_03.getCellValueByLabel("cancellationNoticeNoticeDate"));
        cno.setCancellationNoticeCancellationType(ExcelUtils_03.getCellValueByLabel("cancellationNoticeCancellationType"));
        cno.setCancellationNoticeAdditionalNoticeText(ExcelUtils_03.getCellValueByLabel("cancellationNoticeAdditionalNoticeText"));
        cno.setCancellationNoticeReason(ExcelUtils_03.getCellValueByLabel("cancellationNoticeReason"));
        cno.setCancellationNoticeStartTransaction(ExcelUtils_03.getCellValueByLabel("cancellationNoticeStartTransaction"));
        cno.setCancellationNoticeEffectiveDate(ExcelUtils_03.getCellValueByLabel("cancellationNoticeEffectiveDate"));
        cno.setCancellationNoticeDescription(ExcelUtils_03.getCellValueByLabel("cancellationNoticeDescription"));

        WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000041-01");
        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(Constants_03.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(Constants_03.startNewTransaction)));
        transaction.selectByValue("Cancellation Notice");
        driver.findElement(By.xpath(Constants_03.selectButton)).click();
        driver.findElement(By.xpath(Constants_03.cancellationNoticeDate)).sendKeys(cno.getCancellationNoticeNoticeDate(), Keys.TAB);
        driver.findElement(By.xpath(Constants_03.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(Constants_03.cancellationType)));
        cancellationType.selectByValue("Insured");
        driver.findElement(By.xpath(Constants_03.additionalNoticeText)).sendKeys(cno.getCancellationNoticeAdditionalNoticeText(), Keys.TAB);
        driver.findElement(By.xpath(Constants_03.startButton)).click();
        driver.findElement(By.xpath(Constants_03.processButton)).click();
    }
}





