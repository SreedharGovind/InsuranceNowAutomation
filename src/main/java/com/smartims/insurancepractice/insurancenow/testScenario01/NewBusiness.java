package com.smartims.insurancepractice.insurancenow.testScenario01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewBusiness {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/innovation");

        try {
            driver.findElement(By.id("j_username")).sendKeys("admin");
            driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);
            //Quote Creation
            driver.findElement(By.xpath("//*[@id=\"QuickAction_NewQuote_Holder\"]/span")).click();
            Select statecd = new Select(driver.findElement(By.xpath("/html/body/main/form/div[1]/aside[2]/div[1]/div/div[3]/div[2]/select")));
            statecd.selectByVisibleText("Texas");
            driver.findElement(By.name("QuickAction_EffectiveDt")).sendKeys("11/09/2023");
            driver.findElement(By.id("QuickAction_ProgramType")).sendKeys("Texas Ranger");
            driver.findElement(By.xpath("//*[@id=\"QuickAction_NewQuote\"]")).click();
            driver.findElement(By.id("Continue")).click();
            Thread.sleep(100);
            driver.findElement(By.id("ProviderNumber")).sendKeys("QATeam");
            driver.findElement(By.id("ProducerLookup")).click();
            driver.findElement(By.name("BasicPolicy.NoLapse")).sendKeys("No");
            driver.findElement(By.name("BasicPolicy.UninsuredMoreThanThirtyDays")).sendKeys("No");

//        Insured information
            driver.findElement(By.name("Insured.EntityTypeCd")).sendKeys("Insured.EntityTypeCd");
            driver.findElement(By.name("InsuredName.GivenName")).sendKeys("Harish");
            driver.findElement(By.name("InsuredName.Surname")).sendKeys("Gouru");
            driver.findElement(By.id("ResetCommercialName")).click();
            driver.findElement(By.name("InsuredPersonal.BirthDt")).sendKeys("12/02/1999");

//        Mailing address
            driver.findElement(By.name("InsuredMailingAddr.Addr1")).sendKeys("1019 Clay Ave");
            driver.findElement(By.name("InsuredMailingAddr.City")).sendKeys("Scranton");
            driver.findElement(By.name("InsuredMailingAddr.PostalCode")).sendKeys("18510");
            driver.findElement(By.name("InsuredMailingAddr.StateProvCd")).sendKeys("Pennsylvania(PA)");
            driver.findElement(By.id("InsuredMailingAddr.addrVerifyImg")).click();

//        Contant
            driver.findElement(By.name("InsuredEmail.EmailAddr")).sendKeys("Email@gmail.com");
            driver.findElement(By.name("InsuredPersonal.BestWayToContact")).sendKeys("Email");
            driver.findElement(By.name("InsuredPersonal.BestTimeToContact")).sendKeys("Morning");
            driver.findElement(By.id("NextPage_Bottom")).click();
//            Selecting the new customer
            driver.findElement(By.id("QuoteCustomerClearingRef_4")).click();

//        Automobile Policy General Screen
            driver.findElement(By.name("Line.BILimit")).sendKeys("$40,000/$80,000");
            driver.findElement(By.name("Line.PDLimit")).sendKeys("$35,000");
            driver.findElement(By.name("Line.MedPayLimit")).sendKeys("$1,000");
            driver.findElement(By.name("Line.PIPLimit")).sendKeys("Reject");
            driver.findElement(By.name("Line.UMUILimit")).sendKeys("Reject");
            driver.findElement(By.name("Line.UMUIPDLimit")).sendKeys("Reject");
            driver.findElement(By.name("Line.HomeownersDiscountInd")).sendKeys("No");
            driver.findElement(By.id("NextPage_Bottom")).click();

//        Adding Driver 0r driver details
            driver.findElement(By.id("AddDriver")).click();
            driver.findElement(By.name("NameInfo.GivenName")).sendKeys("Harish");
            driver.findElement(By.name("NameInfo.Surname")).sendKeys("Gouru");
            driver.findElement(By.name("DriverInfo.RelationshipToInsuredCd")).sendKeys("Self");
            driver.findElement(By.name("DriverInfo.DriverStatusCd")).sendKeys("Principal");
            driver.findElement(By.name("PersonInfo.BirthDt")).sendKeys("12/02/1988");
            driver.findElement(By.name("PersonInfo.GenderCd")).sendKeys("Male");
            driver.findElement(By.name("PersonInfo.MaritalStatusCd")).sendKeys("Single");
            driver.findElement(By.name("DriverInfo.LicenseDt")).sendKeys("12/02/2015");
            driver.findElement(By.id("DriverInfo.LicenseNumber")).sendKeys("12345687");
            driver.findElement(By.name("DriverInfo.LicenseStatus")).sendKeys("Valid");
            driver.findElement(By.name("DriverInfo.SR22")).sendKeys("No");
            driver.findElement(By.name("DriverInfo.ScholasticDiscountInd")).sendKeys("No");

//        employee details
            driver.findElement(By.name("PersonInfo.OccupationStatus")).sendKeys("Unemployed");
            driver.findElement(By.id("NextPage_Bottom")).click();
            driver.findElement(By.id("Navigate_AddRisk_PrivatePassengerAuto")).click();

//        Adding vechile
            driver.findElement(By.name("Vehicle.VehIdentificationNumber")).sendKeys("WAUDGAFL6DA095049");
            driver.findElement(By.id("ValidateVIN")).click();
            Thread.sleep(10000);
            // In use
            driver.findElement(By.name("Vehicle.VehUseCd")).sendKeys("To and From Work");
            driver.findElement(By.name("Vehicle.LeasedVehInd")).sendKeys("Owned");
//            driver.findElement(By.name("Vehicle.OOSCommuterSurchargeInd")).sendKeys("No");

            //Coverages
            driver.findElement(By.name("Vehicle.OtherThanCollisionDed")).sendKeys("No Coverage");
            driver.findElement(By.name("Vehicle.CollisionDed")).sendKeys("No Coverage");
            driver.findElement(By.name("Vehicle.RentalReimbursementLimit")).sendKeys("None");
            driver.findElement(By.name("Vehicle.TowingLaborLimit")).sendKeys("None");
            driver.findElement(By.name("Vehicle.SpecialEquipmentLimit")).sendKeys("None");
            driver.findElement(By.id("NextPage_Bottom")).click();

            //Billing
            driver.findElement(By.id("NextPage_Bottom")).click();
            driver.findElement(By.id("BasicPolicy.PayPlanCd_1")).click();
//            driver.findElement(By.id("QuoteCustomerClearingRef_3")).click();
            driver.findElement(By.xpath("//*[@id=\"Bind\"]/span")).click();
            driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div/div[1]/div/div/div/div[3]/a/span")).click();
            driver.findElement(By.id("BasicPolicy.BillingAddressVerificationInd")).click();
            driver.findElement(By.id("NextPage")).click();
//     Underwritting reasons
//            driver.findElement(By.id("Question_OutsidePA")).sendKeys("No");
            driver.findElement(By.id("Question_ProperLicense")).sendKeys("No");
            driver.findElement(By.id("Question_PossibleDriver")).sendKeys("No");
            driver.findElement(By.id("Question_DriverConviction")).sendKeys("No");
            driver.findElement(By.id("Question_HouseholdResident")).sendKeys("No");
            driver.findElement(By.id("Question_ExcludedSpouse")).sendKeys("No");
            driver.findElement(By.id("Question_BusinessVehicle")).sendKeys("No");
            driver.findElement(By.id("Question_ExistingDamage")).sendKeys("No");
            driver.findElement(By.id("Question_DifferentAddress")).sendKeys("No");
            driver.findElement(By.id("Question_SpecialEquipment")).sendKeys("No");
            driver.findElement(By.id("Question_OtherVehicle")).sendKeys("No");
            driver.findElement(By.id("Question_TitledVehicle")).sendKeys("No");
            driver.findElement(By.id("Question_DriverViolation")).sendKeys("No");
            driver.findElement(By.id("Question_DriverCondition")).sendKeys("No");
            driver.findElement(By.id("Question_VehicleModification")).sendKeys("No");
            driver.findElement(By.id("Question_LiveryVehicle")).sendKeys("No");
            driver.findElement(By.xpath("//*[@id=\"Closeout\"]/span")).click();

//        Payment close out screen
            driver.findElement(By.id("TransactionInfo.PaymentTypeCd")).sendKeys("None");

//        Issue the Bussiness
            driver.findElement(By.xpath("//*[@id=\"Process\"]/span")).click();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
