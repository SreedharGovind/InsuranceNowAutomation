package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBussinesVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class NewBusiness_03 {
    public void getNewBussines(ChromeDriver driver) throws IOException,InterruptedException{
        NewBussinesVO nbvo = new NewBussinesVO();
        nbvo.setNewBusinessEffectiveDate(ExcelUtils_03.getCellValueByLabel("newBusinessEffectiveDate"));
        nbvo.setNewBusinessState(ExcelUtils_03.getCellValueByLabel("newBusinessState"));
        nbvo.setNewBusinessProgramType(ExcelUtils_03.getCellValueByLabel("newBusinessProgramType"));
        nbvo.setNewBusinessProduct(ExcelUtils_03.getCellValueByLabel("newBusinessProduct"));
        nbvo.setNewBusinessTerm(ExcelUtils_03.getCellValueByLabel("newBusinessTerm"));
        nbvo.setNewBusinessProducerCode(ExcelUtils_03.getCellValueByLabel("newBusinessProducerCode"));
        nbvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(ExcelUtils_03.getCellValueByLabel("newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nbvo.setNewBusinessEntityType(ExcelUtils_03.getCellValueByLabel("newBusinessEntityType"));
        nbvo.setNewBusinessIndividualFirst(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualFirst"));
        nbvo.setNewBusinessIndividualMiddle(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualMiddle"));
        nbvo.setNewBusinessIndividualLast(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualLast"));
        nbvo.setNewBusinessIndividualBirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nbvo.setNewBusinessMailingAddress(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddress"));
        nbvo.setNewBusinessMailingAddressCity(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressCity"));
        nbvo.setNewBusinessMailingAddressZip(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressZip"));
        nbvo.setNewBusinessMailingAddressState(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressState"));
        nbvo.setNewBusinessMailingAddressVerifyAddress(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nbvo.setNewBusinessEmail(ExcelUtils_03.getCellValueByLabel("newBusinessEmail"));
        nbvo.setNewBusinessBestWaytoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBestTimetoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBodilyInjuryPerPersonPerAccident(ExcelUtils_03.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nbvo.setNewBusinessPropertyDamage(ExcelUtils_03.getCellValueByLabel("newBusinessPropertyDamage"));
        nbvo.setNewBusinessMedicalPayments(ExcelUtils_03.getCellValueByLabel("newBusinessMedicalPayments"));
        nbvo.setNewBusinessPersonalInjuryProtection(ExcelUtils_03.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristBodilyInjury(ExcelUtils_03.getCellValueByLabel("newBusinessUninsuredUnderinsuredMotoristBodilyInjury"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristPropertyDamage("newBusinessUninsuredUnderinsuredMotoristPropertyDamage");
        nbvo.setNewBusinessHomeownersDiscount(ExcelUtils_03.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nbvo.setNewBusinessDriver1FirstName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1FirstName"));
        nbvo.setNewBusinessDriver1LastName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LastName"));
        nbvo.setNewBusinessDriver1RelationshipToInsured(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nbvo.setNewBusinessDriver1DriverStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nbvo.setNewBusinessDriver1BirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nbvo.setNewBusinessDriver1Gender(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1Gender"));
        nbvo.setNewBusinessDriver1MaritalStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nbvo.setNewBusinessDriver1DateLicensed(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nbvo.setNewBusinessDriver1LicenseNumber(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nbvo.setNewBusinessDriver1LicenseState(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nbvo.setNewBusinessDriver1DriversLicenseStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nbvo.setNewBusinessDriver1SR22(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1SR22"));
        nbvo.setNewBusinessDriver1Occupation(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nbvo.setNewBusinessVehicle1VIN(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1VIN"));
        nbvo.setNewBusinessVehicle1Use(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1Use"));
        nbvo.setNewBusinessVehicle1PurchasedOrLeased(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nbvo.setNewBusinessVehicle1OtherThanCollisionDeductible(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nbvo.setNewBusinessVehicle1CollisionDeductible(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nbvo.setNewBusinessVehicle1RentalReimbursement(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nbvo.setNewBusinessVehicle1TowingAndLabor(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nbvo.setNewBusinessVehicle1SpecialEquipment(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nbvo.setNewBusinessUWQuestions(ExcelUtils_03.getCellValueByLabel("newBusinessUWQuestions"));
        nbvo.setNewBusinessPaymentType(ExcelUtils_03.getCellValueByLabel("newBusinessPaymentType"));
        //Quote Creation
        driver.findElement(By.xpath(ConstantsClass.newQuoteButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessStateCode)).sendKeys(nbvo.getNewBusinessState());
        driver.findElement(By.name(ConstantsClass.newBusinessEffectiveDate)).sendKeys(nbvo.getNewBusinessEffectiveDate());
        driver.findElement(By.id(ConstantsClass.newBusinessProgramType)).sendKeys(nbvo.getNewBusinessProgramType());
        driver.findElement(By.id(ConstantsClass.quickActionNewQuote)).click();
        driver.findElement(By.id(ConstantsClass.continueButton)).click();
        Thread.sleep(100);
        driver.findElement(By.id("BasicPolicy.RenewalTermCd")).sendKeys(nbvo.getNewBusinessTerm());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerCode)).sendKeys(nbvo.getNewBusinessProducerCode());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerLookup)).click();
        driver.findElement(By.name(ConstantsClass.basicPolicyNolapse)).sendKeys(nbvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        driver.findElement(By.name(ConstantsClass.basicPolicyUninsuredMorethanThirtyDays)).sendKeys("No");
//      Insured information
        driver.findElement(By.name(ConstantsClass.newBusinessEntityType)).sendKeys(nbvo.getNewBusinessEntityType());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredFirstName)).sendKeys(nbvo.getNewBusinessIndividualFirst());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredLastName)).sendKeys(nbvo.getNewBusinessIndividualLast());
        driver.findElement(By.id(ConstantsClass.resetCommercialName)).click();
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBirthDate)).sendKeys(nbvo.getNewBusinessIndividualBirthDate());
//      Mailing address
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddress)).sendKeys(nbvo.getNewBusinessMailingAddress());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressCity)).sendKeys(nbvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressPostalCode)).sendKeys(nbvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressState)).sendKeys(nbvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressVerify)).click();
//      Contact
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredEmailAddress)).sendKeys(nbvo.getNewBusinessEmail());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBestWayToContact)).sendKeys(nbvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBestTimeToContact)).sendKeys(nbvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//      Selecting the new customer
        driver.findElement(By.id("QuoteCustomerClearingRef_5")).click();
//      Automobile Policy General Screen
        driver.findElement(By.name(ConstantsClass.newBusinessBodilyInjuryLimit)).sendKeys(nbvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        driver.findElement(By.name(ConstantsClass.newBusinessPropertyDamageLimit)).sendKeys(nbvo.getNewBusinessPropertyDamage());
        driver.findElement(By.name(ConstantsClass.newBusinessMedicalPaymentLimit)).sendKeys(nbvo.getNewBusinessMedicalPayments());
        driver.findElement(By.name(ConstantsClass.newBusinessPersonalInjuryProtectionLimit)).sendKeys(nbvo.getNewBusinessPersonalInjuryProtection());
        driver.findElement(By.name(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristBodilyInjury)).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.name(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristPropertyDamage)).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristPropertyDamage());
        driver.findElement(By.name(ConstantsClass.newBusinessHomeOwnersDiscount)).sendKeys(nbvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//        Adding Driver 0r driver details
        driver.findElement(By.id(ConstantsClass.newBusinessAddDriver)).click();
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1FirstName)).sendKeys(nbvo.getNewBusinessDriver1FirstName());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Surname)).sendKeys(nbvo.getNewBusinessDriver1LastName());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1RelationshipToInsured)).sendKeys(nbvo.getNewBusinessDriver1RelationshipToInsured());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Status)).sendKeys(nbvo.getNewBusinessDriver1DriverStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1BirthDate)).sendKeys(nbvo.getNewBusinessDriver1BirthDate());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Gender)).sendKeys(nbvo.getNewBusinessDriver1Gender());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1MaritalStatus)).sendKeys(nbvo.getNewBusinessDriver1MaritalStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1LicenseDate)).sendKeys(nbvo.getNewBusinessDriver1DateLicensed());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber)).sendKeys(nbvo.getNewBusinessDriver1LicenseNumber());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1LicenseStatus)).sendKeys(nbvo.getNewBusinessDriver1DriversLicenseStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nbvo.getNewBusinessDriver1SR22());
//        employee details
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1OccupationStatus)).sendKeys(nbvo.getNewBusinessDriver1Occupation());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
//         Adding vehicle
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nbvo.getNewBusinessVehicle1VIN());
        driver.findElement(By.id(ConstantsClass.validateVin)).click();
        Thread.sleep(10000);
        // In use
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nbvo.getNewBusinessVehicle1Use());
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
        driver.findElement(By.id("BasicPolicy.PayPlanCd_2")).click();
        driver.findElement(By.id("Bind")).click();
        driver.findElement(By.id("Wizard_Underwriting")).click();
//     Underwritting reasons
        driver.findElement(By.id("Question_ProperLicense")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_PossibleDriver")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_DriverConviction")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_HouseholdResident")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_ExcludedSpouse")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_BusinessVehicle")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_ExistingDamage")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_DifferentAddress")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_SpecialEquipment")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_OtherVehicle")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_TitledVehicle")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_DriverViolation")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_DriverCondition")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_VehicleModification")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id("Question_LiveryVehicle")).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.xpath("//*[@id=\"Closeout\"]/span")).click();
//        Payment close out screen
        driver.findElement(By.id("TransactionInfo.PaymentTypeCd")).sendKeys(nbvo.getNewBusinessPaymentType());
//        Issue the Bussiness
        driver.findElement(By.xpath("//*[@id=\"Process\"]/span")).click();
    }

}
