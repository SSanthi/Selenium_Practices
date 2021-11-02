package com.orhrm.selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAmazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://Amazon.in");
	   driver.manage().window().maximize(); 
	   //rightclick
       WebElement Mobile=driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
       Actions right=new Actions(driver);
       right.contextClick(Mobile).build().perform();
       Robot rbt=new Robot();
       rbt.keyPress(KeyEvent.VK_DOWN);
       rbt.keyPress(KeyEvent.VK_DOWN);
       rbt.keyPress(KeyEvent.VK_ENTER);
       
	}

}
