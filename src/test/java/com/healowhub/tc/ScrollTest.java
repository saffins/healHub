package com.healowhub.tc;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.healowhub.base.Base;

public class ScrollTest extends Base {

	@Test(priority = 9)
	public void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,580)");

	}

}
