package com.juaracoding.locator.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.locator.driver.DriverSingleton;
import com.juaracoding.locator.pages.WebTables;

public class MainApp {

	public static void main(String[] args) {
		
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://demoqa.com/webtables");
		
		WebTables webTables = new WebTables();
		//positiftesting
		webTables.registrationForm("t","t","t@aa.com","33","3333","IT");
		
		//negatif testing
		webTables.registrationForm("r","r","r","r","000","IT");

	}

}
