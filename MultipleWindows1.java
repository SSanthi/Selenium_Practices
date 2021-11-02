package com.orhrm.selenium1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
  Set<String> windows=driver.getWindowHandles();
/* for(String child:windows)
  {
	  System.out.println(child);
	  driver.switchTo().window(child);
	  System.out.println(driver.getTitle());
  
  ]*/
  //easy way
  //List<String> tabs=new ArrayList(windows);
  /*List<String> tabs=new ArrayList(windows);
  driver.switchTo().window(tabs.get(0));
  System.out.println(driver.getTitle());
  driver.close();
  driver.switchTo().window(tabs.get(1));
  System.out.println(driver.getTitle());
  driver.close();
  driver.switchTo().window(tabs.get(2));
  System.out.println(driver.getTitle());
  driver.close();
  driver.switchTo().window(tabs.get(3));
  System.out.println(driver.getTitle());
  driver.close();
  driver.switchTo().window(tabs.get(4));
  System.out.println(driver.getTitle());
  driver.close();*/
  //if u wantddirectly move to  print specific one
  List<String> tabs=new ArrayList(windows);
  driver.switchTo().window(tabs.get(1));
  System.out.println(driver.getTitle());
  driver.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("selenium");

	}

}
