package com.qa.fitpeo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.fitpeo.base.BaseClass;
import com.qa.fitpeo.pages.NavigatePage;
import com.qa.fitpeo.pages.scrollPage;
import com.qa.fitpeo.pages.sliderPage;

public class sliderTest extends BaseClass{
	    WebDriver driver;
	    NavigatePage n;
		scrollPage s;
		sliderPage sp;
		
		//constructor to call super class 
		public sliderTest() throws IOException {
			super();
		}
		@BeforeClass    //executes before any test methods in the current class
		public void setup(){
		    initialization();
		    n=new NavigatePage();
		    s=new scrollPage();
		    sp=new sliderPage();
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
		public void adslide() throws InterruptedException {
			sp.slideAdj();
		}

}
