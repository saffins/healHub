package com.healowcom.tc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
 

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;

	@BeforeSuite
	public void start() throws InterruptedException {
		
	//	WebDriverManager.chromedriver().version("2.46").setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		List<String> version  = WebDriverManager.chromedriver().getVersions();

		
		 
		
		driver = new FirefoxDriver();
		
		 
		driver.manage().window().maximize();
		driver.get("https://test.healow.com/apps/jsp/webview/signIn.jsp");
	 
	}

}
