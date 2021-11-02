package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", ".\\ExecutableFiles\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]/div/div")).click();
		

	}

}
