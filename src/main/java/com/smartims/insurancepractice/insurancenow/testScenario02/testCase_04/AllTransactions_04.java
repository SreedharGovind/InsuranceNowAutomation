package com.smartims.insurancepractice.insurancenow.testScenario02.testCase_04;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class AllTransactions_04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        //Customer Creation
        CustomerCreation_04 cc = new CustomerCreation_04();
        cc.getCustomerCreation(driver, actions);
        // Create new Account
        NewBusiness_TC04 nb = new NewBusiness_TC04();
        nb.newBusiness_TC04(driver, actions);
    }
}
