package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentchildxpathAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='nav-progressive-content']/a"));
		//based on index number
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='nav-progressive-content']/a[2]"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		

	}

}
