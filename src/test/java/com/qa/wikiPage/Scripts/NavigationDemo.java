package com.qa.wikiPage.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
       WebDriver driver = new ChromeDriver();
		
		// open a web URL
		driver.get("https://www.wikipedia.org/");
		
		driver.navigate().to("https://www.selenium.dev/");
		
		System.out.println("title of page 2 is " + driver.getTitle());
		
		
		driver.navigate().to("https://www.edureka.co/");
		
		System.out.println("title of page 3 is " + driver.getTitle());
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();

		Thread.sleep(2000);
		
		driver.close();
		
	}

}
