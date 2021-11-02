package com.orhrm.selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div"));
  Set<String> windows=driver.getWindowHandles();
  //by using iterator
  Iterator<String> it=windows.iterator();
  while(it.hasNext())
  {
	 // System.out.println(it.next().toString());
	  //give control
	  driver.switchTo().window(it.next().toString());
	  System.out.println(driver.getTitle());
	  driver.close();
  }

	}

}
