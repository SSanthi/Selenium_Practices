package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select sl=new Select(drop);//or Select sl=new Select(driver.findElement(By.id("searchDropdownBox")););
	     //sl.selectByIndex(8);
	     //in select class,list of items size present in dropdown
	    /* List<WebElement> droplist=sl.getOptions();
	     System.out.println(droplist.size());*/
	     //select item based on visible texr
		//sl.selectByVisibleText("Furniture");
		//select item based on value
		//sl.selectByValue("search-alias=beauty");
		//name of the item print in console
		//sl.selectByIndex(8);
		//System.out.println(sl.getFirstSelectedOption().getText());
		//possible to select at a time 2or 3 in dropdown
	//	System.out.println(sl.isMultiple());
		//if it is posibble  to select 2 or 3 item
		sl.selectByIndex(5);
		//sl.selectByIndex(6);
		// 2 or 3 selected
         List<WebElement> selectitem= sl.getAllSelectedOptions();
         System.out.println(selectitem.size());
         //if you want to print it use this,in future 2 or 3 selected write for loop
         for(int i=0;i<selectitem.size();i++)
         {
        	 System.out.println(selectitem.get(i).getText());
         }
	}
	

}
