package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CustomerFuntionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement NavigationButton;
	
	@FindBy (xpath = "//span[normalize-space()='Customers']")
	WebElement CustomersNavigationButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add Customer']")
	WebElement AddCustomerNavigation;
	
	@FindBy (xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement CustomerNameField;
	
	@FindBy (xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement CustomerMobileNumber;
	
	@FindBy (xpath = "//input[@placeholder='Enter Email Id']")
	WebElement CustomerEmailId;
	
	@FindBy (xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement CustomerWhatsappNumber;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement CustomerSearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditCustomerButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeleteCustomerButton;
	
	@FindBy (xpath = "/html/body/div[5]/div/div[2]/div[1]/button")
	WebElement YesButton; //Are You Sure

	public CustomerFuntionality() {
		PageFactory.initElements(driver, this);
		
	}
	public void VerifyCustomer() throws Throwable {
		Thread.sleep(2000);
		NavigationButton.click();
		
		Thread.sleep(2000);
		CustomersNavigationButton.click();
		
		Thread.sleep(2000);
		AddCustomerNavigation.click();
		
		Thread.sleep(2000);
		CustomerNameField.sendKeys(prop.getProperty("CustomerName"));
		
		Thread.sleep(2000);
		CustomerMobileNumber.sendKeys(prop.getProperty("MobileNumber"));
		
		Thread.sleep(2000);
		CustomerEmailId.sendKeys(prop.getProperty("EmailId"));
		
		Thread.sleep(2000);
		CustomerWhatsappNumber.sendKeys(prop.getProperty("WHatsAppNumber"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		CustomerSearchField.sendKeys(prop.getProperty("EmailId"));
		
		Thread.sleep(2000);
		EditCustomerButton.click();		
		
		Thread.sleep(2000);
		CustomerEmailId.clear();
		CustomerEmailId.sendKeys(prop.getProperty("MailId"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		CustomerSearchField.sendKeys(prop.getProperty("MailId"));
		
		Thread.sleep(2000);
		DeleteCustomerButton.click();
		
		Thread.sleep(2000);
		YesButton.click();
		
	}
}
