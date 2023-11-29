package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LocationFunctionality extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement MasterButton;
	
	@FindBy (xpath = "//a[normalize-space()='Location']")
	WebElement LocationBar;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewButton;
	
	@FindBy (xpath = "//input[@id='LocationName']")
	WebElement LocationName;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement SearchBar;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement Deletbutton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;

	public LocationFunctionality () {
		PageFactory.initElements(driver, this);
		
	}
	public void VerifyLocation () throws Throwable {
			Thread.sleep(2000);
			SideBar.click();
			
			Thread.sleep(2000);
			MasterButton.click();
			
			Thread.sleep(2000);
			LocationBar.click();
			
			Thread.sleep(2000);
			AddNewButton.click();
			
			Thread.sleep(2000);
			LocationName.sendKeys(prop.getProperty("Location"));
			
			Thread.sleep(2000);
			SaveButton.click();
			
			Thread.sleep(2000);
			SearchBar.sendKeys(prop.getProperty("Location"));
			
			Thread.sleep(2000);
			EditButton.click();
			
			Thread.sleep(2000);
			LocationName.clear();
			
			Thread.sleep(2000);
			LocationName.sendKeys(prop.getProperty("EditLocation"));
			
			Thread.sleep(2000);
			SaveButton.click();
			
			Thread.sleep(2000);
			SearchBar.sendKeys(prop.getProperty("EditLocation"));
			
			Thread.sleep(2000);
			Deletbutton.click();
			
			Thread.sleep(2000);
			YesButton.click();
			
		
	}
}
