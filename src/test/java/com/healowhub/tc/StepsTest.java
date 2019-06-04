package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.Steps;

public class StepsTest extends Base {
	
public static Logger log = LogManager.getLogger(Base.class.getName());
	
	Steps steps;
	
	@Test(priority = 32)
	public void verifyTitle() {

		steps = new Steps(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'Steps')]"));

		Assert.assertEquals(title.getText(), "Steps");
		  log.info("title verified of Steps");

	}

	@Test(priority = 33)
	public void weekOne() {

		steps.week1();

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_Sleep')][contains(@onclick,'7')]"))
						.isDisplayed());
		log.info("week one clickable under Steps");

	}

	@Test(priority = 34)
	public void weekFour() {

		steps.weeks4();
		log.info("week four clickable under Steps");

	}

	@Test(priority = 35)
	public void weekTwelve() {

		steps.weeks12();
		log.info("week twelve clickable under Steps");

	}
}
