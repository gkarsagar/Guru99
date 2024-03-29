package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import basePackage.Baseclass;

public class Testutils extends Baseclass{
	 static FileInputStream file;
	 static String Sheet1;
	 static String path = ("D:\\" + "/Guru99/main/java/testData/Test.xlsx");
	
	public static String getTestdata() throws EncryptedDocumentException, IOException {
	
	
	try {
	
	     FileInputStream file =  new FileInputStream(path);
	}
	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
	for(int i=0;i<=3;i--) {
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i+1).getCell(0+1).getStringCellValue();
	}
	return Sheet1 ;
	
	
	
	
}}