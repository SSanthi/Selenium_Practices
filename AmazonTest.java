package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
;		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("AppLaunch pass");
			
			
		}
		else
		{
			System.out.println("AppLaunch fail");
			
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books for kids");
		driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
