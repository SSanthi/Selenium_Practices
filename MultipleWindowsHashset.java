package com.orhrm.selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHashset {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
		Set<String> windows=driver.getWindowHandles();
		//for-each loop/enhanced for loop:java 1.5 version (collections)
		//syntax
		/*for(declaration:arrayName)
		{
			//stmts
		}*/
        for(String child:windows)
        {
        	//capturing window ids
        	System.out.println(child);
        	//give the control to each window,capture title
        	driver.switchTo().window(child);
        	System.out.println(driver.getTitle());
        	//driver.close();
        	//genpack window only display remaining all close
        	/*if(!driver.getTitle().equals("Genpack"))
        	{                                                                                                                                                                                                                                                          
        		driver.close();
        	}*/
        	if(!driver.getTitle().equals("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com"))
        	{
        		driver.close();
        	}
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("selenium");
        }
	}
	}


