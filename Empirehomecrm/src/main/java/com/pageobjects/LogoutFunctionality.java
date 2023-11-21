package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LogoutFunctionality extends Basetest{
	
	@FindBy (xpath = "//img[@alt='user']")
	WebElement UserButton;
	
	@FindBy (xpath = "//a[normalize-space()='Signout']")
	WebElement SignoutButton;
	
	public LogoutFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void VerifyLogoutFunctionality () throws Throwable {
		
		Thread.sleep(2000);
		UserButton.click();
		
		Thread.sleep(2000);
		SignoutButton.click();
		
		
	}
	

}
