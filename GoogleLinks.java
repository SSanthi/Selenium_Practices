package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Google.com");
		driver.manage().window().maximize();
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			//System.out.println(links.get(i).getText());
			//capture having text only
			/*if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}*/
			if(links.get(i).getText().equals("Images"))
			{
				links.get(i).click();
				break;
			}
		}

	}

}
