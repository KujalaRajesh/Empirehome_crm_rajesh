package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginfunctionality extends Basetest {

   @FindBy (xpath="//input[@placeholder='example@gmail.com']")   
   WebElement userid;
	
   @FindBy (name="pword")
   WebElement pass;
  
   
   @FindBy (xpath="//button[text()='Login']")
   WebElement loginbutton;
   
   public Loginfunctionality() {           //constructor
	   
	   PageFactory.initElements(driver,this);
   }
   
   
   public void verifylogin(String username, String password) throws InterruptedException {
	   
	  userid.sendKeys(username); 
	  Thread.sleep(2000);
	  
	   pass.sendKeys(password);
	   Thread.sleep(2000);
	   
	   loginbutton.click();
	   Thread.sleep(2000);
   }
   
	
}