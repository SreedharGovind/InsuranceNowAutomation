package com.smartims.insurancepractice.insurancenow.testScenario01.testcase01;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import com.smartims.insurancepractice.insurancenow.testScenario01.testcase01.NewBusiness_01;
import org.openqa.selenium.chrome.ChromeDriver;



public class AllTransactions_01 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver= CommonClass.getchromedriver();
        NewBusiness_01 nb = new NewBusiness_01();
        nb.getNewBussines(driver);

    }


}
