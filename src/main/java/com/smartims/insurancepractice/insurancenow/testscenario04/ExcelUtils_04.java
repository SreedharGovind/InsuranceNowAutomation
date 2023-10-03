package com.smartims.insurancepractice.insurancenow.testscenario04;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


    public class ExcelClass_04 {

        public static String getCellValueByLabel(String label) throws IOException {
            // Create a new Excel workbook and sheet

            String filepath = "C:\\Users\\Chandralekha.Gaddame\\OneDrive - Smart IMS India Limited\\Documents\\InsuranceNowAutomation\\src\\main\\java\\INOW Automation Data Sheet.xlsx";

            FileInputStream file = new FileInputStream(new File(filepath));
            String sheetName = "Reinstatement";

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            try {


                for (Row row : sheet) {
                    for (Cell cell : row) {
                        if (cell.getStringCellValue().equals(label)) {
                            String value = row.getCell(cell.getColumnIndex() + 1).getStringCellValue();
                            workbook.close();
                            return value;

                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                workbook.close();
                return null;

            }
            return null;
        }
    }



