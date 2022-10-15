package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchAllDataExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("E:\\Vaishnavi\\ExcelSheet\\TC.xlsx");           //path of Excel Sheet	

	Workbook w = WorkbookFactory.create(file);	               //To Open the Sheet
	   Sheet s = w.getSheet("Sheet2");	
// double data = s.getRow(0).getCell(0).getNumericCellValue();
	int rowCount = s.getLastRowNum();
	Cell c = s.getRow(0).getCell(0);
	
	for(int i =0; i<=rowCount; i++)  {
	int cellCount = s.getRow(i).getLastCellNum();
	
	  for(int j=0; j<=cellCount-1; j++)  {
		if (c.equals(CellType.BOOLEAN))  {
		c.getBooleanCellValue();	
		}
		else if (c.equals(CellType.NUMERIC)) {
			c.getNumericCellValue();
		} 
		else {
			c.getStringCellValue();
		}
	 }
	}
		
	
	
	
	
}
}
