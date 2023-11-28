package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.SubCategoriesFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class SubCategoriesTestCase extends Basetest {
	ValidLoginFunctionality vlf;
	SubCategoriesFunctionality scf;
	public SubCategoriesTestCase () {
		super ();
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		scf = new SubCategoriesFunctionality();
		
	}
	
	@Test
	public void SubCategoriesValidation () throws Throwable {
		scf.VerifySubCategories();	
	}
}
