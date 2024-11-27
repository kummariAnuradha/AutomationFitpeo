package com.qa.fitpeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fitpeo.base.BaseClass;

public class sliderPage extends BaseClass{
	public sliderPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]") WebElement slider;
	
	
	public void slideAdj() throws InterruptedException {
		int sliderWidth=slider.getSize().getWidth();
		int desiredVal=820;
		double maxVal=2000;
		double offSetPercentage=desiredVal/maxVal;
		int xoffSet=(int)((sliderWidth*offSetPercentage)*11.464);
		Actions action=new Actions(driver);
		action.clickAndHold(slider).moveByOffset(xoffSet, 200).release().perform();
		
	}
}

