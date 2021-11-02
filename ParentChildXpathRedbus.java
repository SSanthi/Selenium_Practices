package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpathRedbus {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://redbus.in");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("src")).sendKeys("k");
	   Thread.sleep(2000);
	   List<WebElement> links= driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
	   System.out.println(links.size());
	   for(int i=0;i<links.size();i++)
	   {
		System.out.println(links.get(i).getText());   
	   }
	}

}
