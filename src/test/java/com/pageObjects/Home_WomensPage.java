package com.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Home_WomensPage extends BasePage {
	public Actions action;
	public WebDriverWait wait;


	public Home_WomensPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Womens\"]/android.widget.TextView")
	public WebElement womensBtn;
	
	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2.dashboard:id/itemImage")
	public WebElement newArrivals;
	
	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2.search:id/filterBy")
	public WebElement filterBtn;
	
	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2.search:id/barButton")
	public WebElement size;

	@AndroidFindBy(id = "co.tapcart.app.id_Gu9VwXUXx2.search:id/recyclerView")
	public WebElement checkBoxes;
		
	@AndroidFindBy(className = "android.view.View")
    private List<WebElement> checkboxes;
	
	@AndroidFindBy(id= "co.tapcart.app.id_Gu9VwXUXx2.search:id/name")
    private List<WebElement> checkboxesName;
	
	@AndroidFindBy(id= "co.tapcart.app.id_Gu9VwXUXx2.search:id/selectedBox")
    private List<WebElement> check;
	
	
	//********************************Action Methods*********************************//	
	
	
	public void womensSecBtn() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(womensBtn));
		womensBtn.click();
		
	}
	public void newArrivals() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(newArrivals));
		newArrivals.click();
	}
	public void filterOption() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(filterBtn));
		filterBtn.click();
	}
	public void sizeBtn() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(size));
		size.click();
	}
	public List<WebElement> checkBoxes() {
		wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfAllElements(checkboxes));
	}
	public List<WebElement> checkBoxexName(){
		wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfAllElements(checkboxesName));
	}
	public List<WebElement> check(){
		wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfAllElements(check));
		
	}



}
