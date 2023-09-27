package com.smartims.insurancepractice.insurancenow.testScenario2;


import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class NewBusiness_TS2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(ConstantsClass.localHostUrl);
        driver.findElement(By.id(ConstantsClass.username)).sendKeys("admin");
        driver.findElement(By.id(ConstantsClass.password)).sendKeys("Not9999!", Keys.ENTER);

        NewBusinessVO nvo = new NewBusinessVO();
        nvo.setNewBusinessEffectiveDate(ExcelUtils.getCellValueByLabel("newBusinessEffectiveDate"));
        nvo.setNewBusinessState(ExcelUtils.getCellValueByLabel("newBusinessState"));
        nvo.setNewBusinessProgramType(ExcelUtils.getCellValueByLabel("newBusinessProgramType"));
        nvo.setNewBusinessProduct(ExcelUtils.getCellValueByLabel("newBusinessProduct"));
        nvo.setNewBusinessTerm(ExcelUtils.getCellValueByLabel("newBusinessTerm"));
        nvo.setNewBusinessProducerCode(ExcelUtils.getCellValueByLabel("newBusinessProducerCode"));
        nvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(ExcelUtils.getCellValueByLabel("newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nvo.setNewBusinessEntityType(ExcelUtils.getCellValueByLabel("newBusinessEntityType"));
        nvo.setNewBusinessIndividualFirst(ExcelUtils.getCellValueByLabel("newBusinessIndividualFirst"));
        nvo.setNewBusinessIndividualMiddle(ExcelUtils.getCellValueByLabel("newBusinessIndividualMiddle"));
        nvo.setNewBusinessIndividualLast(ExcelUtils.getCellValueByLabel("newBusinessIndividualLast"));
        nvo.setNewBusinessIndividualBirthDate(ExcelUtils.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nvo.setNewBusinessMailingAddress(ExcelUtils.getCellValueByLabel("newBusinessMailingAddress"));
        nvo.setNewBusinessMailingAddressCity(ExcelUtils.getCellValueByLabel("newBusinessMailingAddressCity"));
        nvo.setNewBusinessMailingAddressZip(ExcelUtils.getCellValueByLabel("newBusinessMailingAddressZip"));
        nvo.setNewBusinessMailingAddressState(ExcelUtils.getCellValueByLabel("newBusinessMailingAddressState"));
        nvo.setNewBusinessMailingAddressVerifyAddress(ExcelUtils.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nvo.setNewBusinessEmail(ExcelUtils.getCellValueByLabel("newBusinessEmail"));
        nvo.setNewBusinessBestWaytoContact(ExcelUtils.getCellValueByLabel("newBusinessBestWaytoContact"));
        nvo.setNewBusinessBestTimetoContact(ExcelUtils.getCellValueByLabel("newBusinessBestTimetoContact"));
        nvo.setNewBusinessBodilyInjuryPerPersonPerAccident(ExcelUtils.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nvo.setNewBusinessPropertyDamage(ExcelUtils.getCellValueByLabel("newBusinessPropertyDamage"));
        nvo.setNewBusinessMedicalPayments(ExcelUtils.getCellValueByLabel("newBusinessMedicalPayments"));
        nvo.setNewBusinessPersonalInjuryProtection(ExcelUtils.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nvo.setNewBusinessUninsuredUnderinsuredMotoristBodilyInjury(ExcelUtils.getCellValueByLabel("newBusinessUninsuredUnderinsuredMotoristBodilyInjury"));
        nvo.setNewBusinessUninsuredUnderinsuredMotoristPropertyDamage("newBusinessUninsuredUnderinsuredMotoristPropertyDamage");
        nvo.setNewBusinessHomeownersDiscount(ExcelUtils.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nvo.setNewBusinessDriver1FirstName(ExcelUtils.getCellValueByLabel("newBusinessDriver1FirstName"));
        nvo.setNewBusinessDriver1LastName(ExcelUtils.getCellValueByLabel("newBusinessDriver1LastName"));
        nvo.setNewBusinessDriver1RelationshipToInsured(ExcelUtils.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nvo.setNewBusinessDriver1DriverStatus(ExcelUtils.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nvo.setNewBusinessDriver1BirthDate(ExcelUtils.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nvo.setNewBusinessDriver1Gender(ExcelUtils.getCellValueByLabel("newBusinessDriver1Gender"));
        nvo.setNewBusinessDriver1MaritalStatus(ExcelUtils.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nvo.setNewBusinessDriver1DateLicensed(ExcelUtils.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nvo.setNewBusinessDriver1LicenseNumber(ExcelUtils.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nvo.setNewBusinessDriver1LicenseState(ExcelUtils.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nvo.setNewBusinessDriver1DriversLicenseStatus(ExcelUtils.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nvo.setNewBusinessDriver1SR22(ExcelUtils.getCellValueByLabel("newBusinessDriver1SR22"));
        nvo.setNewBusinessDriver1Occupation(ExcelUtils.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nvo.setNewBusinessVehicle1VIN(ExcelUtils.getCellValueByLabel("newBusinessVehicle1VIN"));
        nvo.setNewBusinessVehicle1Use(ExcelUtils.getCellValueByLabel("newBusinessVehicle1Use"));
        nvo.setNewBusinessVehicle1PurchasedOrLeased(ExcelUtils.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nvo.setNewBusinessVehicle1OtherThanCollisionDeductible(ExcelUtils.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nvo.setNewBusinessVehicle1CollisionDeductible(ExcelUtils.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nvo.setNewBusinessVehicle1RentalReimbursement(ExcelUtils.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nvo.setNewBusinessVehicle1TowingAndLabor(ExcelUtils.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nvo.setNewBusinessVehicle1SpecialEquipment(ExcelUtils.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nvo.setNewBusinessUWQuestions(ExcelUtils.getCellValueByLabel("newBusinessUWQuestions"));
        nvo.setNewBusinessPaymentType(ExcelUtils.getCellValueByLabel("newBusinessPaymentType"));

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
        driver.findElement(By.id(ConstantsClass.basicPolicyNolapse)).sendKeys(nvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        driver.findElement(By.id(ConstantsClass.basicPolicyUninsuredMorethanThirtyDays)).sendKeys(nvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
//        if() {
//        driver.findElement(By.name("BasicPolicy.NamedNonOwnedInd")).sendKeys("No");
//        }
//        Insured information
        driver.findElement(By.id(ConstantsClass.newBusinessEntityType)).sendKeys(nvo.getNewBusinessEntityType());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredFirstName)).sendKeys(nvo.getNewBusinessIndividualFirst());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMiddleName)).sendKeys(nvo.getNewBusinessIndividualMiddle());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredLastName)).sendKeys(nvo.getNewBusinessIndividualLast());
        driver.findElement(By.id(ConstantsClass.resetCommercialName)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBirthDate)).sendKeys(nvo.getNewBusinessIndividualBirthDate());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddress)).sendKeys(nvo.getNewBusinessMailingAddress());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressCity)).sendKeys(nvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressPostalCode)).sendKeys(nvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressState)).sendKeys(nvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressVerify)).click();
        Thread.sleep(5000);
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredEmailAddress)).sendKeys(nvo.getNewBusinessEmail());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestWayToContact)).sendKeys(nvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestTimeToContact)).sendKeys(nvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.quoteCustomer)).click();
        Select bodilyInjury = new Select(driver.findElement(By.id(ConstantsClass.newBusinessBodilyInjuryLimit)));
        bodilyInjury.selectByVisibleText(nvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        Select propertyDamage = new Select(driver.findElement(By.id(ConstantsClass.newBusinessPropertyDamageLimit)));
        propertyDamage.selectByVisibleText(nvo.getNewBusinessPropertyDamage());
        Select medicalPayment = new Select(driver.findElement(By.id(ConstantsClass.newBusinessMedicalPaymentLimit)));
        medicalPayment.selectByVisibleText(nvo.getNewBusinessMedicalPayments());
        driver.findElement(By.id(ConstantsClass.newBusinessPersonalInjuryProtectionLimit)).sendKeys(nvo.getNewBusinessPersonalInjuryProtection());
        driver.findElement(By.id(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristBodilyInjury)).sendKeys(nvo.getNewBusinessUninsuredUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristPropertyDamage)).sendKeys(nvo.getNewBusinessUninsuredUnderinsuredMotoristPropertyDamage());
        driver.findElement(By.id(ConstantsClass.newBusinessHomeOwnersDiscount)).sendKeys(nvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//        Adding Driver 0r driver details
        driver.findElement(By.id(ConstantsClass.newBusinessAddDriver)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1FirstName)).sendKeys(nvo.getNewBusinessDriver1FirstName());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1Surname)).sendKeys(nvo.getNewBusinessDriver1LastName());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1RelationshipToInsured)).sendKeys(nvo.getNewBusinessDriver1RelationshipToInsured());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1Status)).sendKeys(nvo.getNewBusinessDriver1DriverStatus());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1BirthDate)).sendKeys(nvo.getNewBusinessDriver1BirthDate());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1Gender)).sendKeys(nvo.getNewBusinessDriver1Gender());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1MaritalStatus)).sendKeys(nvo.getNewBusinessDriver1MaritalStatus());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseDate)).sendKeys(nvo.getNewBusinessDriver1DateLicensed());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber)).sendKeys(nvo.getNewBusinessDriver1LicenseNumber());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseStatus)).sendKeys(nvo.getNewBusinessDriver1DriversLicenseStatus());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nvo.getNewBusinessDriver1SR22(), Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1OccupationStatus)).sendKeys(nvo.getNewBusinessDriver1Occupation());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nvo.getNewBusinessVehicle1VIN());
        driver.findElement(By.id(ConstantsClass.validateVin)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nvo.getNewBusinessVehicle1Use());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased)).sendKeys("Owned");
        //Coverages
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible)).sendKeys(nvo.getNewBusinessVehicle1OtherThanCollisionDeductible());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible)).sendKeys(nvo.getNewBusinessVehicle1CollisionDeductible());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement)).sendKeys(nvo.getNewBusinessVehicle1RentalReimbursement());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor)).sendKeys(nvo.getNewBusinessVehicle1TowingAndLabor());
        driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment)).sendKeys(nvo.getNewBusinessVehicle1SpecialEquipment());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        //Billing
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessPayPlans)).click();
        driver.findElement(By.id(ConstantsClass.bindButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
//     Underwritting reasons
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
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(nvo.getNewBusinessPaymentType());
        driver.findElement(By.xpath(ConstantsClass.process)).click();

    }
}

