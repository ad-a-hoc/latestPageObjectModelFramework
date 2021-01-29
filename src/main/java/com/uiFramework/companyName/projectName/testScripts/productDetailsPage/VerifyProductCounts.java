package com.uiFramework.companyName.projectName.testScripts.productDetailsPage;

import org.testng.annotations.Test;

import com.uiFramework.companyName.projectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.projectName.pageObject.ApplicationText;
import com.uiFramework.companyName.projectName.pageObject.LoginPage;
import com.uiFramework.companyName.projectName.pageObject.NavigationMenu;
import com.uiFramework.companyName.projectName.pageObject.ProductCategoryPage;
import com.uiFramework.companyName.projectName.testbase.TestBase;


/**
 * @author Bhanu Pratap
 */
public class VerifyProductCounts extends TestBase{
	
	LoginPage loginPage;
	NavigationMenu navigationMenu;
	
	@Test
	public void testVerifyProductCounts(){
		
		navigationMenu = new NavigationMenu(driver);
		ProductCategoryPage pCate = navigationMenu.clickOnMenu(navigationMenu.womenMenu);
		
		pCate.selectColor(ApplicationText.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==3){
			AssertionHelper.markPass();
		}
		else{
			AssertionHelper.markFail("product count is not matching");
		}
	}
}
