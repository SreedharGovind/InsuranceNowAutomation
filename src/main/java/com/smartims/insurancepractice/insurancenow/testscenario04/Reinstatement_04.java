
package com.smartims.insurancepractice.insurancenow.testscenario04;
import com.smartims.insurancepractice.insurancenow.testscenario03.Constants_03;
import com.smartims.insurancepractice.insurancenow.voClasses.ReinstatementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
                public class Reinstatement_04 {
                     public  void getReinstatement(ChromeDriver driver) throws  IOException,InterruptedException{
                         Actions actions = new Actions(driver);
                         ReinstatementVO rvo = new ReinstatementVO();

                     rvo.setReinstatementDescription(ExcelUtils_04.getCellValueByLabel("reinstatementDescription"));
                     rvo.setReinstatementAdditionalNoticeText(ExcelUtils_04.getCellValueByLabel("reinstatementAdditionalNoticeText"));
                         WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));
                         actions.moveToElement(policyTab).perform();
                         policyTab.click();
                         driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000010-01");
                         WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));
                         actions.moveToElement(searchButton).perform();
                         searchButton.click();
//                    driver.findElement(By.id("Tab_Recent")).click();
//                    driver.findElement(By.xpath("//*[@id=\"RecentActivityItem_Action_0\"]/a")).click();
//                    driver.findElement(By.id("Transaction")).click();
//                    Thread.sleep(1000);
//                    driver.findElement(By.id("TransactionCd")).click();
//                    Thread.sleep(1000);
//                    driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/table[2]/tbody/tr/td/table/tbody/tr/td[1]/select/option[3]")).click();
//                    driver.findElement(By.id("Select")).click();
//                    driver.findElement(By.id("Start")).click();
//                    driver.findElement(By.xpath("//*[@id=\"TransactionInfo.TransactionShortDescription\"]")).sendKeys(rvo.getReinstatementDescription(), Keys.TAB);
//                    Thread.sleep(1000);
//                    driver.findElement(By.xpath("//*[@id=\"TransactionInfo.TransactionLongDescription\"]")).sendKeys(rvo.getReinstatementAdditionalNoticeText(), Keys.TAB);
//                    driver.findElement(By.xpath("//*[@id=\"Closeout\"]/i")).click();
//                    driver.findElement(By.id("Process")).click();
                }
            }

