package com.sproutsocial.screenobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileScreen {

	private static WebElement element = null;
	
	public static WebElement getProfileTweetsList(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li[class*='activity filter']"));
		return element;
	}
	
	
}
