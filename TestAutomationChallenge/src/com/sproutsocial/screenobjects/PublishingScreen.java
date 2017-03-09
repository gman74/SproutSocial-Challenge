package com.sproutsocial.screenobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublishingScreen {
	
	private static WebElement element = null;

	
	public static WebElement getMessageEditor(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='profile_side']/div[2]/ul/li/a/img"));
		return element;
	}
	
	public static WebElement getComposeMessageButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("button[class*='primary-action']"));
		return element;
	}
	
	public static WebElement getCalendarControl(WebDriver driver) {
		element = driver.findElement(By.cssSelector("table[class*='ui-datepicker-calendar']"));
		return element;
	}
	
	public static WebElement getCalendarButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div[class*='publishing-calendar']"));
		//element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class*='publishing-calendar']"))));
		return element;
	}
	
	public static WebElement getScheduleButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='text' and text()='Scheduled']"));
		//element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='text' and text()='Scheduled']"))));
		return element;
	}
	
	
	
	


}
