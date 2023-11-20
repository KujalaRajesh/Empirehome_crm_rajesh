package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CustomerFuntionality;
import com.pageobjects.ValidLoginFunctionality;

public class CustomerTestCases extends Basetest {
	ValidLoginFunctionality vlf;
	CustomerFuntionality ctf;
	public CustomerTestCases() {
		super();
		
	}
	@BeforeMethod
	public void setup () {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		ctf=new CustomerFuntionality();
		
	}
	@Test
	public void CustomerValidation() throws Throwable {
		ctf.VerifyCustomer();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/User/CustomerList");
	}
}
