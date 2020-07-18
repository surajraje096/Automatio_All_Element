package com.wordpress.qa.testcases;

import java.io.IOException;
import java.util.Properties;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.PracticeForm;
import com.amazon.qa.pages.SelectItam;




public class PracticeFormTest extends TestBase {

	
	PracticeForm PracticeFor;
	
	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		PracticeFor = new PracticeForm();
	}
	@Test(priority=1,groups = { "Regression"})
	public void loginPageTitleTest() throws Throwable {
		
	
		Thread.sleep(3000);
		PracticeFor.Windowbtn();
		//Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	}
	
	
	
	@AfterMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void tearDown(ITestResult result) throws IOException {
	
		driver.quit();
	}

	
	
}
