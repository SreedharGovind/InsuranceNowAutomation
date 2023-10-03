package com.smartims.insurancepractice.insurancenow.testscenario03;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AllTransactions_03 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();

        Actions actions = new Actions(driver);
//        NewBusiness_03 nb = new NewBusiness_03();
//        nb.getNewBussines(driver);
//        CancellationNotice_03 cn = new CancellationNotice_03();
//        cn.cancellationNotice(driver);
//        TestCase_06 tc = new TestCase_06();
//        tc.testCase_06(new ChromeDriver());
        BatchJob_03 b = new BatchJob_03();
        b.batchJob(new ChromeDriver());
    }

}
