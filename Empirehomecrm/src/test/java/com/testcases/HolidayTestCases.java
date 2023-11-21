package com.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.HolidayFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class HolidayTestCases extends Basetest {
	
	ValidLoginFunctionality vlf;
	HolidayFunctionality hf;
		public HolidayTestCases () {
		super ();
		}
	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		hf = new HolidayFunctionality();
	
		}
	@Test
	public void HolidayValidation() throws Throwable {
		hf.VerifyHoliday();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
	}
}
