package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class AllTransactions_TS02 {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        // Create new Account
//        NewBusiness_TS02 nb = new NewBusiness_TS02();
//        nb.newBusiness_TS02(driver, actions);
    }
}
