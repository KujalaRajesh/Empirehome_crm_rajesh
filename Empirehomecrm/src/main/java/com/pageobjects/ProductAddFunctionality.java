package com.pageobjects;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

import io.opentelemetry.api.internal.Utils;


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
	WebElement Itemdescription ;
	
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
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement itemsavebutton;
	
	public ProductAddFunctionality() {
		PageFactory.initElements(driver,this );
	}
	
	public void VerifyProductAdd(String ModelNumber, String ItemTitle, String ItemDescription, String Height, String Width, String Breadth, String ColorName, String ActualPrice, String Qty) throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(3000);
		InventoryButton.click();
		
		Thread.sleep(2000);
		AddInventoryButton.click();
		
		Thread.sleep(2000);
		ModelNumberinput.sendKeys(ModelNumber);
		
		Thread.sleep(2000);
		itemTitle.sendKeys(ItemTitle);
		
		Thread.sleep(2000);
		Itemdescription.sendKeys(ItemDescription);
		
		Thread.sleep(2000);
		itemHeight.sendKeys(Height);
		
		Thread.sleep(2000);
		itemWidth.sendKeys(Width);
		
		Thread.sleep(2000);
		itemBreadth.sendKeys(Breadth);
		
		Thread.sleep(2000);
		itemColorName.sendKeys(ColorName);
		
		Thread.sleep(2000);
		itemEnterActualPrice.sendKeys(ActualPrice);
		
		Thread.sleep(2000);
		itemqty.sendKeys(Qty);
		
		Thread.sleep(2000);
		com.utils.Utils.actions(driver, itemPrimaryImageUpload);
		
		Thread.sleep(2000);
		Robot Rb = new Robot();
		StringSelection path = new StringSelection("\"C:\\Users\\Admin\\OneDrive\\Pictures\\Saved Pictures\\Dinning Table.webp\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Rb.keyPress(KeyEvent.VK_CONTROL);
		Rb.keyPress(KeyEvent.VK_V);
		Rb.keyRelease(KeyEvent.VK_CONTROL);
		Rb.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(3000);
		Rb.keyPress(KeyEvent.VK_ENTER);
		Rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		itemsavebutton.click();
		
	}
	
}
