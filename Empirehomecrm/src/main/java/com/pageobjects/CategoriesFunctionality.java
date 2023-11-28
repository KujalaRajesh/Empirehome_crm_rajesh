package com.pageobjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CategoriesFunctionality extends Basetest{
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement MastersButton;
	
	@FindBy (xpath = "//a[normalize-space()='Categories']")
	WebElement CategoriesButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Category']")
	WebElement AddNewCategory;
	
	@FindBy (xpath = "//input[@id='CategoryName']")
	WebElement CategoryName;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement CategorySearchField;
	
	@FindBy (xpath = "//tbody/tr[1]/td[3]/a[1]/button[1]")
	WebElement EditButton;
	
	@FindBy (xpath = "//a[1]//button[1]")
	WebElement CategoryNameEdited;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeletButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;
			
	public CategoriesFunctionality() {
		PageFactory.initElements(driver, this);
		
	}
	public void VerifyCategories () throws Throwable {
		
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(2000);
		MastersButton.click();
		
		Thread.sleep(2000);
		CategoriesButton.click();
		
		Thread.sleep(2000);
		AddNewCategory.click();
		
		Thread.sleep(2000);
		CategoryName.sendKeys(prop.getProperty("CategoryName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		CategorySearchField.sendKeys(prop.getProperty("CategoryName"));
		
		Thread.sleep(2000);
		EditButton.click();
		
		Thread.sleep(2000);
		CategoryName.clear();
		CategoryName.sendKeys(prop.getProperty("EditesCategoryName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		CategorySearchField.sendKeys(prop.getProperty("EditesCategoryName"));
		
		Thread.sleep(2000);
		DeletButton.click();
		
		Thread.sleep(2000);
		YesButton.click();
		
		Thread.sleep(2000);
		CategorySearchField.sendKeys(prop.getProperty("EditesCategoryName"));
		
		}
	
}
