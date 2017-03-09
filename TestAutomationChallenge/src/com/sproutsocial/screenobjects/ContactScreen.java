package com.sproutsocial.screenobjects;

import org.openqa.selenium.*;

public class ContactScreen {
	
	private static WebElement element = null;
	
	public static WebElement getMessageEditor(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='profile_side']/div[2]/ul/li/a/img"));
		return element;
	}
	

}
