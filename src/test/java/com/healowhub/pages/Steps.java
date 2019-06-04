package com.healowhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps {

	WebDriver driver;

	public Steps(WebDriver driver){
		
		this.driver = driver;
		
	}

	public void week1() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_steps')][contains(@onclick,'7')]")).click();

	}

	public void weeks4() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_steps')][contains(@onclick,'28')]")).click();

	}

	public void weeks12() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_steps')][contains(@onclick,'84')]")).click();

	}
	
}
