package com.smartims.insurancepractice.insurancenow.testScenario05.testcase09;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTranasaction_09 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();
        RenewalTransaction09 rs = new RenewalTransaction09();
        rs.getRenewalStart(driver);
    }
}
