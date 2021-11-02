package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	  
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://Amazon.in");
	   driver.manage().window().maximize();
	   WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
	   Actions mouse=new Actions(driver);
	   mouse.moveToElement(signIn).build().perform();

	}

}
