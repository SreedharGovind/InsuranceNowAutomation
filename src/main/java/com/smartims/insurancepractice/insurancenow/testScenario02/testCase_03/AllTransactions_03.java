package com.smartims.insurancepractice.insurancenow.testScenario02.testCase_03;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class AllTransactions_03 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        // Create new Account
        NewBusiness_03 nb = new NewBusiness_03();
        nb.newBusiness_03(driver, actions);

        ChromeDriver driver1 = CommonClass.getchromedriver();
        Endorsement_03 en = new Endorsement_03();
        en.endorsement_03(driver1, actions);
    }
}
