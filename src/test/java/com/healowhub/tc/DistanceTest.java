package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.Distance;

public class DistanceTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	Distance distance;
	
	@Test(priority = 19)
	public void verifyTitle() {

		distance = new Distance(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'Distance')]"));

		Assert.assertEquals(title.getText(), "Distance");
		  log.info("title verified of Distance");

	}

	@Test(priority = 20)
	public void weekOne() {

		distance.week1();

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_distance')][contains(@onclick,'7')]"))
						.isDisplayed());
		log.info("week one clickable under Calories");

	}

	@Test(priority = 21)
	public void weekFour() {

		distance.weeks4();
		log.info("week four clickable under Distance");

	}

	@Test(priority = 22)
	public void weekTwelve() {

		distance.weeks12();
		log.info("week twelve clickable under Distance");

	}

}
