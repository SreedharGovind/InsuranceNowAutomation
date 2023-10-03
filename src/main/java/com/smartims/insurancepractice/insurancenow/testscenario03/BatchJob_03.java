package com.smartims.insurancepractice.insurancenow.testscenario03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BatchJob_03 {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(co);


        Actions actions = new Actions(driver);

        driver.manage().window().maximize();

        driver.get("http://localhost:8080/innovation");
        WebElement BatchJob = driver.findElement(By.id("Menu_Operations"));
        actions.moveToElement(BatchJob).perform();
        driver.findElement(By.id("Menu_Operations_BatchJobs")).click();
        driver.findElement(By.id("DailyManual")).click();
        driver.findElement(By.id("Question_RunDt")).sendKeys("09/29/2023");
        driver.findElement(By.id("Question_InceptionDt")).sendKeys("09/29/2023");
        driver.findElement(By.id("SkipAll")).click();
        driver.findElement(By.id("Skip_ActionARCycle")).click();
        driver.findElement(By.id("Skip_ActionTaskSystem")).click();
        driver.findElement(By.id("StartJobAction")).click();
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();


    }


}
