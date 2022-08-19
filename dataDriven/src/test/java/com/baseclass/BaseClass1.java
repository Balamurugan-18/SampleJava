package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;

	// 1.getDriver
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2.loadUrl
	public void loadUrl(String Url) {
		driver.get(Url);
	}

	// 3.maximize
	public void maximize() {
		driver.manage().window().maximize();
	}

	// 4.sendkey
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void clk(WebElement element) {
		element.click();
	}
}
