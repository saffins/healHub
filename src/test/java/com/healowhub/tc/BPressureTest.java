package com.healowhub.tc;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.BloodPressure;

public class BPressureTest extends Base{
	
	
	
	public static Logger log = LogManager.getLogger(Base.class.getName());

	
	
	BloodPressure bp;
	
	@Test(priority=5)
	public void verifyTitle(){
		
		bp = new BloodPressure(driver);
		WebElement title = driver.findElement(By.xpath("//*[contains(@onclick,'BloodPressure')]"));
		
		Assert.assertEquals(title.getText(), "Blood Pressure");
		  log.info("title verified of BloodPressure");

	}
	
	@Test(priority=6)
	public void verify1WeekData()  {
		bp.week1();
		 

		log.info("week one clickable under BloodPressure");

	}
	
	@Test(priority=7)
	public void verify4WeeksData()  {

	 
		bp.weeks4();
	 
		 

		log.info("week four clickable under BloodPressure");


	}
	@Test(priority=8)
	public void verify12WeeksData()   {

 
		bp.weeks12();
		 
 
		log.info("week twelve clickable under BloodPressure");

	}
	

}
