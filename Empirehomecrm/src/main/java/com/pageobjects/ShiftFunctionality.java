package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ShiftFunctionality extends Basetest{
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	 WebElement SideBar;
	 
	 @FindBy (xpath = "//span[normalize-space()='Masters']")
	 WebElement MastersButton;
	 
	 @FindBy (xpath = "//a[normalize-space()='Shifts']")
	 WebElement ShiftBar;
	 
	 @FindBy (xpath = "//a[normalize-space()='Add New']")
	 WebElement AddNewButton;
	 	 
	 @FindBy (xpath = "//input[@id='ShiftName']")
	 WebElement ShiftName;
	 
	 @FindBy (xpath = "//input[@name='StartTime']") 
	 WebElement ShiftStartTime;
	 
	 @FindBy (xpath = "//input[@name='EndTime']")
	 WebElement ShiftEndTime;
	 
	 @FindBy (xpath = "//button[normalize-space()='Save']")
	 WebElement SaveButton;
	 
	 @FindBy (xpath = "//input[@class='form-control form-control-sm']")
	 WebElement SearchBar;
	 
	 @FindBy (xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]/i[1]")
	 WebElement DeletButton;
	 
	 @FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	 WebElement YesButton;
	 
	 public ShiftFunctionality() {
		 PageFactory.initElements(driver, this);
		 }
	 
	 public void VerifyShift () throws Throwable {
		 Thread.sleep(2000);
		 SideBar.click();
		 
		 Thread.sleep(2000);
		 MastersButton.click();
		 
		 Thread.sleep(2000);
		 ShiftBar.click();
		 
		 Thread.sleep(2000);
		 AddNewButton.click();
		 
		 Thread.sleep(2000);
		 ShiftName.sendKeys(prop.getProperty("ShiftName"));
		 
		 Thread.sleep(2000);
		 ShiftStartTime.sendKeys(prop.getProperty("StartTime"));
		 
		 Thread.sleep(2000);
		 ShiftEndTime.sendKeys(prop.getProperty("EndTime"));
		 
		 Thread.sleep(2000);
		 SaveButton.click();
		 
		 Thread.sleep(2000);
		 SearchBar.sendKeys(prop.getProperty("ShiftName"));
		 
		 Thread.sleep(20000);
		 DeletButton.click();
		 
		 Thread.sleep(2000);
		 YesButton.click();;
	 }
}
