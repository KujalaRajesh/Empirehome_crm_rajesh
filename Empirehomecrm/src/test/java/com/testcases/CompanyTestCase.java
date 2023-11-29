package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CompanyFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class CompanyTestCase extends Basetest{
	ValidLoginFunctionality vlf;
	CompanyFunctionality cf;
	public CompanyTestCase() {
		super ();
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		cf = new CompanyFunctionality();
				
	}
	@Test
	public void CompanyValidation() throws Throwable {
		cf.VerifyCompany();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Company");
	}
	
}
