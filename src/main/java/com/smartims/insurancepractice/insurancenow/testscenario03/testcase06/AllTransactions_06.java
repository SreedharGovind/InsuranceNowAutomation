package com.smartims.insurancepractice.insurancenow.testscenario03.testcase06;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTransactions_06 {

    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();
        NewBusiness_06 nb = new NewBusiness_06();
        nb.getNewBussines(driver);

        Payment_06 tc = new Payment_06();
        tc.testCase_06(driver);

        BatchJob_06 b = new BatchJob_06();
        b.batchJob( driver);
    }
}