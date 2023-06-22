package com.testCases;



import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.Search;


public class SearchItem extends BaseClass {
	
	@Test
	public void accessAllow() {
		Search se = new Search(driver);
		se.search();
	}
	

}
