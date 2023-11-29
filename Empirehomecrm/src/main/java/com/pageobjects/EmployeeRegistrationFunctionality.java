package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

import freemarker.cache.WebappTemplateLoader;

public class EmployeeRegistrationFunctionality extends Basetest  {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//i[@class='fa fa-id-card']")
	WebElement StaffButton;
	
	@FindBy (xpath = "//a[text()='Add New Staff']")
	WebElement AddNewStaff;
	
	@FindBy (xpath = "//input[@name='UserName']")
	WebElement EmployeeName;
	
	@FindBy (xpath = "//input[@name='EmailId']")
	WebElement EmployeeEmailId;
	
	@FindBy (xpath = "//input[@name='MobileNumber']")
	WebElement EmployeeMobileNumber;
	
	@FindBy (xpath = "//span[@class='select2-selection__rendered']")
	WebElement EmployeeDesignation;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	WebElement DesignationDropdown;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement SaveBUtton;
	
	
	public EmployeeRegistrationFunctionality() {
		PageFactory.initElements(driver, this);
	}
		
		public void verifyemployeeregistration () throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(2000);
		StaffButton.click();
		
		Thread.sleep(2000);
		AddNewStaff.click();
		
		Thread.sleep(2000);
		EmployeeName.sendKeys(prop.getProperty("EmployeeName"));
		
		Thread.sleep(2000);
		EmployeeEmailId.sendKeys(prop.getProperty("EmployeeEmailId"));
		
		Thread.sleep(2000);
		EmployeeMobileNumber.sendKeys(prop.getProperty("EmployeeMobileNumber"));
		
		Thread.sleep(2000);
		EmployeeDesignation.click();
		
		Thread.sleep(2000);
		Utils.dropdowns(DesignationDropdown, "Apple");
		
		
		Thread.sleep(2000);
		SaveBUtton.click();
		
	}

}
