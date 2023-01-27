package TestNGMarathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadSFXLData {

	public static String[][] readData() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/SFQuestions.xlsx");

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Actual Row Count: " + physicalNumberOfRows);

		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell Count: " + lastCellNum);

		// declare 2D array
		String[][] data = new String[rowCount][lastCellNum];

		for (int i = 1; i <= rowCount; i++) {// traverse through the row
			for (int j = 0; j < lastCellNum; j++) {// 0,1,2

				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();

				data[i - 1][j] = stringCellValue;

				System.out.println(stringCellValue);
			}

		}

		wb.close();

		return data;
	}
	
	public static String[][] readOpData() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/SFQuestions.xlsx");

		XSSFSheet sheet = wb.getSheet("opportunity");

		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Actual Row Count: " + physicalNumberOfRows);

		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell Count: " + lastCellNum);

		// declare 2D array
		String[][] data = new String[rowCount][lastCellNum];

		for (int i = 1; i <= rowCount; i++) {// traverse through the row
			for (int j = 0; j < lastCellNum; j++) {// 0,1,2

				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();

				data[i - 1][j] = stringCellValue;

				System.out.println(stringCellValue);
			}

		}

		wb.close();

		return data;
	}
	

}
