package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EducationShadi2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://shadi.com");
	       driver.manage().window().maximize();
	       WebElement drop=driver.findElement(By.id("ddlEducation"));
	       Select sl=new Select(drop);
	      //name of item print in console
	       sl.selectByIndex(6);
	       System.out.println(sl.getFirstSelectedOption().getText());
	}

}
