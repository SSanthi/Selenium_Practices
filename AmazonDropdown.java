package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropdown {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver",".\\ExecutableFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://Amazon.com");
driver.manage().window().maximize();
/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Baby");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Body Wash soaps");
driver.findElement(By.id("nav-search-submit-button")).click();*/
 WebElement Drop=driver.findElement(By.id("searchDropdownBox"));
List<WebElement> DropList= Drop.findElements(By.tagName("option"));
System.out.println(DropList.size());
for(int i=0;i<DropList.size();i++)
{
	//System.out.println(DropList.get(i).getText());
	if(DropList.get(i).getText().equals("Books"))
	{
		DropList.get(i).click();
	}
	/*DropList.get(i).click();
	//validation
	if(DropList.get(i).isSelected())//true
	{
		System.out.println(DropList.get(i).getText()+" :is selected");
	}
	else
	{
		System.out.println(DropList.get(i).getText()+" :is not selected");
	}*/
}

		

	}

}
