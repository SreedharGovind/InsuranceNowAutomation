package com.smartims.insurancepractice.insurancenow.testscenario03;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
//import com.smartims.insurancepractice.insurancenow.testscenario01.NewBusiness_01;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllTransactions_03 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver= CommonClass.getchromedriver();

        NewBusiness_03 nb = new NewBusiness_03();
        nb.getNewBussines(driver);
        CancellationNotice_03 cn= new CancellationNotice_03 ();
        cn.cancellationNotice(driver);
    }

}
