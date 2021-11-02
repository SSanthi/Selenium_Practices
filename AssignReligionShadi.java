package com.orhrm.selenium1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignReligionShadi {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe" );
    ChromeDriver driver=new ChromeDriver();
    		driver.get("http://shadi.com");
    		driver.manage().window().maximize();
    		 WebElement drop=driver.findElement(By.id("ddlReligion"));
    		 Select sl=new Select(drop);
    		 //sl.selectByIndex(6);
    		List<WebElement> droplist=sl.getOptions();
    		 System.out.println(droplist.size());
    		 //sl.selectByVisibleText("Bhori");
    		 //sl.selectByValue("12-0");
    		/*  //name of item print in console
    		sl.selectByIndex(11);
    		 System.out.println(sl.getFirstSelectedOption().getText());
    		 */
    		 //select 2 or 3 items in dropdown
    		 //System.out.println(sl.isMultiple());
    		/* //if it is possible select2 or 3 
    		 sl.selectByIndex(4);
    		 sl.selectByIndex(7);*/
    		 //in future 2 or 3 selected
    		 sl.selectByIndex(8);
    		 
    		 List<WebElement> selectitem=sl.getAllSelectedOptions();
    		 System.out.println(selectitem.size());
    		 for(int i=0;i<selectitem.size();i++)
    		 {
    			 System.out.println(selectitem.get(i).getText());
    		 }
    		 

	}

}
