package com.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.MoveStockFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class MoveStockTestCases extends Basetest{

	ValidLoginFunctionality vlf;
	MoveStockFunctionality msf;
	public MoveStockTestCases() {
		super();
		}
	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		msf = new MoveStockFunctionality();
	}
	
	@Test
	public void StockMovevadlidation() throws Throwable {
		msf.VerifyStockMove();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");
		
	}
	
}
