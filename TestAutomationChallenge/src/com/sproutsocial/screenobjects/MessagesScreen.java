package com.sproutsocial.screenobjects;

import org.openqa.selenium.*;

public class MessagesScreen {

	private static WebElement element = null;
	
	public static WebElement getReplyButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[class*='reply']"));
		return element;
	}
	
	public static WebElement getReplyTextField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div[class*='message-text']"));
		return element;
	}
	
}
