package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cancellation {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);


        Actions actions = new Actions(driver);
        //Bala
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/innovation");

        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);

        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000002-01");
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Cancellation");

        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();

        driver.findElement(By.xpath(ConstantsClass.cancellationNoticeDate)).sendKeys("09/23/2023");
        driver.findElement(By.xpath(ConstantsClass.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(ConstantsClass.cancellationType)));
        cancellationType.selectByValue("Insured");
        driver.findElement(By.xpath(ConstantsClass.additionalNoticeText)).sendKeys("Cancellation Notice Transaction");

        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.xpath(ConstantsClass.processButton)).click();


    }
}
