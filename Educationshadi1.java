package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Educationshadi1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://shadi.com");
	       driver.manage().window().maximize();
	       WebElement drop=driver.findElement(By.id("ddlEducation"));
	       Select sl=new Select(drop);
	     //list of items in dropdown menu
	       List<WebElement> droplist=sl.getOptions();
	       System.out.println(droplist.size());

	}

}
