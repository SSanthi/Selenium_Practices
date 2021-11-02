package com.orhrm.selenium1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDropTest {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //capture frame size
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        //giving control to specific frame
        //based on index,give the control
        //driver.switchTo().frame(0);//0 means 1 frame
        //based on string, we give the control
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
       //based on webElement,give control
        WebElement frame1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(frame1);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        Actions dAd=new Actions(driver);
        dAd.dragAndDrop(drag, drop).build().perform();
        //give the control back to previous html document
        
        driver.switchTo().defaultContent();
         System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
	}

}
