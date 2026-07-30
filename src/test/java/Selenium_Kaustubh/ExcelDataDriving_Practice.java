package Selenium_Kaustubh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExcelDataDriving_Practice {

	@Ignore
	public void driveDataFromExcelOnecell() throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\K778883\\Downloads\\MyExcelForDataDriving.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(1);

		XSSFCell cell = row.getCell(0);

		String data = cell.getStringCellValue();
		System.out.println(data);

	}

	@Test
	public void driveDataFromExcelAllCells() throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\K778883\\Downloads\\MyExcelForDataDriving.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();

		int totalCellCount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for (int c = 0; c < totalCellCount; c++) {
				
				XSSFCell cell = currentRow.getCell(c);
				System.out.println(cell.getStringCellValue());

			}

		}

	}

}
