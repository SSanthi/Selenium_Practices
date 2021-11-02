package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chainActionsmouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("https://ceotelangana.nic.in/ceo_old/home.aspx");
	   driver.manage().window().maximize();
	   WebElement ereg=driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[1]"));
	WebElement Assembly= driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[2]/div[1]/ul/li/a"));
	
	WebElement track=driver.findElement(By.xpath("//*[@id='body1']/tbody/tr[2]/td/table/tbody/tr[3]/td/div/div[2]/div[2]/div[1]/ul/li/ul/li[7]/a"));
	Actions chains=new Actions(driver);
	chains.moveToElement(ereg).moveToElement(Assembly).pause(2000).moveToElement(track).click().build().perform();
	
	}

}
