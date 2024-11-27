package com.qa.fitpeo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fitpeo.base.BaseClass;

public class scrollPage extends BaseClass{
	public scrollPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]") WebElement slider;
	
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", slider);
		if(slider.isDisplayed()) {
			System.out.println("Element is visible");
		}
		else{
			System.out.println("Element is not visible");
		}
	}
}

