package com.healowcom.tc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends Base {

	public static Logger log = LogManager.getLogger(LoginTest.class.getName());

	public static void capture() throws IOException {

		Date d = new Date();
		 
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File(".//screenshots//"+d.toString().replace(":", "_").replace(" ", "_")+".jpg"));

	}
	
	

	@Test
	public void enterPractice() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//*[@name='typeOfSearch'][@value='0']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		log.info("search type verified");
		WebElement code = driver.findElement(By.xpath("//*[@id='practice']"));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='practice']")));
		capture();
		code.sendKeys("EEJIAD");
		log.info("practice code sent");

		driver.findElement(By.xpath("//*[@id='goSubBtn']")).click();

		log.info("submit button pressed");
  
		WebElement elem = driver.findElement(By.id("signInHeadTxt"));
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		BufferedImage full = ImageIO.read(f);
		Point point = elem.getLocation();
		int elemWidth = elem.getSize().getWidth();
		int elemHeight = elem.getSize().getHeight();
		
		BufferedImage elemss = full.getSubimage(point.x,point.y,elemWidth,elemHeight);
		ImageIO.write(elemss,"jpg",f);
		
		
		File ssLocation = new File(".\\screenshot\\healowlogo.jpg");
		FileUtils.copyFile(f, ssLocation);
		
		WebElement practice = driver.findElement(By.xpath("//*[@class='list-group-item-text']"));

		Thread.sleep(4000);
		// wait.until(ExpectedConditions.elementToBeClickable(practice));

		practice.click();
	}

}
