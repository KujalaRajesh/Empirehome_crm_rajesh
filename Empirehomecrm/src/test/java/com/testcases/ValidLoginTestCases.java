package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.base.Basetest;
import com.pageobjects.ValidLoginFunctionality;

public class ValidLoginTestCases extends Basetest{
	ValidLoginFunctionality vlf;
	public ValidLoginTestCases() {
		super();
		
	}

	@BeforeMethod
	public void loginsetup() {
		initialization();
		vlf = new ValidLoginFunctionality();
	}
	
	@Test
	public void verifylogin() {
		vlf.verifyvalidlogin();
		WebElement DashBoardText = driver.findElement(By.xpath("//div[@class='header-title']"));
		Assert.assertTrue(DashBoardText.isDisplayed(), "LoginFailed");
	}
}
