package com.juaracoding.locator.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy {
	
	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}


}
