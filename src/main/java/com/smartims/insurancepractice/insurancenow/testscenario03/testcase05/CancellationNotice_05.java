package com.smartims.insurancepractice.insurancenow.testscenario03.testcase05;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import com.smartims.insurancepractice.insurancenow.testscenario03.Constants_03;
import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class CancellationNotice_05 {

    public void cancellationNotice(ChromeDriver driver) {

        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        CredentialsVO cvo = new CredentialsVO();

        WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));

        actions.moveToElement(policyTab).perform();

        policyTab.click();

        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000025-01");

        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));

        actions.moveToElement(searchButton).perform();

        searchButton.click();

        driver.findElement(By.xpath(Constants_03.startTransactionButton)).click();

        Select transaction = new Select(driver.findElement(By.xpath(Constants_03.startNewTransaction)));

        transaction.selectByValue("Cancellation Notice");
//        driver.findElement(By.xpath(Constants_03.startTransactionButton)).click();
//        Select transaction = new Select(driver.findElement(By.xpath(Constants_03.startNewTransaction)));
//        transaction.selectByValue("Cancellation");
        driver.findElement(By.xpath(Constants_03.selectButton)).click();
        driver.findElement(By.xpath(Constants_03.cancellationNoticeDate)).sendKeys("09/23/2023");
        driver.findElement(By.xpath(Constants_03.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(Constants_03.cancellationType)));
        cancellationType.selectByValue("Insured");
        driver.findElement(By.xpath(Constants_03.additionalNoticeText)).sendKeys("Cancellation Notice Transaction");
        driver.findElement(By.xpath(Constants_03.startButton)).click();
        driver.findElement(By.xpath(Constants_03.processButton)).click();
    }
}



