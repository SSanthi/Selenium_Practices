package com.orhrm.selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Google.co.in");
          driver.manage().window().maximize();
         WebElement gmail=driver.findElement(By.linkText("Gmail"));
         Actions right=new Actions(driver);
         right.contextClick(gmail).build().perform();
         Robot rbt=new Robot();
         rbt.keyPress(KeyEvent.VK_DOWN);
         rbt.keyPress(KeyEvent.VK_DOWN);
         rbt.keyPress(KeyEvent.VK_ENTER);
         
	}

}
