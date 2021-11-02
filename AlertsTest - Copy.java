package com.orhrm.selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		//html popup handle
		driver.findElement(By.id("corover-close-btn")).click();
		//inspect search for bus xpath
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click();
		Thread.sleep(2000);
		//handling java scripts alerts like accept() for k,dismiss()for cancel,getText() for capturing,sendKeys for enter text
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
