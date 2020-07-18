package com.wordpress.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.SelectItam;


public class SelectItamTest extends TestBase{
	
	SelectItam SelectIta;
	
	public SelectItamTest() {
		super();
	}
	


	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		SelectIta = new SelectItam();
	}
	@Test(priority=1,groups = { "Regression"})
	public void loginPageTitleTest() throws Throwable {

	
		Thread.sleep(3000);
		SelectIta.SelectItem(prop.getProperty("Itam"));
		//Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	
	
	@AfterMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void tearDown(ITestResult result) throws IOException {
	
		driver.quit();
	}

	
	

}
