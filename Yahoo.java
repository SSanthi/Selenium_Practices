package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ybar-sbq")).sendKeys("selenium");
		driver.findElement(By.id("ybar-search")).click();
		
	}

}
