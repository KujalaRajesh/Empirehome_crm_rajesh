package com.pageobjects;
import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class UserTypeFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement NavigationButton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement MastersButton;
	
	@FindBy (xpath = "//a[normalize-space()='User Types']")
	WebElement UserTypesButton;
	
	@FindBy (xpath = "//i[@class='fa fa-plus']")
	WebElement AddNewButton;
	
	@FindBy (xpath = "//input[@id='TypeName']")
	WebElement AddUserNameField;
	
	@FindBy (xpath = "//input[@id='TypeCode']")
	WebElement AddUserTypeField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement SearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditUserButton;
	
	public UserTypeFunctionality() {
		PageFactory.initElements(driver, this);	
	}
	public void UserTypeValidation() throws Throwable {
			Thread.sleep(2000);
			NavigationButton.click();
			
			Thread.sleep(2000);
			MastersButton.click();
			
			Thread.sleep(2000);
			UserTypesButton.click();
			
			Thread.sleep(2000);
			AddNewButton.click();
			
			Thread.sleep(2000);
			AddUserNameField.sendKeys(prop.getProperty("TypeName"));
			
			Thread.sleep(2000);
			AddUserTypeField.sendKeys(prop.getProperty("TypeCode"));
			
			Thread.sleep(2000);
			SaveButton.click();
			
			Thread.sleep(2000);
			SearchField.sendKeys(prop.getProperty("TypeName"));
			
			Thread.sleep(2000);
			EditUserButton.click();		
			
			Thread.sleep(2000);
			AddUserTypeField.clear();
			AddUserTypeField.sendKeys(prop.getProperty("EditedTypeCode"));
			
			Thread.sleep(2000);
			SaveButton.click();
						
	}
}
