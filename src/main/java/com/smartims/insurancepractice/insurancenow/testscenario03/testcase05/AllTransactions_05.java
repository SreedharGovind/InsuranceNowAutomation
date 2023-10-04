package com.smartims.insurancepractice.insurancenow.testscenario03.testcase05;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllTransactions_05 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();

        NewBusiness_05 nb = new NewBusiness_05();
        nb.getNewBussines(driver);


//        ChromeDriver driver1 = CommonClass.getchromedriver();

        CancellationNotice_05 cn = new CancellationNotice_05();
        cn.getcancellationNotice(driver);


    }

}
