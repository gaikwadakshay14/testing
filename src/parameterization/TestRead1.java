package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestRead1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new 	FileInputStream("D:\\AUTOMATION TESTING\\parameterizationprogramm\\parameterization 1.xlsx");
	
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			String test = sh.getRow(0).getCell(0).getStringCellValue();
	 
	System.out.println(test);
	for(int i=0; i<=9; i++){
		
		String test1 = sh.getRow(5).getCell(i).getStringCellValue();
		System.out.println(test1);
		
		
	}
	
}
}
