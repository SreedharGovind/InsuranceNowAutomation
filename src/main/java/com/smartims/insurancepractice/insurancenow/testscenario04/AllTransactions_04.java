package com.smartims.insurancepractice.insurancenow.testscenario04;
import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AllTransactions_04 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        NewBusiness_04 nb = new NewBusiness_04();
        nb.getNewBussines(driver);

        CancellationNotice_04 cn = new CancellationNotice_04();
        cn.getcancellationNotice(driver);

        Cancellation_04 cncl = new Cancellation_04();
        cncl.getcancellation(driver);

        Reinstatement_04 rb = new Reinstatement_04();
        rb.getReinstatement(driver);






    }
    }



