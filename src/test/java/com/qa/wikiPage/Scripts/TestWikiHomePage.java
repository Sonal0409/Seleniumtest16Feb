package com.qa.wikiPage.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWikiHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		
		// wait for 5 seconds on every element, only if element is not visible
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// find an element of the webpage and perform an action
		
		// Locators ==> find element
		
		//driver.findElement(By.id("searchInput")).sendKeys("Automation testing");
		
		
	   driver.findElement(By.name("search")).sendKeys("Automation Testing today");
		
		
		// //tagname[@attribute='value'] ==> relative xpath locator
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Click on the link
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create account")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
