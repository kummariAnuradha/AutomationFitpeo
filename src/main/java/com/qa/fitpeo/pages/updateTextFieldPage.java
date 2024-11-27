package com.qa.fitpeo.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fitpeo.base.BaseClass;
import com.qa.saucedemo.utils.TestUtils;

public class updateTextFieldPage extends BaseClass{
	public updateTextFieldPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]") WebElement slider;
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]") WebElement slid;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div/input") WebElement text;
		
	public void update() throws InterruptedException, IOException {
		int Val=560;
		text.clear();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1];",text,Val);	
	}
}

