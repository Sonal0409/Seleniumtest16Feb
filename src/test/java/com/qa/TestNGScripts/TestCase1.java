package com.qa.TestNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
         driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	}
	
	
	@Test(priority='1')
	public void WikiPageTest()
	{
       	
		driver.get("https://www.wikipedia.org/");
		
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("search")).sendKeys("Automation Testing today");
		
		
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	
	
	@Test(priority='2')
	public void AlertBoxTest()
	{

		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
	Alert a = driver.switchTo().alert();	
		
	String alerttext=	a.getText();
		
	System.out.println(alerttext);
		
	a.accept();
	
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
