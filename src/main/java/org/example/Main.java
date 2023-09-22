package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {
//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
// AccountCreationVO pvo = new AccountCreationVO();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(ConstantsClass.localHostUrl);
        driver.findElement(By.id(ConstantsClass.username)).sendKeys("admin");
        driver.findElement(By.id(ConstantsClass.password)).sendKeys("Not9999!", Keys.ENTER);
//adding producer
        WebElement producer = driver.findElement(By.id("Menu_Policy"));
        actions.moveToElement(producer).perform();
        driver.findElement(By.xpath("//*[@id=\"Menu_Policy_UnderwritingMaintenance\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"UnderwritingMaintenance\"]/table/tbody/tr[1]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"NewProducer\"]/span")).click();

        driver.findElement(By.name("Provider.ProviderNumber")).sendKeys("QATeam");

        WebElement producerType = driver.findElement(By.name("Provider.StatusCd"));
        actions.moveToElement(producerType).perform();
        driver.findElement(By.xpath("//*[@id=\"ProducerTypeCd\"]/option[6]")).click();
        WebElement status = driver.findElement(By.name("Provider.StatusCd"));
        actions.moveToElement(status).perform();
        driver.findElement(By.xpath("//*[@id=\"Provider.StatusCd\"]/option[1]")).click();
        driver.findElement(By.name("Provider.StatusDt")).sendKeys("12/12/2001");
        driver.findElement(By.name("AppointedDt")).sendKeys("12/20/2023");
        driver.findElement(By.name("ProviderName.CommercialName")).sendKeys("Smartims");
// Address for producer
        driver.findElement(By.name("ProviderStreetAddr.Addr1")).sendKeys("20000 Saums Rd");
        driver.findElement(By.name("ProviderStreetAddr.City")).sendKeys("Katy");
        driver.findElement(By.name("ProviderStreetAddr.StateProvCd")).sendKeys("Texas");
        driver.findElement(By.name("ProviderStreetAddr.PostalCode")).sendKeys("77449");
        WebElement regioncd = driver.findElement(By.name("ProviderStreetAddr.RegionCd"));
        actions.moveToElement(regioncd).perform();
        driver.findElement(By.xpath("//*[@id=\"ProviderStreetAddr.RegionCd\"]/option[237]")).click();
        driver.findElement(By.id("ProviderStreetAddr.addrVerifyImg")).click();
        driver.findElement(By.id("CopyAddress")).click();
// Esignature
        driver.findElement(By.name("EsignOptInd")).sendKeys("No");
        driver.findElement(By.name("PayToCd")).sendKeys("Producer");
        driver.findElement(By.name("Provider.CombinePaymentInd")).sendKeys("Yes");
        driver.findElement(By.name("Provider.PaymentPreferenceCd")).sendKeys("Check");
        driver.findElement(By.id("CopyBillingAddress")).click();
        driver.findElement(By.name("Save")).click();


//Adding state to the producer
//To add state discard changes
        driver.findElement(By.id("DiscardChanges")).click();
        driver.findElement(By.id("DiscardPage")).click();

//Take the Existing Producer and adding the State and License code
        driver.findElement(By.id("Search")).click();

        driver.findElement(By.id("Link_QATeam")).click();
        driver.findElement(By.id("AddState")).click();

//adding state details
        driver.findElement(By.id("StateInfo.StateCd")).sendKeys("Texas");
        WebElement Programtype = driver.findElement(By.name("StateInfo.ProgramType"));
        actions.moveToElement(Programtype).perform();
        driver.findElement(By.xpath("//*[@id=\"StateInfo.ProgramType\"]/option[3]")).click();

        driver.findElement(By.name("StateInfo.AppointedDt")).sendKeys("12/12/2002");

        driver.findElement(By.name("Save")).click();

// Addding Licensed Product Class List
        driver.findElement(By.id("AddProduct")).click();

        driver.findElement(By.name("LicensedProduct.StateProvCd")).sendKeys("Texas");

        WebElement Programtype1 = driver.findElement(By.name("LicensedProduct.ProgramType"));
        actions.moveToElement(Programtype1).perform();
        driver.findElement(By.xpath("//*[@id=\"LicensedProduct.ProgramType\"]/option[3]")).click();

        driver.findElement(By.name("LicensedProduct.Channel")).sendKeys("Retail Producers");

        driver.findElement(By.name("LicensedProduct.EffectiveDt")).sendKeys("12/12/2002");

        driver.findElement(By.name("LicensedProduct.CommissionNewPct")).sendKeys("3");

// driver.findElement(By.name("LicensedProduct.CommissionRenewalPct")).sendKeys("3");

    }
}