package com.utility;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.platform.commons.function.Try;

public class ReadExcel {
	
	
	public static String getExcel(int RowNum , int ColNum) {
		String data=null;
		try {
			File file = new File("C:\\Users\\nirma\\OneDrive\\Desktop\\JAVA.xlsx");
			
			Workbook book = new XSSFWorkbook(file);
			
			Sheet sheet = book.getSheet("Sheet1");
			
		    Row row = sheet.getRow(RowNum);
		    
		    Cell cell = row.getCell(ColNum);
		    
		    data = cell.getStringCellValue();
		    
		    System.out.println(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return data;
	}

	public static String getParticularCellData(int rowNum,int colNum) {
		String data="null";
		try {
			File file=new File("C:\\Users\\nirma\\OneDrive\\Desktop\\JAVA.xlsx");
			
			Workbook book = new XSSFWorkbook(file);
			
			Sheet sheet = book.getSheet("sheet1");
			
			Row row = sheet.getRow(0);
			
			Cell cell = row.getCell(0);
			
			//String data = cell.getStringCellValue();
			
			System.out.println(data);
		
		} catch (Exception e) {
		   e.printStackTrace();
		}
		return data;
		
	}
//       public static void getAllData() {
//    	   try {
//   			File file=new File("C:\\Users\\nirma\\Downloads\\DataDriven_IPT.xlsx");
//   			
//   			Workbook book = new XSSFWorkbook(file);
//   			
//   			Sheet sheet = book.getSheet("sheet1");
//   			
//   		     int lastRowNum = sheet.getLastRowNum();
//   		     
//   			 System.out.println("No of Rows:" +lastRowNum);
//   			
//   			 Short lastCellNum = sheet.getRow(0).getLastCellNum();
//   			 
//   			 System.out.println("No of Columns:" +lastCellNum);
//   			 
//			for (int i = 0; i <lastRowNum; i++) {
//				Row row = sheet.getRow(i);
//				for (int j = 0; j < lastCellNum; j++) {
//					Cell cell = row.getCell(j);
//					
//					DataFormatter dataformatter = new DataFormatter();
//							String data = dataformatter.formatCellValue(cell);
//				            System.out.println(data);
//				} 
//			}
//   		
//   		} catch (Exception e) {
//   		   e.printStackTrace();
//   		
//   	}
//       } 
       
      // return.data;
     	
		public static void main(String[]args) {
			//getParticularCellData();
			//getAllData();
		
	}
	
}
