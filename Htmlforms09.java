package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlforms09 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
        driver.manage().window().maximize();
        WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	     List<WebElement> checklist=table.findElements(By.tagName("input"));
	     System.out.println(checklist.size());
	     for(int i=0;i<checklist.size();i++)
	     {
	    	// checklist.get(i).click();
	    	/* System.out.println(checklist.get(i).getAttribute("checked")+"---"+checklist.get(i).getAttribute("value"));
	    	 //select required one
	    	 if(checklist.get(i).getAttribute("value").equals("Cheese"))
	    	 {
	    		 checklist.get(i).click();
	    	 }*/
	    	 //validation
	    	 System.out.println("click on: "+checklist.get(i).getAttribute("value"));
	    	 checklist.get(i).click();
	    	 
	    	 for(int j=0;j<checklist.size();j++)
	    	 {
	    		 System.out.println(checklist.get(j).getAttribute("checked")+"----"+checklist.get(j).getAttribute("value"));
	    	 }
	    	 System.out.println(".............");
	     }
	    		 
	}
	

}
