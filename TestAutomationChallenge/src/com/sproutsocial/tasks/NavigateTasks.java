package com.sproutsocial.tasks;

import org.openqa.selenium.*;
import com.sproutsocial.screenobjects.*;

public class NavigateTasks {
	
	public static void navigateToContactFeed(WebDriver driver) throws InterruptedException {
		
		MenuBar.getDashboardButton(driver).click();
		Thread.sleep(2000);
		
		MenuBar.getProfileButton(driver).click();
		Thread.sleep(2000);
		
		ProfileScreen.getProfileTweetsList(driver).click();
		Thread.sleep(2000);
	}

}
