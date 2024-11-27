package com.qa.fitpeo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.fitpeo.base.BaseClass;
import com.qa.fitpeo.pages.NavigatePage;
import com.qa.fitpeo.pages.scrollPage;
import com.qa.fitpeo.pages.sliderPage;
import com.qa.fitpeo.pages.updateTextFieldPage;
import com.qa.fitpeo.utils.testUtils;
import com.qa.saucedemo.utils.TestUtils;

public class updateTextFieldTest extends BaseClass{
	 WebDriver driver;
	    NavigatePage n;
		scrollPage s;
		updateTextFieldPage up;
		
		//constructor to call super class 
		public updateTextFieldTest() throws IOException {
			super();
		}
		@BeforeClass    //executes before any test methods in the current class
		public void setup(){
		    initialization();
		    n=new NavigatePage();
		    s=new scrollPage();
		    up=new updateTextFieldPage();
		}
		
		@Test(priority=1)
		public void rev() {
			n.RevCalc(props.getProperty("revenue"));
		}

		@Test(priority=2)
		public void scrslide() {
			s.scroll();
			
		}
		
		@Test(priority=3)
		public void updateText() throws InterruptedException, IOException {
			up.update();
			testUtils.takeScreenshot("slider.png");
		}


}

