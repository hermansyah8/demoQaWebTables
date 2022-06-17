package com.juaracoding.locator.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingleton { 
	
	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton() {
		instantiate("chrome");
	}
	
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementator.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance() {
		if(instance == null) {
			instance = new DriverSingleton();
		}
		
		return instance;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

}
