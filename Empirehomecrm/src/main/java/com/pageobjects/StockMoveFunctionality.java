package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class StockMoveFunctionality extends Basetest {
	@FindBy (xpath="//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Inventory']")
	WebElement InventoryButton;
	
	@FindBy (xpath = "//a[text()='Move Stock']")
	WebElement MoveStockButton;
	
	public StockMoveFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void VerifyStockMoveFunctionality() throws Throwable {
		Thread.sleep(2000);
		SideBar.click();
		
		Thread.sleep(2000);
		InventoryButton.click();
		
		Thread.sleep(2000);
		MoveStockButton.click();
		
	}
}
