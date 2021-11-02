package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/shop/prebuzz");
    driver.manage().window().maximize();
   WebElement kids= driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[3]/div/a"));
	WebElement ethic=driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[3]/div/div/div/div/li[1]/ul/li[8]/a"));
   Actions chain=new Actions(driver);
	chain.moveToElement(kids).moveToElement(ethic).click().build().perform();
	}

}
