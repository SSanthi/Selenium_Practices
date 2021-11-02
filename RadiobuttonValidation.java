package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radiolist=table.findElements(By.tagName("input"));
		System.out.println(radiolist.size());
		for(int i=0;i<radiolist.size();i++)
		{
			System.out.println("click on: "+radiolist.get(i).getAttribute("value"));
			radiolist.get(i).click();
			//System.out.println(radiolist.get(i).getAttribute("value")+"---"+radiolist.get(i).getAttribute("checked"));
	      for(int j=0;j<radiolist.size();j++)
	      {
	    	  System.out.println(radiolist.get(j).getAttribute("value")+"---"+radiolist.get(j).getAttribute("checked"));
	      }
	      System.out.println("**********");
		}

	}

}
