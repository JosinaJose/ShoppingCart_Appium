package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.pageObjects.Home_WomensPage;
import com.utilities.Reporting;

import io.appium.java_client.MobileElement;

public class Home_WomensSection extends BaseClass {
	
	public ExtentTest test;
	public ExtentReports extent;
	
	@BeforeClass
	public void preCondition() {
		Home_WomensPage womens = new Home_WomensPage(driver);
		womens.womensSecBtn();
		womens.newArrivals();
		womens.filterOption();
		womens.sizeBtn();
	}
	
	
	
	 // Check if the checkbox is initially checked or unchecked
	//Verification of initial checkbox state: 
	@Test(priority=1)
	public void womensSectionCheckBoxes() {
		
		Home_WomensPage womens = new Home_WomensPage(driver);
		
		List<WebElement>check=womens.check(); //List of check boxes
		// Iterate through the checkboxes 
		for(WebElement checkbox:check ) {
			  
			// Get the checked attribute of each checkbox
			
			 String checkedAttribute = checkbox.getAttribute("checked");
			  // Check if the checkbox is initially checked or unchecked
	            boolean isChecked = (checkedAttribute != null && checkedAttribute.equals("true"));
	            
	         // Perform the assertion based on the expected initial state

			if (isChecked) {   // is there any check boxes selected or not
				 System.out.println("Checkbox is initially checked.");
             
                
            } else {
            	 System.out.println("Checkbox is initially unchecked.");
              
            }
        }
	
	}
	
	
	// Printing and validating the check boxes name 
	
	@Test(priority =2)
	public void nameCheckBoxes() {
		
		Home_WomensPage womens = new Home_WomensPage(driver);
				
		 List<WebElement> name=womens.checkBoxexName(); 
		for (WebElement checkbox : name) {
            String checkboxName = checkbox.getText();
            System.out.println("Checkbox name: " + checkboxName);
        }
	}
	
	@Test(priority = 3)
	public void multipleSelectionChek() {
           Home_WomensPage womens = new Home_WomensPage(driver);
		
		   List<WebElement>checkboxes=womens.check();
		   System.out.println(checkboxes.size());
		   int[] selectedIndices = {0, 2, 4}; // Set the indices of the checkboxes to select
		   for (int index : selectedIndices) {
			   if (index >= 0 && index < checkboxes.size()) {
	                WebElement checkbox = checkboxes.get(index);
	                checkbox.click();
	            }
	        }
		   
		   // Validate the selected checkboxes
	        int validationCount = 0;
	        for (int index : selectedIndices) {
	            if (index >= 0 && index < checkboxes.size()) {
	                WebElement checkbox = checkboxes.get(index);
	                if (!checkbox.isSelected()) {
	                    validationCount++;
	                }
	            }
	        }
	     // Perform the validation
	        if (validationCount == selectedIndices.length) {
	            System.out.println("Selected checkboxes are validated successfully.");
	        } else {
	            System.out.println("Validation failed. Selected checkboxes count does not match.");
	        }
		   
	
	}
	
	     @Test(priority=4)
		 public void allCheckBoxesSelected() {
        		 Home_WomensPage womens = new Home_WomensPage(driver);
        	        // Fetch the checkboxes from the DOM
        	        List<WebElement> checkboxes = womens.check();
        	        // Select all checkboxes
        
        	        	for(int i=0;i<checkboxes.size();i++) {
        	        		WebElement checkbox = checkboxes.get(i);
        	                checkbox.click();
        	       
                       }
        	        	  // Validate the selection of all checkboxes
        	            for (int i = 0; i < checkboxes.size(); i++) {
        	              WebElement checkbox = checkboxes.get(i);
        	                boolean isSelected = checkbox.isSelected();
        	                if (isSelected) {
        	                    System.out.println("All the checkboxes are selected ");
        	                }
        	              
        	            }
	}
	
}
