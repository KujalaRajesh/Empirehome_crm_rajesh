package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ConditionFunctionality extends Basetest{
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement MasterButton;
	
	@FindBy (xpath = "//a[normalize-space()='Condition']")
	WebElement ConditionColumn;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewButton;
	
	@FindBy (xpath = "//input[@id='ConditionName']")
	WebElement EnterConditionName;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement SearchBarButton;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeletButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;
	
	public ConditionFunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyCondition () throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(2000);
		MasterButton.click();
		
		Thread.sleep(2000);
		ConditionColumn.click();
		
		Thread.sleep(2000);
		AddNewButton.click();
		
		Thread.sleep(2000);
		EnterConditionName.sendKeys(prop.getProperty("ConditionName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		SearchBarButton.sendKeys(prop.getProperty("ConditionName"));
		
		Thread.sleep(2000);
		EditButton.click();
		
		Thread.sleep(2000);
		EnterConditionName.clear();
		
		Thread.sleep(2000);
		EnterConditionName.sendKeys(prop.getProperty("EditConditionName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		SearchBarButton.sendKeys(prop.getProperty("EditConditionName"));
		
		Thread.sleep(2000);
		DeletButton.click();
		
		Thread.sleep(2000);
		YesButton.click();
		
	}
}
