package com.smartims.insurancepractice.insurancenow.testscenario01;
import com.smartims.insurancepractice.insurancenow.testScenario01.ExcelClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBussinesVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class NewBusiness_01 {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/innovation");
        NewBussinesVO nbvo = new NewBussinesVO();

        nbvo.setNewBusinessEffectiveDate(ExcelClass.getCellValueByLabel("newBusinessEffectiveDate"));
        nbvo.setNewBusinessState(ExcelClass.getCellValueByLabel("newBusinessState"));
        nbvo.setNewBusinessProgramType(ExcelClass.getCellValueByLabel("newBusinessProgramType"));
        nbvo.setNewBusinessProduct(ExcelClass.getCellValueByLabel("newBusinessProduct"));
        nbvo.setNewBusinessTerm(ExcelClass.getCellValueByLabel("newBusinessTerm"));
        nbvo.setNewBusinessProducerCode(ExcelClass.getCellValueByLabel("newBusinessProducerCode"));
        nbvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(ExcelClass.getCellValueByLabel("newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nbvo.setNewBusinessEntityType(ExcelClass.getCellValueByLabel("newBusinessEntityType"));
        nbvo.setNewBusinessIndividualFirst(ExcelClass.getCellValueByLabel("newBusinessIndividualFirst"));
        nbvo.setNewBusinessIndividualMiddle(ExcelClass.getCellValueByLabel("newBusinessIndividualMiddle"));
        nbvo.setNewBusinessIndividualLast(ExcelClass.getCellValueByLabel("newBusinessIndividualLast"));
        nbvo.setNewBusinessIndividualBirthDate(ExcelClass.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nbvo.setNewBusinessMailingAddress(ExcelClass.getCellValueByLabel("newBusinessMailingAddress"));
        nbvo.setNewBusinessMailingAddressCity(ExcelClass.getCellValueByLabel("newBusinessMailingAddressCity"));
        nbvo.setNewBusinessMailingAddressZip(ExcelClass.getCellValueByLabel("newBusinessMailingAddressZip"));
        nbvo.setNewBusinessMailingAddressState(ExcelClass.getCellValueByLabel("newBusinessMailingAddressState"));
        nbvo.setNewBusinessMailingAddressVerifyAddress(ExcelClass.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nbvo.setNewBusinessEmail(ExcelClass.getCellValueByLabel("newBusinessEmail"));
        nbvo.setNewBusinessBestWaytoContact(ExcelClass.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBestTimetoContact(ExcelClass.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBodilyInjuryPerPersonPerAccident(ExcelClass.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nbvo.setNewBusinessPropertyDamage(ExcelClass.getCellValueByLabel("newBusinessPropertyDamage"));
        nbvo.setNewBusinessMedicalPayments(ExcelClass.getCellValueByLabel("newBusinessMedicalPayments"));
        nbvo.setNewBusinessPersonalInjuryProtection(ExcelClass.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristBodilyInjury(ExcelClass.getCellValueByLabel("newBusinessUninsuredUnderinsuredMotoristBodilyInjury"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristPropertyDamage("newBusinessUninsuredUnderinsuredMotoristPropertyDamage");
        nbvo.setNewBusinessHomeownersDiscount(ExcelClass.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nbvo.setNewBusinessDriver1FirstName(ExcelClass.getCellValueByLabel("newBusinessDriver1FirstName"));
        nbvo.setNewBusinessDriver1LastName(ExcelClass.getCellValueByLabel("newBusinessDriver1LastName"));
        nbvo.setNewBusinessDriver1RelationshipToInsured(ExcelClass.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nbvo.setNewBusinessDriver1DriverStatus(ExcelClass.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nbvo.setNewBusinessDriver1BirthDate(ExcelClass.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nbvo.setNewBusinessDriver1Gender(ExcelClass.getCellValueByLabel("newBusinessDriver1Gender"));
        nbvo.setNewBusinessDriver1MaritalStatus(ExcelClass.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nbvo.setNewBusinessDriver1DateLicensed(ExcelClass.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nbvo.setNewBusinessDriver1LicenseNumber(ExcelClass.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nbvo.setNewBusinessDriver1LicenseState(ExcelClass.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nbvo.setNewBusinessDriver1DriversLicenseStatus(ExcelClass.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nbvo.setNewBusinessDriver1SR22(ExcelClass.getCellValueByLabel("newBusinessDriver1SR22"));
        nbvo.setNewBusinessDriver1Occupation(ExcelClass.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nbvo.setNewBusinessVehicle1VIN(ExcelClass.getCellValueByLabel("newBusinessVehicle1VIN"));
        nbvo.setNewBusinessVehicle1Use(ExcelClass.getCellValueByLabel("newBusinessVehicle1Use"));
        nbvo.setNewBusinessVehicle1PurchasedOrLeased(ExcelClass.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nbvo.setNewBusinessVehicle1OtherThanCollisionDeductible(ExcelClass.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nbvo.setNewBusinessVehicle1CollisionDeductible(ExcelClass.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nbvo.setNewBusinessVehicle1RentalReimbursement(ExcelClass.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nbvo.setNewBusinessVehicle1TowingAndLabor(ExcelClass.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nbvo.setNewBusinessVehicle1SpecialEquipment(ExcelClass.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nbvo.setNewBusinessUWQuestionsNo(ExcelClass.getCellValueByLabel("newBusinessUWQuestionsNo"));
        nbvo.setNewBusinessPaymentType(ExcelClass.getCellValueByLabel("newBusinessPaymentType"));

        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.id("j_password")).sendKeys("Not9999!", Keys.ENTER);
        //Quote Creation
        driver.findElement(By.xpath("//*[@id=\"QuickAction_NewQuote_Holder\"]/span")).click();
        driver.findElement(By.xpath("/html/body/main/form/div[1]/aside[2]/div[1]/div/div[3]/div[2]/select")).sendKeys(nbvo.getNewBusinessState());
        driver.findElement(By.name("QuickAction_EffectiveDt")).sendKeys(nbvo.getNewBusinessEffectiveDate());
        driver.findElement(By.id("QuickAction_ProgramType")).sendKeys(nbvo.getNewBusinessProgramType());
        driver.findElement(By.xpath("//*[@id=\"QuickAction_NewQuote\"]")).click();
        driver.findElement(By.id("Continue")).click();
        Thread.sleep(100);
        driver.findElement(By.id("BasicPolicy.RenewalTermCd")).sendKeys(nbvo.getNewBusinessTerm());
        driver.findElement(By.id("ProviderNumber")).sendKeys(nbvo.getNewBusinessProducerCode());
        driver.findElement(By.id("ProducerLookup")).click();
        driver.findElement(By.name("BasicPolicy.NoLapse")).sendKeys(nbvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        driver.findElement(By.name("BasicPolicy.UninsuredMoreThanThirtyDays")).sendKeys("No");
//      Insured information
        driver.findElement(By.name("Insured.EntityTypeCd")).sendKeys(nbvo.getNewBusinessEntityType());
        driver.findElement(By.name("InsuredName.GivenName")).sendKeys(nbvo.getNewBusinessIndividualFirst());
        driver.findElement(By.name("InsuredName.Surname")).sendKeys(nbvo.getNewBusinessIndividualBirthDate());
        driver.findElement(By.id("ResetCommercialName")).click();
        driver.findElement(By.name("InsuredPersonal.BirthDt")).sendKeys(nbvo.getNewBusinessIndividualBirthDate());
//      Mailing address
        driver.findElement(By.name("InsuredMailingAddr.Addr1")).sendKeys(nbvo.getNewBusinessMailingAddress());
        driver.findElement(By.name("InsuredMailingAddr.City")).sendKeys(nbvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.name("InsuredMailingAddr.PostalCode")).sendKeys(nbvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.name("InsuredMailingAddr.StateProvCd")).sendKeys(nbvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id("InsuredMailingAddr.addrVerifyImg")).click();
//      Contact
        driver.findElement(By.name("InsuredEmail.EmailAddr")).sendKeys(nbvo.getNewBusinessEmail());
        driver.findElement(By.name("InsuredPersonal.BestWayToContact")).sendKeys(nbvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.name("InsuredPersonal.BestTimeToContact")).sendKeys(nbvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id("NextPage_Bottom")).click();
//      Selecting the new customer
        driver.findElement(By.id("QuoteCustomerClearingRef_6")).click();
//      Automobile Policy General Screen
        driver.findElement(By.name("Line.BILimit")).sendKeys(nbvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        driver.findElement(By.name("Line.PDLimit")).sendKeys(nbvo.getNewBusinessPropertyDamage());
        driver.findElement(By.name("Line.MedPayLimit")).sendKeys(nbvo.getNewBusinessMedicalPayments());
        driver.findElement(By.name("Line.PIPLimit")).sendKeys(nbvo.getNewBusinessPersonalInjuryProtection());
        driver.findElement(By.name("Line.UMUILimit")).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.name("Line.UMUIPDLimit")).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristPropertyDamage());
        driver.findElement(By.name("Line.HomeownersDiscountInd")).sendKeys(nbvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id("NextPage_Bottom")).click();
//        Adding Driver 0r driver details
        driver.findElement(By.id("AddDriver")).click();
        driver.findElement(By.name("NameInfo.GivenName")).sendKeys(nbvo.getNewBusinessDriver1FirstName());
        driver.findElement(By.name("NameInfo.Surname")).sendKeys(nbvo.getNewBusinessDriver1LastName());
        driver.findElement(By.name("DriverInfo.RelationshipToInsuredCd")).sendKeys(nbvo.getNewBusinessDriver1RelationshipToInsured());
        driver.findElement(By.name("DriverInfo.DriverStatusCd")).sendKeys(nbvo.getNewBusinessDriver1DriverStatus());
        driver.findElement(By.name("PersonInfo.BirthDt")).sendKeys(nbvo.getNewBusinessDriver1BirthDate());
        driver.findElement(By.name("PersonInfo.GenderCd")).sendKeys(nbvo.getNewBusinessDriver1Gender());
        driver.findElement(By.name("PersonInfo.MaritalStatusCd")).sendKeys(nbvo.getNewBusinessDriver1MaritalStatus());
        driver.findElement(By.name("DriverInfo.LicenseDt")).sendKeys(nbvo.getNewBusinessDriver1DateLicensed());
        driver.findElement(By.id("DriverInfo.LicenseNumber")).sendKeys(nbvo.getNewBusinessDriver1LicenseNumber());
        driver.findElement(By.name("DriverInfo.LicenseStatus")).sendKeys(nbvo.getNewBusinessDriver1DriversLicenseStatus());
        driver.findElement(By.name("DriverInfo.SR22")).sendKeys(nbvo.getNewBusinessDriver1SR22());
//        employee details
        driver.findElement(By.name("PersonInfo.OccupationStatus")).sendKeys(nbvo.getNewBusinessDriver1Occupation());
        driver.findElement(By.id("NextPage_Bottom")).click();
        driver.findElement(By.id("Navigate_AddRisk_PrivatePassengerAuto")).click();
//         Adding vechile
        driver.findElement(By.name("Vehicle.VehIdentificationNumber")).sendKeys(nbvo.getNewBusinessVehicle1VIN());
        driver.findElement(By.id("ValidateVIN")).click();
        Thread.sleep(10000);
        // In use
        driver.findElement(By.name("Vehicle.VehUseCd")).sendKeys(nbvo.getNewBusinessVehicle1Use());
        driver.findElement(By.name("Vehicle.LeasedVehInd")).sendKeys(nbvo.getNewBusinessVehicle1PurchasedOrLeased());
        //Coverages
        driver.findElement(By.name("Vehicle.OtherThanCollisionDed")).sendKeys(nbvo.getNewBusinessVehicle1OtherThanCollisionDeductible());
        driver.findElement(By.name("Vehicle.CollisionDed")).sendKeys(nbvo.getNewBusinessVehicle1CollisionDeductible());
        driver.findElement(By.name("Vehicle.RentalReimbursementLimit")).sendKeys(nbvo.getNewBusinessVehicle1RentalReimbursement());
        driver.findElement(By.name("Vehicle.TowingLaborLimit")).sendKeys(nbvo.getNewBusinessVehicle1TowingAndLabor());
        driver.findElement(By.name("Vehicle.SpecialEquipmentLimit")).sendKeys(nbvo.getNewBusinessVehicle1SpecialEquipment());
        driver.findElement(By.id("NextPage_Bottom")).click();
        //Billing
        driver.findElement(By.id("NextPage_Bottom")).click();
        driver.findElement(By.id("BasicPolicy.PayPlanCd_1")).click();
        driver.findElement(By.id("Bind")).click();
        driver.findElement(By.id("Wizard_Underwriting")).click();
//     Underwritting reasons
        driver.findElement(By.id("Question_ProperLicense")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_PossibleDriver")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_DriverConviction")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_HouseholdResident")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_ExcludedSpouse")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_BusinessVehicle")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_ExistingDamage")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_DifferentAddress")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_SpecialEquipment")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_OtherVehicle")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_TitledVehicle")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_DriverViolation")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_DriverCondition")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_VehicleModification")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.id("Question_LiveryVehicle")).sendKeys(nbvo.getNewBusinessUWQuestionsNo());
        driver.findElement(By.xpath("//*[@id=\"Closeout\"]/span")).click();
//        Payment close out screen
        driver.findElement(By.id("TransactionInfo.PaymentTypeCd")).sendKeys(nbvo.getNewBusinessPaymentType());
//        Issue the Bussiness
        driver.findElement(By.xpath("//*[@id=\"Process\"]/span")).click();
    }


}
