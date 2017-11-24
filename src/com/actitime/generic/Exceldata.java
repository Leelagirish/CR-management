package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.gargoylesoftware.htmlunit.javascript.host.worker.Worker;

public class Exceldata 
{
  public static String getdata(String input_xpath,String sheet,int rn,int cn) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  try {
		FileInputStream fis= new FileInputStream(new File(input_xpath));
		Workbook wb= WorkbookFactory.create(fis);
	
		
		
		String data=wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
		return data;	
		
	} 
	  
	  catch (FileNotFoundException e)
	  {
		
		return " ";
	}

	  
  }
	
}
