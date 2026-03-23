package org.pageObjectModel;

import java.io.IOException;

import org.interfaceElements.ProductPageElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuseableMethods.BaseClass;

public class ProductPagePOM extends BaseClass implements ProductPageElement {

	@FindBy(linkText=phones_linkText)
	private WebElement phones;
	
	@FindBy(xpath=galaxyS7_xpath)
	private WebElement galaxyS7;
	
	@FindBy(xpath=cartBtn_xpath)
	private WebElement cartBtn;
	
	
	public ProductPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	public void getProductPage() throws Throwable {
		elementClick(phones);
		elementClick(galaxyS7);
		elementClick(cartBtn);
		staticWait(5000);
		try {
			takeScreenshot("C:\\Users\\nirma\\eclipse-workspace\\MavenProject\\screenshots\\snap1.png");
		} catch (IOException e) {
		}
		alertHandle("ok");
	}
	
}
