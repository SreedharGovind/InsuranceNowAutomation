package com.smartims.insurancepractice.insurancenow.testScenario2;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static final String excelFilePath = "D:\\InsuranceNowAutomation\\src\\main\\java\\INOW Automation Data Sheet.xlsx";

    public static String getCellValueByLabel(String label) throws IOException {
        FileInputStream file = new FileInputStream(new File(excelFilePath));
        String sheetName = "TS_02";
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



