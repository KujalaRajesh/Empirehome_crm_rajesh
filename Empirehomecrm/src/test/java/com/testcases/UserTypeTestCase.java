package com.testcases;

import org.apache.xmlbeans.UserType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ValidLoginFunctionality;
import com.pageobjects.UserTypeFunctionality;

public class UserTypeTestCase extends Basetest{

	ValidLoginFunctionality vlf;
	UserTypeFunctionality utf;
	public UserTypeTestCase() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		utf = new UserTypeFunctionality();
		
	}
	@Test
	public void VerifyUserType() throws Throwable {
		utf.UserTypeValidation();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
		
		}
}
