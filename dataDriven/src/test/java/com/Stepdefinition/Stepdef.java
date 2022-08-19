package com.Stepdefinition;

import java.io.IOException;

import com.Pojoclass.LoginPojo;
import com.baseclass.BaseClass1;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends BaseClass1 {

	LoginPojo l = new LoginPojo();

	@When("user opens the adactin application")
	public void user_opens_the_adactin_application() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();

	}

	@Then("user enters the username and password and clicks on loginbutton")
	public void user_enters_the_username_and_password_and_clicks_on_loginbutton() throws IOException {
		l.loginpage("ft", "jhhj");
	}

}
