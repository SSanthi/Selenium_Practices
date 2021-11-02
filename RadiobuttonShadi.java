package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonShadi {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://shadi.com");
		driver.manage().window().maximize();
		//select radio button
        driver.findElement(By.id("rblGender_1_for")).click();
        driver.findElement(By.id("rblGender_0")).click();
        driver.findElement(By.id("rblGender_0_for")).click();
       
	}		

}
