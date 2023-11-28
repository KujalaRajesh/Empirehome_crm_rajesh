package com.pageobjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class SubCategoriesFunctionality extends Basetest {
	
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
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SubSideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement SubMastersButton;
	
	@FindBy (xpath = "//a[normalize-space()='Sub Categories']") 
	WebElement SubCategoriesButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Sub Category']") 
	WebElement AddNewSubCategory;
	
	@FindBy (xpath = "//select[@id='subcatDD']")
	WebElement SubCategoryDrop;
	
	@FindBy (xpath = "//a[normalize-space()='Sub Categories']") 
	WebElement SubCategoryNameDropDown;
		
	@FindBy (xpath = "//input[@id='SubCategoryName']") 
	WebElement SubCategoriesName;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SubSaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement SubSearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement SubEditButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']|")
	WebElement SubSearch;
	
	@FindBy (xpath = "//button[@data-toggle='modal']")
	WebElement SubDeletButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;
	
	public SubCategoriesFunctionality() {
		PageFactory.initElements(driver, this);
		
	}
	 public void VerifySubCategories () throws Throwable {
		 
		 	Thread.sleep(2000);
			SideBar.click();
			
			Thread.sleep(2000);
			MastersButton.click();
			
			Thread.sleep(2000);
			CategoriesButton.click();
			
			Thread.sleep(2000);
			AddNewCategory.click();
			
			Thread.sleep(2000);
			CategoryName.sendKeys(prop.getProperty("SubCategoryName"));
//			
			Thread.sleep(2000);
			SaveButton.click();
			
			Thread.sleep(2000);
			SubSideBar.click();
			
			Thread.sleep(2000);
			SubMastersButton.click();

			Thread.sleep(2000);
			SubCategoriesButton.click();
			
			Thread.sleep(2000);
			AddNewSubCategory.click();
			
			Thread.sleep(2000);
			SubCategoryDrop.click();
			
//			Thread.sleep(2000);
//			SubCategoryNameDropDown.click();
			
			Thread.sleep(2000);
			Utils.dropdowns(SubCategoryDrop, "Apple");
			SubCategoryDrop.sendKeys(Keys.ENTER);
			
//			Thread.sleep(2000);
//			CategoryName.sendKeys(prop.getProperty("SubCategoryName"));
//			
			Thread.sleep(2000);
			SubCategoriesName.sendKeys(prop.getProperty("SubCategoryTypeName"));
			
			Thread.sleep(2000);
			SubSaveButton.click();
			
			Thread.sleep(2000);
			SubEditButton.click();
			
			Thread.sleep(2000);
			SubCategoriesName.clear();
			SubCategoriesName.sendKeys(prop.getProperty("EditSubCategoriesTypeName"));
			
			Thread.sleep(2000);
			SubSaveButton.click();
						
			Thread.sleep(2000);
			SubSearch.click();
			SubSearch.sendKeys(prop.getProperty("EditSubCategoriesTypeName"));
			
			Thread.sleep(2000);
			SubDeletButton.click();
			
			Thread.sleep(2000);			
			YesButton.click();
	 }
	
	

}
