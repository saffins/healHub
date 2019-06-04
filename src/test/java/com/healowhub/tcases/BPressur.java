package com.healowhub.tcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.BloodPressure;

public class BPressur  extends Base{

	BloodPressure bp;
	
	@Test
	public void verify1WeekData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bp.week1();
		Thread.sleep(1000);

		 
	}
	
	@Test
	public void verify4WeeksData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bp.weeks4();
		Thread.sleep(1000);
		 

		 

	}
	@Test
	public void verify12WeeksData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bp.weeks12();
		Thread.sleep(1000);
 

	}
	
}
