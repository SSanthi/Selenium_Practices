package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Amazon.in");
          driver.manage().window().maximize();
          driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
          driver.findElement(By.id("ap_email")).sendKeys("santhi.kalpana25@gmail.com");
          driver.findElement(By.id("continue")).click();
          driver.findElement(By.id("ap_password")).sendKeys("Rishi@2015");
          driver.findElement(By.id("signInSubmit")).click();
          if(driver.findElement(By.id("glow-ingress-line1")).isDisplayed())
          {
        	  System.out.println("Application SignIn pass");
          }
          else
          {
        	  System.out.println("Application SignIn    Fail");
          }
       
	}

}


