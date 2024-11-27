package com.qa.fitpeo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fitpeo.base.BaseClass;

public class selectCptCodes extends BaseClass{
	public selectCptCodes() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]") WebElement cp;
	@FindBy(xpath="//body/div[@class='MuiBox-root css-3f59le']/div[@class='MuiBox-root css-rfiegf']/div[@class='MuiBox-root css-1p19z09']/div[1]/label[1]/span[1]") WebElement cpt;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input") WebElement cpt53;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]") WebElement cp54;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[3]/label[1]/span[1]/input[1]") WebElement cpt54;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[8]")WebElement cp74;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[8]/label[1]/span[1]/input[1]") WebElement cpt74;
	@FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 inter css-1bl0tdj'][normalize-space()='$27000']") WebElement month;
	
	public void checkbox() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cp);
		Thread.sleep(2000);
	    cpt.click();
	    cpt53.click();
	    Thread.sleep(2000);
	    JavascriptExecutor jS=(JavascriptExecutor)driver;
		jS.executeScript("arguments[0].scrollIntoView(true);", cp54);
		cpt54.click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true);", cp74);
		cpt74.click();
		Thread.sleep(2000);  
		String text=month.getText();
		System.out.println(text);
	}
}

