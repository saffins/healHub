package com.healowhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BloodSugar {

	WebDriver driver;

	public BloodSugar(WebDriver driver) {

		this.driver = driver;

	}

	public void bloodSugarBtn() {

		driver.findElement(By.xpath("//span[.='Blood Sugar']")).click();

	}

	public void week1() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_bs')][contains(@onclick,'7')]")).click();

	}

	public void weeks4() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_bs')][contains(@onclick,'28')]")).click();

	}

	public void weeks12() {

		driver.findElement(By.xpath("//*[starts-with(@data-target,'#w1_bs')][contains(@onclick,'84')]")).click();

	}

	public void bloodSugarDetailedView() {

		driver.findElement(By.xpath("//*[contains(@onclick,'BloodSugar')]")).click();

	}

	public void weekOne() {

		driver.findElement(By.xpath("//*[@onclick='getBSDetailData(7)']")).click();

	}

	public void goBack() {

		driver.findElement(By.xpath("//*[@id='bsBackArrow']")).click();
	}

}
