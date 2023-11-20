package com.pageobjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.Basetest;
import com.utils.Utils;


public class MoveStockFunctionality extends Basetest{
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement SideBar;
	
	@FindBy (xpath = "//span[normalize-space()='Inventory']")
	WebElement InventoryButton;
	
	@FindBy (xpath = "//a[normalize-space()='Move Stock']")
	WebElement MoveStock;
	
	@FindBy (xpath = "//select[@id='movedFromD']")
	WebElement MoveFrom;
	
	@FindBy (xpath = "//select[@id='movedToD']")
	WebElement MoveTo;
	
	@FindBy (xpath = "//span[@id='select2-invId-container']")
	WebElement ModelNumber;
	
	@FindBy (xpath= "//input[@role='textbox']")
	WebElement TextBox;
	
	@FindBy (xpath = "//input[@id='qtymoving']")
	WebElement MovingQty;
	
	@FindBy (xpath = "//input[@id='btnAdd']")
	WebElement AddButton;
	
	@FindBy (xpath = "//input[@id='MoStNot']")
	WebElement ReferenceNotes;
	
	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement SaveButton;
	
	public MoveStockFunctionality() {
		PageFactory.initElements(driver, this);
}
public void VerifyStockMove() throws Throwable{
	Thread.sleep(2000);
	SideBar.click();
	
	Thread.sleep(2000);
	InventoryButton.click();
	
	Thread.sleep(2000);
	MoveStock.click();
	
	Thread.sleep(2000);
	Select s1 = new Select(MoveFrom);
	s1.selectByVisibleText("Warehouse");
	
	Thread.sleep(2000);	
	Select s2 = new Select(MoveTo);
	s2.selectByVisibleText("Showroom");
	
	Thread.sleep(2000);
	ReferenceNotes.sendKeys(prop.getProperty("Notes"));
	
	Utils.actions(driver, ModelNumber);
	TextBox.sendKeys(prop.getProperty("ModelNumber"));
	TextBox.sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
	MovingQty.sendKeys(prop.getProperty("MovingQty"));
	
	Thread.sleep(2000);
	AddButton.click();
	
	Thread.sleep(2000);
	SaveButton.click();
	
	Thread.sleep(2000);
	driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
	
	Thread.sleep(2000);
	s1.selectByVisibleText("Showroom");
	
	Thread.sleep(2000);
	s2.selectByVisibleText("Warehouse");
	
	Thread.sleep(2000);
	ReferenceNotes.sendKeys(prop.getProperty("Notes2"));
	
	Utils.actions(driver, ModelNumber);
	TextBox.sendKeys(prop.getProperty("ModelNumber"));
	TextBox.sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
	MovingQty.sendKeys(prop.getProperty("MovingQty"));
	
	Thread.sleep(2000);
	AddButton.click();
	
	Thread.sleep(2000);
	SaveButton.click();
	
	}
}