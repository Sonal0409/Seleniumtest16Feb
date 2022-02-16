package com.qa.wikiPage.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create a session with chrome browser ==> open chrome browser for you
		
		WebDriver driver = new ChromeDriver();
		
		// open a web URL
		driver.get("https://www.wikipedia.org/");
		
		// Maxamize the window
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();  // to get URL for you
		
		System.out.println("URL of page is :" + url);
		
		String title = driver.getTitle(); // gets title of the webpage
		
		System.out.println("title of page is :" + title);
		
		driver.close();
	

	}

}
