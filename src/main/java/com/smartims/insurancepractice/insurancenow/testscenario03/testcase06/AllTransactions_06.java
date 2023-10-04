package com.smartims.insurancepractice.insurancenow.testscenario03.testcase06;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTransactions_06 {

    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();

        NewBusiness_06 nb = new NewBusiness_06();
        nb.getNewBussines(driver);

        ChromeDriver driver1 = CommonClass.getchromedriver();

        Payment_06 tc = new Payment_06();
        tc.testCase_06(driver1);

        ChromeDriver driver2 = CommonClass.getchromedriver();

        BatchJob_06 b = new BatchJob_06();
        b.batchJob(driver2);
    }
}