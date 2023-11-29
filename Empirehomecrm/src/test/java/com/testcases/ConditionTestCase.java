package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ConditionFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class ConditionTestCase extends Basetest {
	ValidLoginFunctionality vlf;
	ConditionFunctionality cf;
	public ConditionTestCase() {
		super ();
	
	}
		
	@BeforeMethod
	public void setup () {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		cf = new ConditionFunctionality();
	}
	@Test
	public void ConditionValidation() throws Throwable {
		cf.VerifyCondition();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Condition");
	}
	
	
}

