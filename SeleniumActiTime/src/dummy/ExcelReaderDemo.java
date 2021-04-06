package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderDemo {

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File f = new File("data\\actitime-testdata.xls");
		FileInputStream fis =  new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int numberOfSheets = wb.getNumberOfSheets();
		
		System.out.println(numberOfSheets);
		
		for(int i=0; i<numberOfSheets ; i++)
		{
			System.out.println(wb.getSheetName(i));
		}
		
		Sheet sh =  wb.getSheet("customerdata");
		int rowCount= sh.getLastRowNum()+1;
		
		for(int i = 0 ; i< rowCount ; i++)
		{
			Row row = sh.getRow(i);
			Cell cell = row.getCell(0);
			System.out.println(cell.toString());
		
		}
		
				
	}
}
