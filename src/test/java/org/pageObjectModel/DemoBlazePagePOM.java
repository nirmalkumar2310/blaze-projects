package org.pageObjectModel;

import org.interfaceElements.DemoBlazePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuseableMethods.BaseClass;
import com.utility.FileReaderManager;

public class DemoBlazePagePOM extends BaseClass implements DemoBlazePage { // 1.findBy,2.Constructor,3.ActionMethod

	@FindBy(id = login_id)
	private WebElement login;
	@FindBy(id = username_id)
	private WebElement username;
	@FindBy(id = password_id)
	private WebElement password;
	@FindBy(xpath = loginbtn_xpath)
	private WebElement loginbtn;
	@FindBy(id = loginValidation_id)
	private WebElement loginValidation;

	public DemoBlazePagePOM() {
		PageFactory.initElements(driver, this);
	}

	FileReaderManager reader = new FileReaderManager();

	public void getDemoBlazePage() throws Throwable {
		implicitWait(10);
		elementClick(login);
		passValue(username, reader.getProperty("username"));
		passValue(password, reader.getProperty("password"));
		
		elementClick(loginbtn);
		staticWait(5000);
		String Actual = loginValidation.getText();
		Assert.assertEquals(Actual, "Welcome Nirmal@23");
		System.out.println("login sucessfully");

	}

}
