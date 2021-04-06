package com.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils 
{
	
	private static File f = null;
	private static FileInputStream fis = null;
	private static Workbook wb = null;
	private static Sheet sheet = null;
	private static Row row =null;
	private static Cell cell =null;
	
	
	private static String filePath = "data\\actitime-testdata.xls";
	
	public static Workbook getExcelObj()
	{
		System.out.println(" Creating object to Excel...");
		try {
			f = new File(filePath);
			fis =  new FileInputStream(f);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wb;
	}
	
	public static Sheet getSheet(String sheetname)
	{
		System.out.println("Creating object to sheet with - " + sheetname);
		wb = getExcelObj();
		sheet = wb.getSheet(sheetname);
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheet;
	}
	
	public static String getCellValueAsString(String sheetName, int rowNumber,int columnNum)
	{
		System.out.println("Reading cell value for " + sheetName + " and row " + rowNumber + " and column" + columnNum);
		String cellValue = null;
		sheet = getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(columnNum);
		
		cellValue = cell.toString();
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellValue;
		
	}
	
	public static int excelRowCount(String sheetname)
	{
		int rowCount = 0;
		sheet = getSheet(sheetname);
		rowCount = sheet.getLastRowNum() + 1;
		System.out.println("Total number of rows present in exccel "  + rowCount);
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
	}
	
	
	
	
	
	
	
	
	

}
