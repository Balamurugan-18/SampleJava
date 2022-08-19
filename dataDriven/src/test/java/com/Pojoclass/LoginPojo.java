package com.Pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass1;

public class LoginPojo extends BaseClass1 {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement loginbtn;

	public void loginpage(String username, String password) {

		type(getUsername(), username);
		type(getPass(), password);
		clk(getLoginbtn());

	}

}
