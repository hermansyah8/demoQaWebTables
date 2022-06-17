package com.juaracoding.locator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.locator.driver.DriverSingleton;

public class WebTables {
	
	private WebDriver driver;
	
	public WebTables() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//locator
	@FindBy(id = "addNewRecordButton")
	private WebElement btnAdd;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	
	@FindBy(id = "age")
	private WebElement age;
	
	@FindBy(id = "salary")
	private WebElement salary;
	
	@FindBy(id = "department")
	private WebElement department;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	public void registrationForm(String fn, String ln, String e, String a, String s, String d) {
		
		btnAdd.click();
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		userEmail.sendKeys(e);
		age.sendKeys(a);
		salary.sendKeys(s);
		department.sendKeys(d);
		btnSubmit.click();
	}
	
//	public void regisrationForm() {
//		btnAdd.click();
//		firstName.sendKeys("Adit");
//		lastName.sendKeys("fitrah");
//		userEmail.sendKeys("Adit@gmail.com");
//		age.sendKeys("18");
//		salary.sendKeys("5000000");
//		department.sendKeys("IT");
//		btnSubmit.click();
//		
//	}
}
