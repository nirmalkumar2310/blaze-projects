package org.pageObjectModel;

import org.interfaceElements.DemoBlazePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuseableMethods.BaseClass;
import com.utility.FileReaderManager;

public class DemoBlazePagePOM extends BaseClass implements DemoBlazePage{   //1.findBy,2.Constructor,3.ActionMethod
	
	@FindBy(id=login_id)
	private WebElement login;
	@FindBy(id=username_id)
	private WebElement username;
	@FindBy(id=password_id)
	private WebElement password;
	@FindBy(xpath=loginbtn_xpath)
	private WebElement loginbtn;
	
	public DemoBlazePagePOM() {
	PageFactory.initElements(driver, this);	
	}
	FileReaderManager reader=new FileReaderManager();
	public void getDemoBlazePage() {
		elementClick(login);
		implicitWait(20);
		passValue(username, reader.getProperty("username"));
		passValue(password, reader.getProperty("password"));
		elementClick(loginbtn);

	}

}
