package com.orhrm.selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrecFolSibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://Facebook.com");
	       driver.manage().window().maximize();

	}

}
