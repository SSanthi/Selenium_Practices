package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcHeaderLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http:/ksrtc.in");
		  driver.manage().window().maximize();
		  WebElement header=driver.findElement(By.className("header-top-menu"));
		  List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		  System.out.println(headerlinks.size());
		  for(int i=0;i<headerlinks.size();i++)
		  {
			  System.out.println(headerlinks.get(i).getText());//capturing all links
			 
		  }
		  
	}

}
