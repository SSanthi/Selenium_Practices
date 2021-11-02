package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.com");
	    driver.manage().window().maximize();
	   List<WebElement> links= driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
	   for(int i=0;i<links.size();i++)
	   {
		   System.out.println(links.get(i).getText());
	   }
	   
	}

}
