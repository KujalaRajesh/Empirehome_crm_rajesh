package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class HolidayFunctionality extends Basetest {
 @FindBy (xpath = "//span[@class='pe-7s-keypad']")
 WebElement SideBar;
 
 @FindBy (xpath = "//span[normalize-space()='Masters']")
 WebElement MastersButton;
  
 @FindBy (xpath = "//a[normalize-space()='Holidays']")
 WebElement HolidaysButton;
 
 @FindBy (xpath = "//a[normalize-space()='Add New']")
 WebElement AddNewButton;
 
 @FindBy (xpath = "//input[@name='HolidayDate']")
 WebElement HolidayDateField;
 
 @FindBy (xpath = "//input[@id='HolidayName']")
 WebElement HolidayNameField;
 
 @FindBy (xpath = "//input[@id='HolidayDesc']")
 WebElement HolidayDescription;
 
 @FindBy (xpath = "//button[normalize-space()='Save']")
 WebElement SaveButton;
 
 @FindBy (xpath = "//tbody/tr[2]/td[5]/a[1]/button[1]")
 WebElement EditButton;
 
 @FindBy (xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]")
 WebElement DeletButton;
 
 @FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
 WebElement YesButton;
 
 
 public  HolidayFunctionality() {
	 PageFactory.initElements(driver, this);
} 
 public void VerifyHoliday() throws Throwable {
	Thread.sleep(2000);
	SideBar.click();
	
	Thread.sleep(2000);
	MastersButton.click();

	Thread.sleep(2000);
	HolidaysButton.click();
	
	Thread.sleep(2000);
	AddNewButton.click();

		
	Thread.sleep(2000);
	HolidayDateField.sendKeys(prop.getProperty("HolidayDate"));
	
	Thread.sleep(2000);
	HolidayNameField.sendKeys(prop.getProperty("HolidayName"));
	
	Thread.sleep(2000);
	HolidayDescription.sendKeys(prop.getProperty("HolidayDescription"));
	
	Thread.sleep(2000);
	SaveButton.click();
	
	Thread.sleep(2000);
	EditButton.click();
	
	Thread.sleep(2000);
	HolidayDateField.clear();
	HolidayNameField.clear();
	HolidayDescription.clear();
	
//	Thread.sleep(2000);
	HolidayDateField.sendKeys(prop.getProperty("EditHolidayDate"));
	
//	Thread.sleep(2000);
	HolidayNameField.sendKeys(prop.getProperty("EditHolidayDate"));
	
//	Thread.sleep(2000);
	HolidayDescription.sendKeys(prop.getProperty("EditHolidayDescription"));
	
	Thread.sleep(2000);
	SaveButton.click();
	
	Thread.sleep(2000);
	DeletButton.click();

	Thread.sleep(2000);
	YesButton.click();	
}
 	
}
