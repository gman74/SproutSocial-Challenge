package com.sproutsocial.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sproutsocial.screenobjects.*;
import com.sproutsocial.tasks.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChallengeTests {
	
	private static WebDriver driver = null;
	
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
	
	@Before
	public void setUp() throws InterruptedException {
		driver.get("https://app.sproutsocial.com/login");
		if (!LoginTask.login(driver, "qatests+homework4@sproutsocial.com", "password")) {
			System.out.println("Login Failed. Check your credentials!");
			
		}
		Thread.sleep(5000);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		MenuBar.getGearButton(driver).click();
		MenuBar.getLogOutButton(driver).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void testComposingANewMessage() throws InterruptedException {
		
		String tweetText = "I tweeted this at " + DatePicker.getTimestamp();
		
		ComposeMessageTasks.composeMessage(driver, tweetText);
		
		//Validation - For now we are just going to check the profile page for the new tweet.
		NavigateTasks.navigateToContactFeed(driver);
		Assert.assertTrue("Your tweet was sent", driver.getPageSource().contains(tweetText));	

	}
	@Test
	public void testComposingANewMessageWithMaxCharacters() throws InterruptedException {
		
		String tweetText = "09876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321098765432109876543210987654321";
		
		ComposeMessageTasks.composeMessage(driver, tweetText);
		
		//Validation - For now we are just going to check the profile page for the new tweet.
		NavigateTasks.navigateToContactFeed(driver);
		Assert.assertTrue("Your tweet was sent", driver.getPageSource().contains(tweetText));	

	}
	
	@Test
	public void testComposingAndSchedulingANewMessage() throws InterruptedException {
		
		String scheduleText = "I scheduled this tweet at " + DatePicker.getTimestamp();;
		
		MenuBar.getPublishButton(driver).click();
		Thread.sleep(2000);
		
		PublishingScreen.getCalendarButton(driver).click();
		Thread.sleep(2000);
		
		ComposeMessageTasks.scheduleMessage(driver, scheduleText, "9");
		
		PublishingScreen.getScheduleButton(driver).click();
		Thread.sleep(2000);
		Assert.assertTrue("Your tweet was scheduled", driver.getPageSource().contains(scheduleText));	

	}
	
	@Test
	public void testViewAndReplyToIncomingTweets() throws  InterruptedException {
		
		String replyText = "I replied to this tweet at "  + DatePicker.getTimestamp();; 
		
		MenuBar.getMessagesButton(driver).click();
		Thread.sleep(5000);
		
		MessagesScreen.getReplyTextField(driver).click();
		MessagesScreen.getReplyButton(driver).click();
		Thread.sleep(2000);
		
		ComposeEditor.getMessageEditor(driver).sendKeys(replyText);
		Thread.sleep(2000);
		
		ComposeEditor.getSendMessageButton(driver).click();
		Thread.sleep(2000);
		
		//Navigate to Feeds for Validation
		//MenuBar.getFeedsButton(driver).click();
		//Thread.sleep(4000);
		NavigateTasks.navigateToContactFeed(driver);
		Assert.assertTrue("Your reply was sent", driver.getPageSource().contains(replyText));	
	}
	

}
