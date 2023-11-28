package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CategoriesFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class CategoriesTestCases extends Basetest{
	ValidLoginFunctionality vlf;
	CategoriesFunctionality cf;
	public CategoriesTestCases () {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		cf = new CategoriesFunctionality();
		
	}

	@Test
	public void CategoriesValidation () throws Throwable {
		cf.VerifyCategories();
		WebElement Text = driver.findElement(By.xpath("//td[@class='dataTables_empty']"));
		System.out.println(Text);
		Assert.assertEquals(Text, "No matching records found");
		
//		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	

}
