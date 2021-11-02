package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://Amazon.in");
   driver.manage().window().maximize();
   //not working
  /*WebElement prime= driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
  WebElement joinprime=driver.findElement(By.xpath("//*[@id='nav-flyout-prime']/div[2]/div[1]"));
  Actions chain=new Actions(driver);
   chain.moveToElement(prime).moveToElement(joinprime).click().build().perform();*/
  //working
   WebElement prime= driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
   
   Actions chain=new Actions(driver);
    chain.moveToElement(prime).click().build().perform();
   
	}

}

