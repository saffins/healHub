package com.healowcom.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BloodSugar {

	WebDriver driver;
	
	public BloodSugar(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void tapPlus(){
		
		driver.findElement(By.xpath("//*[@class='bloodsugar-tracked']//div[1]/div[1]/span/a")).click();
		
	}
	
}
