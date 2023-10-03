package com.smartims.insurancepractice.insurancenow.testscenario04;
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
public class CancellationNotice_04 {
        public void getcancellationNotice(ChromeDriver driver) throws IOException {
            Actions actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(Constants_04.localHostUrl);
            CredentialsVO cvo = new CredentialsVO();
            CancellationNoticeVO cno = new CancellationNoticeVO();

            cno.setCancellationNoticeNoticeDate(ExcelUtils_04.getCellValueByLabel("cancellationNoticeNoticeDate"));
            cno.setCancellationNoticeCancellationType(ExcelUtils_04.getCellValueByLabel("cancellationNoticeCancellationType"));
            cno.setCancellationNoticeAdditionalNoticeText(ExcelUtils_04.getCellValueByLabel("cancellationNoticeAdditionalNoticeText"));
            cno.setCancellationNoticeReason(ExcelUtils_04.getCellValueByLabel("cancellationNoticeReason"));
            cno.setCancellationNoticeStartTransaction(ExcelUtils_04.getCellValueByLabel("cancellationNoticeStartTransaction"));
            cno.setCancellationNoticeEffectiveDate(ExcelUtils_04.getCellValueByLabel("cancellationNoticeEffectiveDate"));
            cno.setCancellationNoticeDescription(ExcelUtils_04.getCellValueByLabel("cancellationNoticeDescription"));

            WebElement policyTab = driver.findElement(By.xpath(Constants_04.policySearchTab));
            actions.moveToElement(policyTab).perform();
            policyTab.click();
            driver.findElement(By.xpath(Constants_04.policyNumberTextField)).sendKeys("PA0000010-01");
            WebElement searchButton = driver.findElement(By.xpath(Constants_04.searchButton));
            actions.moveToElement(searchButton).perform();
            searchButton.click();
            driver.findElement(By.xpath(Constants_04.startTransactionButton)).click();
            Select transaction = new Select(driver.findElement(By.xpath(Constants_04.startNewTransaction)));
            transaction.selectByValue("Cancellation Notice");
//        driver.findElement(By.xpath(Constants_03.startTransactionButton)).click();
//        Select transaction = new Select(driver.findElement(By.xpath(Constants_03.startNewTransaction)));
//        transaction.selectByValue("Cancellation");
            driver.findElement(By.xpath(Constants_04.selectButton)).click();
            driver.findElement(By.xpath(Constants_04.cancellationNoticeDate)).sendKeys(cno.getCancellationNoticeNoticeDate(), Keys.TAB);
            driver.findElement(By.xpath(Constants_04.cancellationType)).click();
            Select cancellationType = new Select(driver.findElement(By.xpath(Constants_04.cancellationType)));
            cancellationType.selectByValue("Insured");
            driver.findElement(By.xpath(Constants_04.additionalNoticeText)).sendKeys(cno.getCancellationNoticeAdditionalNoticeText(), Keys.TAB);
            driver.findElement(By.xpath(Constants_04.startButton)).click();
            driver.findElement(By.xpath(Constants_04.processButton)).click();
        }
    }





