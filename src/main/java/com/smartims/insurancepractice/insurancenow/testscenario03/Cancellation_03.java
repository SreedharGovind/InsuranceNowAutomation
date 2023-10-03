package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class Cancellation_03 {
    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(co);

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

        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000010-01");

        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));

        actions.moveToElement(searchButton).perform();

        searchButton.click();
        Thread.sleep(2000);
//        WebElement BillingTab = driver.findElement(By.id(Constants_03.billingTabId));
//
//        actions.moveToElement(BillingTab).perform();
//
//        policyTab.click();
        driver.findElement(By.id(Constants_03.billingTabId)).click();
        WebElement AdminTAb = driver.findElement(By.id(Constants_03.adminTabId));

        actions.moveToElement(AdminTAb).perform();

        policyTab.click();
        Thread.sleep(2000);
        driver.findElement(By.id(Constants_03.changeDateId)).click();
        WebElement ChangeDate = driver.findElement(By.id(Constants_03.changeDateId));
        actions.moveToElement(ChangeDate).perform();
        policyTab.click();
    }}