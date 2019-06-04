package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.Floors;

public class FloorsTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	Floors floors;
	
	@Test(priority = 23)
	public void verifyTitle() {

		floors = new Floors(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'Floors')]"));

		Assert.assertEquals(title.getText(), "Floors");
		  log.info("title verified of Floors");

	}

	@Test(priority = 24)
	public void weekOne() {

		floors.week1();

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_Floor')][contains(@onclick,'7')]"))
						.isDisplayed());
		log.info("week one clickable under Floors");

	}

	@Test(priority = 25)
	public void weekFour() {

		floors.weeks4();
		log.info("week four clickable under Floors");

	}

	@Test(priority = 26)
	public void weekTwelve() {

		floors.weeks12();
		log.info("week twelve clickable under Floors");

	}

}
