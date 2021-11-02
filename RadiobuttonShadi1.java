package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonShadi1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://shadi.com");
		driver.manage().window().maximize();
		//property value retrieving using getAttribute method
       
		
		System.out.println(driver.findElement(By.id("rblGender_1")).getAttribute("checked"));
		 //validation
        if(driver.findElement(By.id("rblGender_1")).isSelected())
        {
        	driver.findElement(By.id("rblGender_1")).click();
        	//after clickig status
        	System.out.println(driver.findElement(By.id("rblGender_1")).getAttribute("checked"));
        
	}
	
	}

}
