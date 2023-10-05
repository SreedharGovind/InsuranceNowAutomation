package com.smartims.insurancepractice.insurancenow.testScenario02.testCase_03;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.EndorsementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Endorsement_03 {
    void endorsement_03(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
        EndorsementVO evo = new EndorsementVO();
        evo.setEndorsementEffectiveDate(ExcelUtils_03.getCellValueByLabel("endorsementEffectiveDate"));
        evo.setEndorsementEntityType(ExcelUtils_03.getCellValueByLabel("endorsementEntityType"));
        evo.setEndorsementNonDriver1FirstName(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1FirstName"));
        evo.setEndorsementNonDriver1LastName(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1LastName"));
        evo.setEndorsementNonDriver1RelationshipToInsured(
                ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1RelationshipToInsured"));
        evo.setEndorsementNonDriver1NonDriverType(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1NonDriverType"));
        evo.setEndorsementNonDriver1Gender(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1Gender"));
        evo.setEndorsementNonDriver1BirthDate(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1BirthDate"));
        evo.setEndorsementNonDriver1MaritalStatus(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver1MaritalStatus"));
        evo.setEndorsementNonDriver2FirstName(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2FirstName"));
        evo.setEndorsementNonDriver2LastName(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2LastName	"));
        evo.setEndorsementNonDriver2RelationshipToInsured(
                ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2RelationshipToInsured	"));
        evo.setEndorsementNonDriver2NonDriverType(
                ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2NonDriverType	"));
        evo.setEndorsementNonDriver2Gender(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2Gender	"));
        evo.setEndorsementNonDriver2BirthDate(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2BirthDate"));
        evo.setEndorsementNonDriver2MaritalStatus(ExcelUtils_03.getCellValueByLabel("endorsementNonDriver2MaritalStatus"));
        evo.setEndorsementAICode(ExcelUtils_03.getCellValueByLabel("endorsementAICode"));
        evo.setEndorsementAIInterestType(ExcelUtils_03.getCellValueByLabel("endorsementAIInterestType"));
        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000010-01");
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Endorsement");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.endorsementEffDate)).sendKeys(evo.getEndorsementEffectiveDate());
        driver.findElement(By.xpath(ConstantsClass.startButton)).sendKeys(Keys.ENTER, Keys.ENTER);
        Select entityType = new Select(driver.findElement(By.xpath(ConstantsClass.entityType)));
        entityType.selectByValue(evo.getEndorsementEntityType());
        driver.findElement(By.id(ConstantsClass.wizardNonDrivers)).click();
        driver.findElement(By.id(ConstantsClass.addNonDriver)).click();
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1FirstName))
                .sendKeys(evo.getEndorsementNonDriver1FirstName());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1LastName))
                .sendKeys(evo.getEndorsementNonDriver1LastName());
        Select relationToInsured = new Select(
                driver.findElement(By.id(ConstantsClass.endorsementNonDriver1RelationshipToInsured)));
        relationToInsured.selectByVisibleText(evo.getEndorsementNonDriver1RelationshipToInsured());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1NonDriverType))
                .sendKeys(evo.getEndorsementNonDriver1NonDriverType());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1Gender))
                .sendKeys(evo.getEndorsementNonDriver1Gender());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1BirthDate))
                .sendKeys(evo.getEndorsementNonDriver1BirthDate());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1MaritalStatus))
                .sendKeys(evo.getEndorsementNonDriver1MaritalStatus());
        driver.findElement(By.id(ConstantsClass.saveButton)).click();
        driver.findElement(By.id(ConstantsClass.navigateNonDriverParty)).click();
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1FirstName))
                .sendKeys(evo.getEndorsementNonDriver2FirstName());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1LastName))
                .sendKeys(evo.getEndorsementNonDriver2LastName());
        Select relationToInsured1 = new Select(
                driver.findElement(By.id(ConstantsClass.endorsementNonDriver1RelationshipToInsured)));
        relationToInsured1.selectByVisibleText(evo.getEndorsementNonDriver2RelationshipToInsured());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1NonDriverType))
                .sendKeys(evo.getEndorsementNonDriver2NonDriverType());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1Gender))
                .sendKeys(evo.getEndorsementNonDriver2Gender());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1BirthDate))
                .sendKeys(evo.getEndorsementNonDriver2BirthDate());
        driver.findElement(By.id(ConstantsClass.endorsementNonDriver1MaritalStatus))
                .sendKeys(evo.getEndorsementNonDriver2MaritalStatus());

        driver.findElement(By.id(ConstantsClass.wizardAdditionalInterests)).click();
        driver.findElement(By.id(ConstantsClass.addAdditionalInterest)).click();
        driver.findElement(By.id(ConstantsClass.endorsementAICode)).sendKeys(evo.getEndorsementAICode());
        driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode)).click();
        driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode))
                .sendKeys(evo.getEndorsementAIInterestType(), Keys.ENTER);
        driver.findElement(By.id(ConstantsClass.privatePassengerAutoCheckbox)).click();
        driver.findElement(By.id(ConstantsClass.saveButton)).click();
        driver.findElement(By.id(ConstantsClass.finishButton)).click();
    }
}

