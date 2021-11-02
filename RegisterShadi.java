package com.orhrm.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterShadi {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", ".\\ExecutableFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://shadi.com");
driver.manage().window().maximize();
driver.findElement(By.id("first_name")).sendKeys("Gayatri");
driver.findElement(By.id("last_name")).sendKeys("Raj");
//selection
WebElement month=driver.findElement(By.id("dob_m"));
Select sl1=new Select(month);
sl1.selectByVisibleText("Aug");
WebElement date=driver.findElement(By.id("dob_d"));
Select sl2=new Select(date);
sl2.selectByVisibleText("08");
WebElement year=driver.findElement(By.id("dob_y"));
Select sl3=new Select(year);
sl3.selectByVisibleText("1990");
WebElement Religion=driver.findElement(By.id("ddlReligion"));
Select sl4=new Select(Religion);
sl4.selectByVisibleText("Hindu");
WebElement Education=driver.findElement(By.id("ddlEducation"));
Select sl5=new Select(Education);
sl5.selectByVisibleText("Masters");
WebElement Country=driver.findElement(By.id("ddlCountry"));
Select sl6=new Select(Country);
sl6.selectByVisibleText("India");
// signinEmail 
driver.findElement(By.id("signinEmail")).click();
//login
driver.findElement(By.id("txtEmailAddress")).sendKeys("santhi.kalpana25@gmail.com");
driver.findElement(By.id("txtPassword")).sendKeys("xxxxx");
driver.findElement(By.id("submitButton")).click();
//driver.findElement(By.id("cencelButton")).click();

	}

}

	


