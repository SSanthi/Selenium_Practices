package com.orhrm.selenium1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ravik\\Downloads\\IEDriverServer_x64_3.1\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http:/Myntra.in");

	}

}
