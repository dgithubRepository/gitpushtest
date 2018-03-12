package com.learnautomation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoforMaven {
	
	@Test
	public void testHello() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dave\\Desktop\\chromedriver.exe");
		
		System.out.println("Welcome to Maven World");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
