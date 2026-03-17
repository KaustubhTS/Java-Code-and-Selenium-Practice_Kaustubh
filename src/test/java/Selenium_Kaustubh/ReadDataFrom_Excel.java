package Selenium_Kaustubh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFrom_Excel {

	@Test 
	public void readDataFromExcel  () throws IOException
	{
		// Read the data from the excel
        FileInputStream file = new FileInputStream(
            "C:\\RSAPIPOSTMANDOCS\\Sample WorkSheet For Ferching Data.xlsx");
        
        // Excel workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        int totalRows = sheet.getLastRowNum(); // 0-based
        int totalCells = sheet.getRow(0).getLastCellNum(); // 1-based count
        
        System.out.println("Total Rows: " + (totalRows + 1));
        System.out.println("Total cells: " + totalCells);
        
        DataFormatter formatter = new DataFormatter();
        
        for (int r = 0; r <= totalRows; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c < totalCells; c++) {
                String value = "";
                if (currentRow != null && currentRow.getCell(c) != null) {
                    value = formatter.formatCellValue(currentRow.getCell(c));
                }
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        
        workbook.close();
        file.close();
    }
}