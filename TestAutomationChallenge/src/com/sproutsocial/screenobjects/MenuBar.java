package com.sproutsocial.screenobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuBar {
	private static WebElement element = null;

	public static WebElement getComposeButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='side-menu']/li[1]/a"));
		return element;
	}
	
	public static WebElement getPublishButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[title*='publish']"));
		//element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[title*='publish']"))));
		return element;
	}
	
	
	public static WebElement getFeedsButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[title*='timeline']"));
		return element;
	}
	
	public static WebElement getMessagesButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span"));
		return element;
	}
	
	public static WebElement getMsgBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[.='messages']"));
		return element;
	}
	
	public static WebElement getGearButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ss_topgear']/a"));
		return element;
	}
	
	public static WebElement getLogOutButton(WebDriver driver) {
		element = driver.findElement(By.id("sprout_logout"));
		return element;
	}
	
	public static WebElement getDashboardButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Sprout Social"));
		return element;
	}
	
	public static WebElement getProfileButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[class*='js-profile']"));
		return element;
	}
	
		
}
