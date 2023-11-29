package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ShiftFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class ShiftTestCase extends Basetest{
	ValidLoginFunctionality vlf;
	ShiftFunctionality sf;
	public ShiftTestCase() {
		super ();
		
	}
	
	@BeforeMethod
	public void setup () {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		sf = new ShiftFunctionality();
		}
	
	@Test
	public void ShiftValidation() throws Throwable {
		sf.VerifyShift();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Shifts");
	}
}
