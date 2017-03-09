package com.sproutsocial.tasks;

import org.openqa.selenium.*;
import com.sproutsocial.screenobjects.*;

public class ComposeMessageTasks {
	
	
	public static void composeMessage(WebDriver driver, String tweetText) throws InterruptedException {
		MenuBar.getComposeButton(driver).click();
		Thread.sleep(2000);
	
		ComposeEditor.getMessageEditor(driver).sendKeys(tweetText);
		Thread.sleep(2000);
		
		ComposeEditor.getSendMessageButton(driver).click();
		Thread.sleep(2000);
	}
	
	public static void scheduleMessage(WebDriver driver, String tweetText, String scheduleDay) throws InterruptedException {
		
		//TODO: add update time field
		
		MenuBar.getComposeButton(driver).click();
		Thread.sleep(2000);
		
		ComposeEditor.getSendLaterButton(driver).click();
		Thread.sleep(2000);
		
		ComposeEditor.getMessageEditor(driver).sendKeys(tweetText);
		Thread.sleep(2000);

		DatePicker.selectCalendarDay(driver, "8");
		Thread.sleep(2000);
		
		ComposeEditor.getSendMessageButton(driver).click();
		Thread.sleep(3000);
	}

}
