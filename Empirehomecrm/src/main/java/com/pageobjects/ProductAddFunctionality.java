package com.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ProductAddFunctionality extends Basetest {
	@FindBy (xpath="//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Inventory']")
	WebElement InventoryButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add Inventory']")
	WebElement AddInventoryButton;
	
	@FindBy (xpath = "//input[@name='ModelNumber']")
	WebElement ModelNumberinput;
	
	@FindBy (xpath = "//textarea[@name='Title']")
	WebElement itemTitle ;
	
	@FindBy (xpath = "//textarea[@name='ItemDescription']")
	WebElement ItemDescription ;
	
	@FindBy (xpath = "//input[@placeholder='Enter Height']")
	WebElement itemHeight;
		
	@FindBy (xpath = "//input[@placeholder='Enter Width']")
	WebElement itemWidth;
	
	@FindBy (xpath ="//input[@placeholder='Enter Breadth']")
	WebElement itemBreadth;
	
	@FindBy (xpath ="//input[@name='ColorName']")
	WebElement itemColorName;
	
	@FindBy(xpath ="//input[@placeholder='Enter Actual Price']")
	WebElement itemEnterActualPrice;
	
	@FindBy (xpath = "\"//*[@id=\\\"lobicard-custom-control1\\\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span\")")
	WebElement itemMRPfactor;
	
	@FindBy (xpath = "//li[contains(text(), '1.00')]")
	WebElement mrpFactorInput;
	
	@FindBy(xpath ="//input[@placeholder='Enter MRPPrice']")
	WebElement itemMRPPrice;

	@FindBy (xpath ="//input[@placeholder='Enter Qty ']")
	WebElement itemqty;
	
	@FindBy (xpath ="//input[@name='ProductMainImageUploaded']")
	WebElement itemPrimaryImageUpload;
	
	@FindBy(xpath ="//buttun[@class='submit']")
	WebElement itemsavebutton;
	
	public ProductAddFunctionality() {
		PageFactory.initElements(driver,this );
	}
	
	public void VerifyProductAdd() throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(3000);
		InventoryButton.click();
		
		Thread.sleep(2000);
		AddInventoryButton.click();
		
		Thread.sleep(2000);
		ModelNumberinput.sendKeys("12abcd");
		
	}
	
}
