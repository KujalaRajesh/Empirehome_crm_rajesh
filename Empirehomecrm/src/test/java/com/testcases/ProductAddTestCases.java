package com.testcases;
import com.utils.Productaddexcel;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ProductAddFunctionality;
import com.pageobjects.ValidLoginFunctionality;


public class ProductAddTestCases extends Basetest {
	private final String sheetname = "Sheet1";
	ValidLoginFunctionality vlf;
	ProductAddFunctionality paf;
	public ProductAddTestCases () {
		super();
		
	}
	@DataProvider
	public Object[][] dataload() throws Throwable{
		return Productaddexcel.Customerdata(sheetname);
	}
	
	
@BeforeMethod
public void setup() {
	initialization();
	vlf = new ValidLoginFunctionality();
	paf = new ProductAddFunctionality();
	
}
@Test (dataProvider = "dataload" , dataProviderClass = ProductAddTestCases.class)
public void ProductAddValidation(String ModelNumber, String ItemTitle, String ItemDescription, String Height, String Width, String Breadth, String ColorName, String ActualPrice, String Qty) throws Throwable {
	vlf.verifyvalidlogin();
	paf.VerifyProductAdd(ModelNumber,ItemTitle,ItemDescription,Height,Width,Breadth,ColorName,ActualPrice,Qty);
	String url =  driver.getCurrentUrl();
	org.testng.Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	
	
	
}

}
