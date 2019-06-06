package com.healowhub.tc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.BMI;

public class BMITest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	BMI bmi;

	@Test(priority = 10)
	public void verifyTitle() {

		bmi = new BMI(driver);

		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'BMI')]"));

		Assert.assertEquals(title.getText(), "BMI");
		log.info("title verified of BMI");

	}

	@Test(priority = 11)
	public void weekOne() {

		bmi.week1();

		try {
			Assert.assertTrue(
					driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_bmi')][contains(@onclick,'7')]"))
							.isDisplayed());
			log.info("week one clickable under BMI");
		} catch (AssertionError e) {
			log.info("week one unclickable under BMI");
			Assert.fail();

		}

	}

	@Test(priority = 12)
	public void weekFour() {

		bmi.weeks4();
		log.info("week four clickable under BMI");

	}

	@Test(priority = 13)
	public void weekTwelve() {

		bmi.weeks12();
		log.info("week twelve clickable under BMI");

	}

}
