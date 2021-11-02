package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadiDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://shadi.com");
		driver.manage().window().maximize();
		/*
		  driver.findElement(By.id("dob_m")).sendKeys("April");
		driver.findElement(By.id("dob_d")).sendKeys("15");
		driver.findElement(By.id("dob_y")).sendKeys("1980");
		driver.findElement(By.id("ddlReligion")).sendKeys("Hindu");
		driver.findElement(By.id("ddlEducation")).sendKeys("Bachelors");
		driver.findElement(By.id("ddlCountry")).sendKeys("India");
		*/
	   WebElement drop=	driver.findElement(By.id("ddlReligion"));
	   List<WebElement> droplist=drop.findElements(By.tagName("option"));
	   System.out.println(droplist.size());
	   for(int i=0;i<droplist.size();i++)
{
	//System.out.println(droplist.get(i).getText());//print dropdownlist in console.
		  //dropdownlist specific month selection
		  /*
		    if(droplist.get(i).getText().equals("Canada"))
		   
		   {
			   droplist.get(i).click();
		   }
		   */
		     
		droplist.get(i).click();
		//validation
		if(droplist.get(i).isSelected())
		{
			System.out.println(droplist.get(i).getText()+" : is selected");
		}else
		{
			System.out.println(droplist.get(i).getText()+" : is not selected");
		}
}
	   
	   

	}

}
