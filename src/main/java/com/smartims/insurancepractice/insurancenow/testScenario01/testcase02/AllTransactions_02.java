package com.smartims.insurancepractice.insurancenow.testScenario01.testcase02;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTransactions_02 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();
        NewBusiness_NewCustomer_02 nbe = new NewBusiness_NewCustomer_02();
        nbe.getNewBusiness_ExistingCustomer(driver);
    }
}
