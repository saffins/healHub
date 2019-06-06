package com.healowhub.tc;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.BloodSugar;
import com.relevantcodes.extentreports.LogStatus;

public class BSugarTest extends Base {
	//public static Logger log = LogManager.getLogger(Base.class.getName());

	BloodSugar bs;

	@Test(priority = 1)
	public void hubScreen() throws InterruptedException {
		bs = new BloodSugar(driver);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.id("healowhubiFrm1")));

		WebElement hubScr = driver.findElement(By.xpath("//*[contains(@onclick,'BloodSugar')]"));
		Assert.assertEquals(hubScr.getText(), "Blood Sugar", "found blood sugar");
		//  log.info("title verified of Blood Sugar");

		test.log(LogStatus.INFO, "clicked on hubscreen");
	}

	@Test(priority = 2)
	public void oneWeek() throws InterruptedException {

		bs.week1();
		//log.info("week one clickable under Blood Sugar");
		test.log(LogStatus.INFO, "clicked on oneWeek");

	}

	@Test(priority = 3)
	public void twelveWeek() {

		bs.weeks12();
		//log.info("week twelve clickable under Blood Sugar");
		test.log(LogStatus.INFO, "clicked on twelveWeek");

	}
	
	 

}
