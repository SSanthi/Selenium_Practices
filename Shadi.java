package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://shadi.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("Kumari");
		driver.findElement(By.id("last_name")).sendKeys("sai");
		
		
		
	}

}
