package org.pageObjectModel;

import java.io.IOException;

import org.interfaceElements.CartPageElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuseableMethods.BaseClass;

public class CartPagePOM extends BaseClass implements CartPageElement{
	
	@FindBy(id=cart_id)
	private WebElement cart;
	
	@FindBy(xpath=placeOrder_xpath)
	private WebElement placeOrder;
	
	@FindBy(xpath=name_xpath)
	private WebElement name;
	
	@FindBy(xpath=country_xpath)
	private WebElement country;
	
	@FindBy(xpath=city_xpath)
	private WebElement city;
	
	@FindBy(xpath=creditCard_xpath)
	private WebElement creditCard;
	
	@FindBy(xpath=month_xpath)
	private WebElement month;
	
	@FindBy(xpath=year_xpath)
	private WebElement year;
	
	@FindBy(xpath=purchase_xpath)
	private WebElement purchase;
	
	@FindBy(xpath=confirmation_xpath)
	private WebElement confirmation;
	
	@FindBy(xpath=completed_xpath)
	private WebElement completed;
	
	public CartPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	public void getCartPage() throws Throwable {
		
		elementClick(cart);
		elementClick(placeOrder);
		passValue(name, "nirmal");
		passValue(country, "india");
		passValue(city, "chennai");
		passValue(creditCard,"1221 2112 3344 4433" );
		passValue(month, "july");
		passValue(year, "2309");
		elementClick(purchase);
		staticWait(3000);
		try {
			takeScreenshot("C:\\Users\\nirma\\eclipse-workspace\\MavenProject\\screenshots\\snap2.png");
		} catch (IOException e) {
		}
		elementClick(completed);
	}
}
