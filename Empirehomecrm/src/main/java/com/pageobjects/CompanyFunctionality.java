package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CompanyFunctionality extends Basetest{
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	 WebElement SideBar;
	 
	 @FindBy (xpath = "//span[normalize-space()='Masters']")
	 WebElement MastersButton;
	 
	 @FindBy (xpath = "//a[normalize-space()='Company']")
	 WebElement CompanyButton;
	 
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditButton;
	
	@FindBy (xpath = "//input[@placeholder='Enter Company Name']")
	WebElement CompanyName;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Company Address']")
	WebElement CompanyAddress;
	
	@FindBy (xpath = "//input[@placeholder='Enter CEO Name']")
	WebElement CEOName;
	
	@FindBy (xpath = "//input[@placeholder='Enter CEO Number']")
	WebElement CEOContactNumber;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	public CompanyFunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyCompany () throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(2000);
		MastersButton.click();
		
		Thread.sleep(2000);
		CompanyButton.click();
		
		Thread.sleep(2000);
		EditButton.click();
		
		Thread.sleep(2000);
		CompanyName.clear();
		CompanyAddress.clear();
		CEOName.clear();
		CEOContactNumber.clear();
		
		
		Thread.sleep(2000);
		CompanyName.sendKeys(prop.getProperty("CompanyName"));
		
		Thread.sleep(2000);
		CompanyAddress.sendKeys(prop.getProperty("CompanyAddress"));
		
		Thread.sleep(2000);
		CEOName.sendKeys(prop.getProperty("CEOName"));
		
		Thread.sleep(2000);
		CEOContactNumber.sendKeys(prop.getProperty("CEOContactNumber"));
		
		Thread.sleep(2000);
		SaveButton.click();
				
	}
}
