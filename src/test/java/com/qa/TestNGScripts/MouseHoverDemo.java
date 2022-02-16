package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo {

	@Test
	public void method1()
	{
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
	WebElement e1=	driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
	
	Actions a = new Actions(driver);
	
	
	a.moveToElement(e1).perform();
	

	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
