package com.sproutsocial.screenobjects;

import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScreen {
	private static WebElement element = null;
	
	public static WebElement getSigninEmail(WebDriver driver) {
		element = driver.findElement(By.id("signin-email"));
		return element;
	}
	
	public static WebElement getSigninPassword(WebDriver driver) {
		element = driver.findElement(By.id("signin-pw"));
		return element;
	}
	
	public static WebElement getLogInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='signin_form']/div[1]/button"));
		return element;
	}

	

}
