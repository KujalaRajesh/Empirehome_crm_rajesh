package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LocationFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class LocationTestCase extends Basetest {
	ValidLoginFunctionality vlf;
	LocationFunctionality lf;
	public LocationTestCase () {
		super ();
		
	}

	@BeforeMethod
	public void setup () {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		lf = new LocationFunctionality();
						
	}
	
	@Test
	public void LoactionValidation () throws Throwable {
		lf.VerifyLocation();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Loctation");
	}
}
