package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentShadi {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe" );
    ChromeDriver driver=new ChromeDriver();
    		driver.get("http://shadi.com");
    		driver.manage().window().maximize();
    		//select 2 or  3 dropdown menu at a time
    		//month
    		Select month= new Select(driver.findElement(By.id("dob_m")));
    		month.selectByIndex(8);
    		//day
    		Select day=new Select(driver.findElement(By.id("dob_d")));
    		day.selectByIndex(8);
    		//year
    		Select year=new Select(driver.findElement(By.id("dob_y")));
    		year.selectByIndex(8);
    		/*//Relegion
    		Select Relegion=new Select(driver.findElement(By.id("ddlReligion")));
    		Relegion.selectByIndex(4);
    		//Education
    		Select Education=new Select(driver.findElement(By.id("ddlEducation")));
    		Education.selectByIndex(4);
    		//country
    		Select Country=new Select(driver.findElement(By.id("ddlCountry")));
    		Country.selectByIndex(8);
*/
	}

}
