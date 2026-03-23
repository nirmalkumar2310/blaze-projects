package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageObjectModel.CartPagePOM;
import org.pageObjectModel.DemoBlazePagePOM;
import org.pageObjectModel.ProductPagePOM;

import com.reuseableMethods.BaseClass;
import com.utility.FileReaderManager;

public class TestRunner extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
		
		browserLaunch(FileReaderManager.getProperty("browser"));
		urlLaunch(FileReaderManager.getProperty("blazeUrl"));
		
		DemoBlazePagePOM login = new DemoBlazePagePOM();
		login.getDemoBlazePage();
		
		ProductPagePOM product = new ProductPagePOM();
		product.getProductPage();
		
		CartPagePOM cart = new CartPagePOM();
		cart.getCartPage();
	}

}

