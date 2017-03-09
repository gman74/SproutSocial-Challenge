package com.sproutsocial.tasks;

import org.openqa.selenium.*;
import com.sproutsocial.screenobjects.*;

public class LoginTask {
	
	public static boolean login(WebDriver driver, String sEmail, String sPassword) {
		
		LoginScreen.getSigninEmail(driver).sendKeys(sEmail);
		LoginScreen.getSigninPassword(driver).sendKeys(sPassword);
		LoginScreen.getLogInButton(driver).click();
		
		if (MenuBar.getDashboardButton(driver).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	

}
