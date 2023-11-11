package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ProductAddFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class ProductAddTestCases extends Basetest {
	ValidLoginFunctionality vlf;
	ProductAddFunctionality paf;
	public ProductAddTestCases () {
		super();
		
	}
	
@BeforeMethod
public void setup() {
	initialization();
	vlf = new ValidLoginFunctionality();
	paf = new ProductAddFunctionality();
	
}
@Test
public void ProductAddValidation() throws Throwable {
	vlf.verifyvalidlogin();
	paf.VerifyProductAdd();
	String url =  driver.getCurrentUrl();
	org.testng.Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	
	
	
}

}
