package com.healowhub.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;

	@BeforeSuite
	public void start() throws InterruptedException {
		
		WebDriverManager.chromedriver().version("2.46").setup();
		
		List<String> version  = WebDriverManager.chromedriver().getVersions();

		
		 
		
		driver = new ChromeDriver();
		
		log.info("driver is initialized");
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/mobiledoc/jsp/webemr/login/newLogin.jsp");
		driver.findElement(By.xpath("//*[@name='doctorID']")).sendKeys("sam");
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("password$2");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='providerLicense']/div/div/div[5]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='alert']/div/div/div[2]/div[1]/center/table/tbody/tr/td[2]/button"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='jellybean-panelLink65']")).click();
		Thread.sleep(3000);
		WebElement searchPt = driver.findElement(By.xpath("//*[@id='searchText']"));
		searchPt.sendKeys("john,auth1");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@ng-if='PatientHubInfo.isHealowDataEnabled == false']")).click();
		//
	}

}
