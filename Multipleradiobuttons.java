package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleradiobuttons {

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
        	// radiolist.get(i).click();
        	 //status of the radio button
        	 System.out.println(radiolist.get(i).getAttribute("value")+"---"+radiolist.get(i).getAttribute("checked"));
         }
	}

}
