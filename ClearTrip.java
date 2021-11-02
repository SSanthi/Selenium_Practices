package com.orhrm.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTrip extends FireFoxBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		FirefoxDriver driver= getDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		// From Selection
		String fromElePath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div/input";
		String fromSuggListPath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul//li//p";
		String cityValue = "HYD";
		String cityName = "Hyderabad, IN - Rajiv Gandhi International (HYD)";
		SelectCity(driver,fromElePath, cityValue,cityName, fromSuggListPath);
		
		// To Selection
		String toElePath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div/input";
		String toSuggListPath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[2]/ul//li//p";
		cityValue = "BLR";
		cityName = "Bangalore, IN - Kempegowda International Airport (BLR)";
		SelectCity(driver, toElePath, cityValue, cityName, toSuggListPath);
		
		String buttonXpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button";
		SelectElement(driver,buttonXpath);
	    Thread.sleep(2000);
	    
	    String dateXpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]/div/div";
	    SelectElement(driver,dateXpath);
	    
	    // Adult Drop Down & Element Path
	    
	    //  Children
	    
	    // Infant 
	}
	
	static void SelectCity(FirefoxDriver driver,String elePath, String cityValue, String cityName , String suggListPath ) throws InterruptedException {
		driver.findElement(By.xpath(elePath)).sendKeys(cityValue);
		Thread.sleep(2000);
		List<WebElement> SuggestionList = driver.findElements(By.xpath(suggListPath));
		System.out.println(SuggestionList.size());
		for (WebElement element : SuggestionList) {
            if (element.getText().equalsIgnoreCase(cityName)) {
                element.click();
                break;
            }
        }	
	}
	
	static void SelectElement(FirefoxDriver driver, String elePath) {
		WebElement element =driver.findElement(By.xpath(elePath));
		element.click();
	}
	
	static void SelectDropDown(FirefoxDriver driver, String dropXpath, String eleXpath) {
		driver.findElement(By.xpath(dropXpath)).click();
		driver.findElement(By.xpath(eleXpath)).click();
	}
	

}
