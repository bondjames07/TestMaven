package com.testing;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */
public class GoogleTest{
	
		
	@Test
	public void testGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\11. Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.wait(5);
		driver.get("www.google.com");
		driver.quit();		
	}
	
	
	
    
}
