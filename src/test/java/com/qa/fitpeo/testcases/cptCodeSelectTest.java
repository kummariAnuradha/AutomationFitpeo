package com.qa.fitpeo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.fitpeo.base.BaseClass;
import com.qa.fitpeo.pages.NavigatePage;
import com.qa.fitpeo.pages.scrollPage;
import com.qa.fitpeo.pages.selectCptCodes;
import com.qa.fitpeo.pages.sliderPage;

public class cptCodeSelectTest extends BaseClass{
	WebDriver driver;
    NavigatePage n;
	selectCptCodes cp;
	
	public cptCodeSelectTest() throws IOException {
		super();
	}
	
	@BeforeClass    //executes before any test methods in the current class
	public void setup(){
	    initialization();
	    n=new NavigatePage();
	    cp=new selectCptCodes();
	}
	
	@Test(priority=1)
	public void revenuee() {
		n.RevCalc(props.getProperty("revenue"));
	}
	
	@Test(priority=2)
	public void scrAndClick() throws InterruptedException {
		cp.checkbox();
		
	}

}