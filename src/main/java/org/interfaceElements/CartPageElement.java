package org.interfaceElements;

public interface CartPageElement {

	String cart_id = "cartur";
	String placeOrder_xpath = "//button[text()='Place Order']";
	String name_xpath = "//input[@id='name']";
	String country_xpath = "//input[@id='country']";
	String city_xpath = "//input[@id='city']";
	String creditCard_xpath = "//input[@id='card']";
	String month_xpath = "//input[@id='month']";
	String year_xpath = "//input[@id='year']";
	String purchase_xpath = "//button[text()='Purchase']";
	String confirmation_xpath = "//h2[text()='Thank you for your purchase!']";
	String completed_xpath = "//button[text()='OK']";
	String logout_id = "logout2";
	String LogoutValidation_id="login2";
}
