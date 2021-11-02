package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddiffCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
         driver.manage().window().maximize();
        // driver.findElement(By.id("remember")).click();
         System.out.println(driver.findElement(By.id("remember")).getAttribute("name"));
	//validation
        /* if(driver.findElement(By.id("remember")).isSelected())
         {
        	 driver.findElement(By.id("remember")).click();
        	 //i need print on console is selected or not
        	 System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
         }*/
         }
	

}
