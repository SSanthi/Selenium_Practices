package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickGoogleAdvance {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com.au/advanced_search");
          driver.manage().window().maximize();
          driver.findElement(By.id("xX4UFf")).sendKeys("Amazon");
        //capturing data
          //  System.out.println(driver.findElement(By.id("xX4UFf")).getAttribute("value"));
          //select
          driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
          //copy
          driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
          //paste
          driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
          //page down
          Actions page=new Actions(driver);
          page.sendKeys(Keys.PAGE_DOWN).build().perform();
          driver.findElement(By.xpath("//*[@id='s1zaZb']/div[5]/div[9]/div[2]/input[2]")).click();
	}

}
