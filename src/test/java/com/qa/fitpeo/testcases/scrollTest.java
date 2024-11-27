package com.qa.fitpeo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.fitpeo.base.BaseClass;
import com.qa.fitpeo.pages.NavigatePage;
import com.qa.fitpeo.pages.scrollPage;

public class scrollTest extends BaseClass{
	    WebDriver driver;
	    NavigatePage n;
		scrollPage s;
		
		//constructor to call super class 
		public scrollTest() throws IOException {
			super();
		}
		@BeforeClass    //executes before any test methods in the current class
		public void setup(){
		    initialization();
		    n=new NavigatePage();
		    s=new scrollPage();
		}
		
		@Test(priority=1)
		public void rev() {
			n.RevCalc(props.getProperty("revenue"));
		}

		@Test(priority=2)
		public void scrslide() {
			s.scroll();
			
		}
}

