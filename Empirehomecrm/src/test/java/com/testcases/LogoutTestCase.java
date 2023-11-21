package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LogoutFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class LogoutTestCase extends Basetest {
	
	ValidLoginFunctionality vlf;
	LogoutFunctionality lf;
	public LogoutTestCase () {
		super ();
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		lf = new LogoutFunctionality();
		
	}
	
	@Test
	public void LogoutValidation() throws Throwable {
		lf.VerifyLogoutFunctionality();
		String link = driver.getCurrentUrl();
		System.out.println(link);
		Assert.assertEquals(link, "http://empirehome.myprojectsonline.co.in/");
	}
	
}
