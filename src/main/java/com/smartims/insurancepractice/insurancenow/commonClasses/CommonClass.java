package com.smartims.insurancepractice.insurancenow.commonClasses;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;


public class CommonClass {

    public static ChromeDriver getchromedriver() throws IOException {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(co);
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/innovation");
        driver.findElement(By.id(ConstantsClass.username)).sendKeys("admin");
        driver.findElement(By.id(ConstantsClass.password)).sendKeys("Not9999!", Keys.ENTER);
return driver;
    }
}
