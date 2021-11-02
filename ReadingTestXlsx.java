package com.orhrm.selenium1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTestXlsx {

	private static XSSFWorkbook wb;

	public static void main(String[] args) throws Exception
	{
  //specify Excel file name
		File srcfile=new File("c:\\users\\ravik\\Downloads\\student.xlsx");
		FileInputStream fis=new FileInputStream(srcfile);
		wb = new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		//reading single set of data
	String data=ws.getRow(0).getCell(0).getStringCellValue();
	String data1=ws.getRow(0).getCell(1).getStringCellValue();
	String data2=ws.getRow(0).getCell(2).getStringCellValue();
	String data3=ws.getRow(0).getCell(3).getStringCellValue();
	System.out.println(data+"  "+data1+" "+data2 + " " + data3);
       
		/*String data=ws.getRow(1).getCell(0).getStringCellValue();
		String data1=ws.getRow(1).getCell(1).getStringCellValue();
		String data2=ws.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data+"  "+data1+" "+data2);*/
	//reading multiple set of data
	/*int rct=ws.getLastRowNum();
	for(int i=0;i<=rct;i++)
	{
		String data=ws.getRow(i).getCell(0).getStringCellValue();
		String data1=ws.getRow(i).getCell(1).getStringCellValue();
		String data2=ws.getRow(i).getCell(2).getStringCellValue();
		
		System.out.println(data+" "+data1 +" "+data2);
	}*/
	}

}
