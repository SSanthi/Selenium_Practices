package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1shadi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe" );
	    ChromeDriver driver=new ChromeDriver();
	    		driver.get("http://shadi.com");
	    		driver.manage().window().maximize();
	    		//Religion
	    		Select Religion =new Select(driver.findElement(By.id("ddlReligion")));
	    		Religion.selectByIndex(3);
	    		//Education
	    		Select Education=new Select(driver.findElement(By.id("ddlEducation")));
	    		Education.selectByIndex(4);
	    		//country
	    		Select Country=new Select(driver.findElement(By.id("ddlCountry")));
	    		Country.selectByIndex(8);
	}

}
