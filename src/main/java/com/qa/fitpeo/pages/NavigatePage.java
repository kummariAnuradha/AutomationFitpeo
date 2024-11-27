package com.qa.fitpeo.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.fitpeo.base.BaseClass;

public class NavigatePage extends BaseClass{
	public NavigatePage() {
		PageFactory.initElements(driver,this);
	}
	
	public void home(String url) {
		driver.navigate().to(url);
	}
	
	public void RevCalc(String URL) {
		driver.navigate().to(URL);
		
	}

}

