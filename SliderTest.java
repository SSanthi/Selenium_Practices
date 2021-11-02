package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/slider/");
        driver.manage().window().maximize();
        //capture frame size
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        //based on index,give the control
        driver.switchTo().frame(0);
        WebElement sl=driver.findElement(By.xpath("//*[@id='slider']/span"));
        Actions slider=new Actions(driver);
        slider.clickAndHold(sl).moveByOffset(300, 0).release(sl).build().perform();
        //wait statement
        Thread.sleep(2000);
         slider.clickAndHold(sl).moveByOffset(-300, 0).release(sl).build().perform();
	}

}
