package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.Sleep;

public class SleepTest extends Base {
	
public static Logger log = LogManager.getLogger(Base.class.getName());
	
	Sleep sleep;
	
	@Test(priority = 28)
	public void verifyTitle() {

		sleep = new Sleep(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'Sleep')]"));

		Assert.assertEquals(title.getText(), "Sleep");
		  log.info("title verified of Sleep");

	}

	@Test(priority = 29)
	public void weekOne() {

		sleep.week1();

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_Sleep')][contains(@onclick,'7')]"))
						.isDisplayed());
		log.info("week one clickable under Sleep");

	}

	@Test(priority = 30)
	public void weekFour() {

		sleep.weeks4();
		log.info("week four clickable under Sleep");

	}

	@Test(priority = 31)
	public void weekTwelve() {

		sleep.weeks12();
		log.info("week twelve clickable under Sleep");

	}


}
