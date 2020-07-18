package com.wordpress.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AutomationPage;
import com.amazon.qa.pages.LoginPage;


public class AutomationTest extends TestBase {

	AutomationPage Automation;

	public AutomationTest() {
		super();
	}


	@BeforeMethod(groups = { "Smoke", "Regression", "SytemTest" })
	public void setup() {
		initialization();
		Automation = new AutomationPage();
	}

	
	  @Test(priority=1,groups = { "Smoke","SytemTest" }) 
	  public void Alert() throws Throwable {
		  Automation.RadioBTN();
		 /* Automation.TextBox("suraj");
		  Automation.DropDown();
		  Automation.CheckOption();
		  Automation.NewWindow();
		  Automation.GetAlert("suraj");
		  Automation.HideText("selenium");
		  Automation.MouseMove();
		  Automation.Iframe();*/
  }
	 
	  @Test(priority=2,groups = { "Smoke","SytemTest" }) 
	  public void acti() throws Throwable {
		 // Automation.RadioBTN();
		  Automation.TextBox("suraj");
		 /* Automation.DropDown();
		  Automation.CheckOption();
		  Automation.NewWindow();
		  Automation.GetAlert("suraj");
		  Automation.HideText("selenium");
		  Automation.MouseMove();
		  Automation.Iframe();*/
  }
	  @Test(priority=3,groups = { "Smoke","SytemTest" }) 
	  public void actip() throws Throwable {
		 // Automation.RadioBTN();
		//  Automation.TextBox("suraj");
		  Automation.DropDown();
		 /* Automation.CheckOption();
		  Automation.NewWindow();
		  Automation.GetAlert("suraj");
		  Automation.HideText("selenium");
		  Automation.MouseMove();
		  Automation.Iframe();*/
  }
	  
	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Switchwindow()
	 * throws Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.SwitchWindow(); log.debug("loginPageTitleTest ends"); }
	 */

	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Switchwindow()
	 * throws Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.NewWindow(); log.debug("loginPageTitleTest ends"); }
	 */

	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Alert() throws
	 * Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.GetAlert("Suraj"); log.debug("loginPageTitleTest ends"); }
	 */

/*	@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void Alert() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.HideText("Suraj Patil");
		log.debug("loginPageTitleTest ends");
	}*/
	/*@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.WebTable();
		log.debug("loginPageTitleTest ends");
	}*/
	
	/*@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.MouseMove();
		log.debug("loginPageTitleTest ends");
	}*/

/*	@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
	
		AutomationPa.Iframe();

	}*/
	@AfterMethod(groups = { "Smoke", "Regression", "SytemTest" })
	public void tearDown(ITestResult result) throws IOException {
	
		//driver.quit();
	}


}
