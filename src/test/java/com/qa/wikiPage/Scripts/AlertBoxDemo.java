package com.qa.wikiPage.Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	Alert a = driver.switchTo().alert();	
		
	String alerttext=	a.getText();
		
	System.out.println(alerttext);
		
	a.accept();
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
	
	
	
	
		
		
		
		
		
	}

}
