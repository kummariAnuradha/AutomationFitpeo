package com.qa.fitpeo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.fitpeo.base.BaseClass;
import com.qa.fitpeo.pages.NavigatePage;

public class Navigate extends BaseClass {
    WebDriver driver;
	NavigatePage h;
	
	//constructor to call super class 
	public Navigate() throws IOException {
		super();
	}
	@BeforeClass    //executes before any test methods in the current class
	public void setup(){
	    initialization();
	   h=new NavigatePage();
	}
	
	@Test(priority=1)
	public void navigate() {
		h.home(props.getProperty("home"));
	}
	
	@Test(priority=2)
	public void RevenuePage() {
		h.RevCalc(props.getProperty("revenue"));
	}
	

}
