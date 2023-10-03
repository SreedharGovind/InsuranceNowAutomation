package com.smartims.insurancepractice.insurancenow.testscenario03.testcase06;

import com.smartims.insurancepractice.insurancenow.testscenario03.Constants_03;
import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BatchJob_06 {
    public void batchJob(ChromeDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get(Constants_03.localHostUrl);

        CredentialsVO cvo = new CredentialsVO();

        driver.findElement(By.id("j_username")).sendKeys("admin");

        driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);
        Actions actions = new Actions(driver);
        WebElement BatchJob = driver.findElement(By.id("Menu_Operations"));
        actions.moveToElement(BatchJob).perform();
        driver.findElement(By.id("Menu_Operations_BatchJobs")).click();
        driver.findElement(By.id("DailyManual")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Question_RunDt")).sendKeys("10/05/2023");
        driver.findElement(By.id("Question_InceptionDt")).sendKeys("10/05/2023");
        driver.findElement(By.id("SkipAll")).click();
        driver.findElement(By.id("Skip_ActionARCycle")).click();
        driver.findElement(By.id("Skip_ActionTaskSystem")).click();
        driver.findElement(By.id("StartJobAction")).click();
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();


    }


}
