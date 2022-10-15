package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream file = new FileInputStream("E:\\Vaishnavi\\ExcelSheet\\TC.xlsx");           //path of Excel Sheet	

	Workbook w = WorkbookFactory.create(file);	               //To Open the Sheet
	Sheet s = w.getSheet("Sheet2");	                           //To Fetch the Sheet
	  Row r = s.getRow(1);                                     //To fetch the row wise data from Sheet with the help of index[index start from 0]
	 Cell c = r.getCell(1);                                    //To fetch the cell wise data
 //Boolean Data = c.getBooleanCellValue();                       //To get the Boolean cell value
 //System.out.println(Data);
 
    //double Data1 = c.getNumericCellValue();
	//System.out.println(Data1);
	// WE use create() method only onces becoz this method open he sheet//Already open sheet parat open ks krnr mhnun
	    String Data2 = 	c.getStringCellValue();
	    System.out.println(Data2);
	
		System.out.println("____________________________________________________________________________________");
	
		//METHOD CHAINING 
	//String data=WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	//System.out.println(data);

	//double data1=WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(0).getNumericCellValue();
	//System.out.println(data1);

	//boolean data2=WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(3).getBooleanCellValue();
	//System.out.println(data2);	
		
	
		
			
		
}
}
