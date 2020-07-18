package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class PracticeForm extends TestBase{
	@FindBy(id ="button1")
	WebElement window;
	
	@FindBy(name ="courses-iframe")
	WebElement Iframe;
	
	public PracticeForm() {
		PageFactory.initElements(driver, this);
	}

	public void Windowbtn() throws Throwable {
		// Action.isSelected(driver, Radio);
		Action.click(driver, window);
	}

}
