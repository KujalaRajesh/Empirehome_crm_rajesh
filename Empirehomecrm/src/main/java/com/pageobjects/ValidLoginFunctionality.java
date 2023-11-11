package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ValidLoginFunctionality extends Basetest {
	@FindBy (xpath = "//input[@placeholder='example@gmail.com']")
			WebElement UserName;
	
	@FindBy(xpath = "//input[@title='Please enter your password']")
		WebElement Password;
	
	@FindBy (xpath = "//button[@class='btn green_btn']")
		WebElement LoginButton;
	
	public ValidLoginFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void verifyvalidlogin() {
		UserName.sendKeys(prop.getProperty("username"));
		Password.sendKeys(prop.getProperty("password"));
		LoginButton.click();
		
		
	}
}
