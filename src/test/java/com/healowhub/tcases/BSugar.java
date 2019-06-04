package com.healowhub.tcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.healowhub.base.Base;
import com.healowhub.pages.BloodSugar;

public class BSugar extends Base {

	BloodSugar bs;

	@Test 
	public void hubScreen() throws InterruptedException {
		bs = new BloodSugar(driver);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.id("healowhubiFrm1")));

		WebElement hubScr = driver.findElement(By.xpath("//*[contains(@onclick,'BloodSugar')]"));
		Assert.assertEquals(hubScr.getText(), "Blood Sugar", "found blood sugar");

	}
	
 
	public void bloodSugarDetailed() throws InterruptedException{
		Thread.sleep(5000);

		bs.bloodSugarDetailedView(); 
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		WebElement next = driver.findElement(By.xpath("//*[@id='leftBtn']"));
		Assert.assertEquals(next.isDisplayed(), true);
		
	}

	@Test 
	public void verify1WeekData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bs.week1();
		Thread.sleep(1000);

		WebElement avgPreMeal = driver.findElement(By.xpath("//*[@id='avgpre_meal']"));
		Assert.assertEquals(avgPreMeal.getText(), "321.0");

	}
	
	@Test
	public void verify4WeeksData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bs.weeks4();
		Thread.sleep(1000);

		WebElement avgPreMeal = driver.findElement(By.xpath("//*[@id='avgpre_meal']"));
		Assert.assertEquals(avgPreMeal.getText(), "285.5");

	}
	@Test
	public void verify12WeeksData() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bs.weeks12();
		Thread.sleep(1000);

		WebElement avgPreMeal = driver.findElement(By.xpath("//*[@id='avgpre_meal']"));
		Assert.assertEquals(avgPreMeal.getText(), "285.5");

	}
	
	
	
	@Test
	public void weekOne(){
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		bs.weekOne();
		WebElement verify1Week = driver.findElement(By.xpath("//*[@id='dateRange']"));
		String date =verify1Week.getText();
		System.out.println(date);
		String dt = date.substring(3, 5);
		String dt2 = date.substring(14, 16);
		
		int start = Integer.parseInt(dt);
		int end = Integer.parseInt(dt2);
		int calculate = end+1-start;
		Assert.assertEquals(calculate, 7);
		
	}
	
	@Test
	public void weekOneSummary(){
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bs.weekOne();

		WebElement avgAllRead = driver.findElement(By.xpath("//*[@id='avg_all']"));
		
		WebElement highAllRead = driver.findElement(By.xpath("//*[@id='high_all']"));
		WebElement lowAllRead = driver.findElement(By.xpath("//*[@id='low_all']"));
        Boolean[] summary = {avgAllRead.getText().equals("321"),highAllRead.getText().equals("321"),lowAllRead.getText().equals("321")};
		Assert.assertEquals(highAllRead.getText(), "321");
		
	}
	
	@Test
	public void weekOneLogs(){
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		bs.weekOne();
		WebElement glucose = driver.findElement(By.xpath("//*[contains(@class,'floorclimbed')]//table//tr/td[3]"));
		Assert.assertEquals(glucose.getText(), "321" );
		
	}
 


}
