package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataread {
	
public static void main(String[] arg) throws IOException {
	
	String filePath="C:\\Users\\Cloud Laptop\\OneDrive\\Desktop\\csvdata\\mycsv.xlsx";
	String sheetName="testdata";
	
	FileInputStream fis=new FileInputStream(new File(filePath));
	
	Workbook workbook=new XSSFWorkbook(fis);  //load excel file
	
	Sheet sheet=workbook.getSheet(sheetName); //loaded sheet
	
	Row row=sheet.getRow(0); // loaded first row
	
			String username=row.getCell(0).getStringCellValue(); //  loaded 0,0 cell value
			String password=row.getCell(1).getStringCellValue();//loaded 0,1 cell value	
			
			System.out.println("sheetusername  "+username+"   "+"sheet passord  "+password);
	
}

}
