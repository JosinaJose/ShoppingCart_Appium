package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Search extends BasePage {
	public Actions action;
	public WebDriverWait wait;

	
	public Search(AppiumDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2:id/editText")
	public WebElement launch;
	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2:id/editText")
	public WebElement search;
	
	
	
	
	
	
	public void search() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("Shirt");
	}
	
}
