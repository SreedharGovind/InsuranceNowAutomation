package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase_06 {
    public void testCase_06(ChromeDriver driver) throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get(Constants_03.localHostUrl);

        CredentialsVO cvo = new CredentialsVO();

        driver.findElement(By.id("j_username")).sendKeys("admin");

        driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);

        WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));

        actions.moveToElement(policyTab).perform();

        policyTab.click();

        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000021-01");

        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));

        actions.moveToElement(searchButton).perform();

        searchButton.click();
        driver.findElement(By.xpath(Constants_03.makePayment)).click();
        driver.findElement(By.id(Constants_03.pay)).click();
        driver.findElement(By.id(Constants_03.newACH)).click();
        driver.findElement(By.id(Constants_03.newPremiumAmount)).sendKeys("$229.15");
        driver.findElement(By.id(Constants_03.bankAccountEntryType)).sendKeys("Personal");
        driver.findElement(By.id(Constants_03.bankAccountType)).sendKeys("Savings");
        driver.findElement(By.id(Constants_03.accountNumber)).sendKeys("1623069645");
        driver.findElement(By.id(Constants_03.routingNumber)).sendKeys("011000015");
        driver.findElement(By.id(Constants_03.achName)).sendKeys("raj");
        driver.findElement(By.xpath(Constants_03.submitPaymentButton)).click();
        driver.findElement(By.id(Constants_03.submitPaymentOk)).click();
    }
}
