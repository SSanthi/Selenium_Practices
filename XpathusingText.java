package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathusingText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://Google.com");
	       driver.manage().window().maximize();
	       //xpath based on text()
	       driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	   /*  //  //a[text()='Gmail'] or //*[text()='Gmail']
	      // if you want click images
	       driver.findElement(By.xpath("//a[text()='Images']")).click();*/
	       //xpath preceeding,fallowing
	       driver.findElement(By.xpath("//span[text()='Create an account']")).click();
	       driver.findElement(By.xpath(".//*[@id='username']/preceding::input[1]")).sendKeys("santhi");
	       driver.findElement(By.xpath(".//*[@id='username']/preceding::input[2]")).sendKeys("sutharam");
	       driver.findElement(By.xpath(".//*[@id='username']/following::input[1]")).sendKeys("san123");
	       driver.findElement(By.xpath(".//*[@id='username']/following::input[2]")).sendKeys("san123");
	       
	       

	}

}
