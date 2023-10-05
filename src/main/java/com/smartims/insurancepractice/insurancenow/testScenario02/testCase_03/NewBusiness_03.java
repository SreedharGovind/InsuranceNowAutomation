package com.smartims.insurancepractice.insurancenow.testScenario02.testCase_03;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class NewBusiness_03 {
    void newBusiness_03(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
        NewBusinessVO nvo = new NewBusinessVO();

        nvo.setNewBusinessEffectiveDate(ExcelUtils_03.getCellValueByLabel("newBusinessEffectiveDate"));
        nvo.setNewBusinessState(ExcelUtils_03.getCellValueByLabel("newBusinessState"));
        nvo.setNewBusinessProgramType(ExcelUtils_03.getCellValueByLabel("newBusinessProgramType"));
        nvo.setNewBusinessProduct(ExcelUtils_03.getCellValueByLabel("newBusinessProduct"));
        nvo.setNewBusinessTerm(ExcelUtils_03.getCellValueByLabel("newBusinessTerm"));
        nvo.setNewBusinessProducerCode(ExcelUtils_03.getCellValueByLabel("newBusinessProducerCode"));
        nvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(
                ExcelUtils_03.getCellValueByLabel(
                        "newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nvo.setNewBusinessEntityType(ExcelUtils_03.getCellValueByLabel("newBusinessEntityType"));
        nvo.setNewBusinessIndividualFirst(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualFirst"));
        nvo.setNewBusinessIndividualLast(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualLast"));
        nvo.setNewBusinessIndividualBirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nvo.setNewBusinessMailingAddress(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddress"));
        nvo.setNewBusinessMailingAddressCity(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressCity"));
        nvo.setNewBusinessMailingAddressZip(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressZip"));
        nvo.setNewBusinessMailingAddressState(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressState"));
        nvo.setNewBusinessMailingAddressVerifyAddress(
                ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nvo.setNewBusinessEmail(ExcelUtils_03.getCellValueByLabel("newBusinessEmail"));
        nvo.setNewBusinessBestWaytoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nvo.setNewBusinessBestTimetoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nvo.setNewBusinessBodilyInjuryPerPersonPerAccident(
                ExcelUtils_03.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nvo.setNewBusinessPropertyDamage(ExcelUtils_03.getCellValueByLabel("newBusinessPropertyDamage"));
        nvo.setNewBusinessMedicalPayments(ExcelUtils_03.getCellValueByLabel("newBusinessMedicalPayments"));
        nvo.setNewBusinessPersonalInjuryProtection(
                ExcelUtils_03.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nvo.setNewBusinessUninsuredUnderinsuredMotoristBodilyInjury(
                ExcelUtils_03.getCellValueByLabel("newBusinessUninsuredUnderinsuredMotoristBodilyInjury"));
        nvo.setNewBusinessUninsuredUnderinsuredMotoristPropertyDamage(
                "newBusinessUninsuredUnderinsuredMotoristPropertyDamage");
        nvo.setNewBusinessHomeownersDiscount(ExcelUtils_03.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nvo.setNewBusinessDriver1FirstName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1FirstName"));
        nvo.setNewBusinessDriver1LastName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LastName"));
        nvo.setNewBusinessDriver1RelationshipToInsured(
                ExcelUtils_03.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nvo.setNewBusinessDriver1DriverStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nvo.setNewBusinessDriver1BirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nvo.setNewBusinessDriver1Gender(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1Gender"));
        nvo.setNewBusinessDriver1MaritalStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nvo.setNewBusinessDriver1DateLicensed(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nvo.setNewBusinessDriver1LicenseNumber(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nvo.setNewBusinessDriver1LicenseState(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nvo.setNewBusinessDriver1DriversLicenseStatus(
                ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nvo.setNewBusinessDriver1SR22(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1SR22"));
        nvo.setNewBusinessDriver1Occupation(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nvo.setNewBusinessVehicle1VIN(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1VIN"));
        nvo.setNewBusinessVehicle1Use(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1Use"));
        nvo.setNewBusinessVehicle1PurchasedOrLeased(
                ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nvo.setNewBusinessVehicle1OtherThanCollisionDeductible(
                ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nvo.setNewBusinessVehicle1CollisionDeductible(
                ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nvo.setNewBusinessVehicle1RentalReimbursement(
                ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nvo.setNewBusinessVehicle1TowingAndLabor(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nvo.setNewBusinessVehicle1SpecialEquipment(
                ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nvo.setNewBusinessUWQuestions(ExcelUtils_03.getCellValueByLabel("newBusinessUWQuestions"));
        nvo.setNewBusinessPaymentType(ExcelUtils_03.getCellValueByLabel("newBusinessPayment Type"));

        driver.findElement(By.xpath(ConstantsClass.newQuoteButton)).click();
        Select statecode = new Select(driver.findElement(By.id(ConstantsClass.newBusinessStateCode)));
        statecode.selectByVisibleText("Texas");
        driver.findElement(By.id(ConstantsClass.newBusinessEffectiveDate)).sendKeys(nvo.getNewBusinessEffectiveDate());
        Select programType = new Select(driver.findElement(By.id(ConstantsClass.newBusinessProgramType)));
        programType.selectByVisibleText(nvo.getNewBusinessProgramType());
        driver.findElement(By.id(ConstantsClass.quickActionNewQuote)).click();
        driver.findElement(By.id(ConstantsClass.continueButton)).click();
        WebElement producerNumber = driver.findElement(By.id(ConstantsClass.newBusinessProducerCode));
        actions.moveToElement(producerNumber).perform();
        producerNumber.sendKeys(nvo.getNewBusinessProducerCode());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerLookup)).click();
        driver.findElement(By.id(ConstantsClass.basicPolicyNolapse)).sendKeys(
                nvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        driver.findElement(By.id(ConstantsClass.basicPolicyUninsuredMorethanThirtyDays)).sendKeys(
                nvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        driver.findElement(By.id(ConstantsClass.newBusinessEntityType)).sendKeys(nvo.getNewBusinessEntityType());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredFirstName))
                .sendKeys(nvo.getNewBusinessIndividualFirst());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredLastName))
                .sendKeys(nvo.getNewBusinessIndividualLast());
        driver.findElement(By.id(ConstantsClass.resetCommercialName)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBirthDate))
                .sendKeys(nvo.getNewBusinessIndividualBirthDate());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddress))
                .sendKeys(nvo.getNewBusinessMailingAddress());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressCity))
                .sendKeys(nvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressPostalCode))
                .sendKeys(nvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressState))
                .sendKeys(nvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressVerify)).click();
        Thread.sleep(5000);
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredEmailAddress)).sendKeys(nvo.getNewBusinessEmail());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestWayToContact))
                .sendKeys(nvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestTimeToContact))
                .sendKeys(nvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.quoteCustomer)).click();
        Select bodilyInjury = new Select(driver.findElement(By.id(ConstantsClass.newBusinessBodilyInjuryLimit)));
        bodilyInjury.selectByVisibleText(nvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        Select propertyDamage = new Select(driver.findElement(By.id(ConstantsClass.newBusinessPropertyDamageLimit)));
        propertyDamage.selectByVisibleText(nvo.getNewBusinessPropertyDamage());
        Select medicalPayment = new Select(driver.findElement(By.id(ConstantsClass.newBusinessMedicalPaymentLimit)));
        medicalPayment.selectByVisibleText(nvo.getNewBusinessMedicalPayments());
        driver.findElement(By.id(ConstantsClass.newBusinessPersonalInjuryProtectionLimit))
                .sendKeys(nvo.getNewBusinessPersonalInjuryProtection());
        driver.findElement(By.id(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristBodilyInjury))
                .sendKeys(nvo.getNewBusinessUninsuredUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristPropertyDamage))
                .sendKeys(nvo.getNewBusinessUninsuredUnderinsuredMotoristPropertyDamage());
        driver.findElement(By.id(ConstantsClass.newBusinessHomeOwnersDiscount))
                .sendKeys(nvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//Adding Driver 0r driver details
        driver.findElement(By.id(ConstantsClass.newBusinessAddDriver)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1Gender)).sendKeys(nvo.getNewBusinessDriver1Gender());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1MaritalStatus))
                .sendKeys(nvo.getNewBusinessDriver1MaritalStatus());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseDate))
                .sendKeys(nvo.getNewBusinessDriver1DateLicensed());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber))
                .sendKeys(nvo.getNewBusinessDriver1LicenseNumber());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseStatus))
                .sendKeys(nvo.getNewBusinessDriver1DriversLicenseStatus());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nvo.getNewBusinessDriver1SR22(),
                Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1OccupationStatus))
                .sendKeys(nvo.getNewBusinessDriver1Occupation());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nvo.getNewBusinessVehicle1VIN());
        driver.findElement(By.id(ConstantsClass.validateVin)).click();
        Thread.sleep(7000);
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nvo.getNewBusinessVehicle1Use());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased)).sendKeys("Owned");
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible))
                .sendKeys(nvo.getNewBusinessVehicle1OtherThanCollisionDeductible());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                .sendKeys(nvo.getNewBusinessVehicle1CollisionDeductible());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement))
                .sendKeys(nvo.getNewBusinessVehicle1RentalReimbursement());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor))
                .sendKeys(nvo.getNewBusinessVehicle1TowingAndLabor());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment))
                .sendKeys(nvo.getNewBusinessVehicle1SpecialEquipment());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessPayPlans)).click();
        driver.findElement(By.id(ConstantsClass.bindButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
        driver.findElement(By.id(ConstantsClass.questionProperLicense)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionPossibleDriver)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverConviction)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionHouseholdResident)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExcludedSpouse)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionBusinessVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExistingDamage)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDifferentAddress)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionSpecialEquipment)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionOtherVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionTitledVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverViolation)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverCondition)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionVehicleModification)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.xpath(ConstantsClass.closeOut)).click();
        System.out.println(nvo.getNewBusinessPaymentType());
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(nvo.getNewBusinessPaymentType());
        driver.findElement(By.xpath(ConstantsClass.process)).click();

    }
}

