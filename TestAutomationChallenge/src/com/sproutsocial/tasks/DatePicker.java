package com.sproutsocial.tasks;

import java.sql.Timestamp;
import java.util.List;

import org.openqa.selenium.*;
//import com.sproutsocial.screenobjects.*;

public class DatePicker {
	
	private static WebElement element = null;
	private static WebElement table = null;
	
	public static void selectCalendarDay(WebDriver driver, String day) throws InterruptedException {

		table = driver.findElement(By.cssSelector("table[class*='ui-datepicker-calendar']"));
		int clicked=0;
		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
		for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));
			
			for (WebElement cell : cells) {
				if (cell.getText().equals(day)) {
					element = driver.findElement(By.linkText(day));
					element.click();
					clicked=1;
					break;
				}
			}
			if (clicked == 1) 
				break;
		}
	}
	
	public static String getTimestamp() {
		String timeStamp = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Timestamp(System.currentTimeMillis()));
		return timeStamp;
	}

}
