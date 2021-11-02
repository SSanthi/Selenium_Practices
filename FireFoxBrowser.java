package com.orhrm.selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static FirefoxDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", ".\\ExecutableFiles\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		return driver;	

	}

}
