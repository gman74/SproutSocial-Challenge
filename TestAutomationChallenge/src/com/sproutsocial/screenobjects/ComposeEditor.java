package com.sproutsocial.screenobjects;

import org.openqa.selenium.*;

public class ComposeEditor {
	
	private static WebElement element = null;
	
	public static WebElement getMessageEditor(WebDriver driver) {
		element = driver.findElement(By.cssSelector("textarea[id^='ui-sproutedit']"));
		return element;
	}
	
	public static WebElement getSendMessageButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[class*='js-submit-message']"));
		return element;
	}
	
	public static WebElement getSendLaterButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[data-qa-button*='Send Later']"));
		return element;
	}
	

}
