package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EducationShadi3 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://shadi.com");
	       driver.manage().window().maximize();
	       WebElement drop=driver.findElement(By.id("ddlEducation"));
	       Select sl=new Select(drop);
	       //select 2 or 3 items in dropdown
	       //System.out.println(sl.isMultiple());
	       //if it is possible to select 2 or 3 in dropdown
	       sl.selectByIndex(3);
	       sl.selectByIndex(6);
	       List<WebElement> selectitem=sl.getAllSelectedOptions();
	       System.out.println(selectitem.size());
	       for(int i=0;i<selectitem.size();i++)
	       {
	    	   System.out.println(selectitem.get(i).getText());
	       }
	}
	

}
