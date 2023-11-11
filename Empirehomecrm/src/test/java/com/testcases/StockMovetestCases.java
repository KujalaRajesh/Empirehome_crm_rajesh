package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.StockMoveFunctionality;
import com.pageobjects.ValidLoginFunctionality;

public class StockMovetestCases extends Basetest{
	ValidLoginFunctionality vlf;
	StockMoveFunctionality smf;
	public StockMovetestCases() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		vlf = new ValidLoginFunctionality();
		vlf.verifyvalidlogin();
		smf = new StockMoveFunctionality();
		
	}

	@Test
	 public void MoveStockValidation() throws Throwable {
		smf.VerifyStockMoveFunctionality();
		
	}
}
