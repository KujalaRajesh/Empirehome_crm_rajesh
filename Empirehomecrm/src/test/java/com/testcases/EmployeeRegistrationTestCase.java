package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.EmployeeRegistrationFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class EmployeeRegistrationTestCase extends Basetest{
	
	ValidLoginFunctionality vlf;
	EmployeeRegistrationFunctionality ertc;
	public 	EmployeeRegistrationTestCase () {
		super ();
	}

	@BeforeMethod 
	public void setup () {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		ertc = new EmployeeRegistrationFunctionality();
		
	}	
	
	@Test
	 public void EmployeeRegistrationvalidation () throws Throwable {
		ertc.verifyemployeeregistration();
//		String url = driver.getCurrentUrl();
//		org.testng.Assert.assertEquals(url,null);
	}
	
}
