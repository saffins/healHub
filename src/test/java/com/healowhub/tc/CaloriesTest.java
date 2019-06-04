package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.Calories;

public class CaloriesTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	Calories calories;

	@Test(priority = 14)
	public void verifyTitle() {

		calories = new Calories(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'Calories')]"));

		Assert.assertEquals(title.getText(), "Calories");
		  log.info("title verified of Calories");

	}

	@Test(priority = 15)
	public void weekOne() {

		calories.week1();

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_bmi')][contains(@onclick,'7')]"))
						.isDisplayed());
		log.info("week one clickable under Calories");

	}

	@Test(priority = 16)
	public void weekFour() {

		calories.weeks4();
		log.info("week four clickable under Calories");

	}

	@Test(priority = 17)
	public void weekTwelve() {

		calories.weeks12();
		log.info("week twelve clickable under Calories");

	}

}
