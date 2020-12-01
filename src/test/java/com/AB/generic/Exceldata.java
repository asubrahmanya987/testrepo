package com.AB.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata
{
public static String getdata(int row, int column) throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\Ss\\Desktop\\Book1.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fi);
		String data = xwb.getSheet("Sheet1").getRow(row).getCell(column).getStringCellValue();
		return data;
		
				
	}
}
