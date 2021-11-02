package com.orhrm.selenium1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		Set<String> windows=driver.getWindowHandles();
		for(String child:windows)
		{
			System.out.println(child);
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
