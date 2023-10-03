package com.smartims.insurancepractice.insurancenow.testScenario01;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import com.smartims.insurancepractice.insurancenow.testscenario01.NewBusiness_01;
import org.openqa.selenium.chrome.ChromeDriver;



public class AllTransactions {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver= CommonClass.getchromedriver();
        NewBusiness_01 nb = new NewBusiness_01();
        nb.getNewBussines(driver);
//        CustomerCreation cc = new CustomerCreation();
//        cc.getCutomerCreation(driver);
//
//        NewBusiness_ExistingCustomer nbe = new NewBusiness_ExistingCustomer();
//        nbe.getNewBusiness_ExistingCustomer(driver);

    }


}
