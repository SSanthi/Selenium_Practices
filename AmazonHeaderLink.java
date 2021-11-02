package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHeaderLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.com");
		driver.manage().window().maximize();
		//identify the header section
		WebElement header=driver.findElement(By.id("nav-xshop"));
		//capture all links present under the header section
		 List<WebElement> headerlinks=header.findElements(By.tagName("a"));
 		System.out.println(headerlinks.size());
 		for(int i=0;i<headerlinks.size();i++)
 		{
 			System.out.println(headerlinks.get(i).getText());
 		}
	}

}
