package com.testing;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */
public class YahooTest{
	
	@Test
	public void testYahoo() {
		System.setProperty("webdriver.chrome.driver", "D:\\11. Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.yahoo.com");
				
	}
	
	
	
    
}
