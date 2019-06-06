package com.healowhub.utils;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {

			extent = new ExtentReports(
					"I:\\eclipse mars\\eclipse\\D\\workspace\\HealowHub\\test-output\\extent.html", true,
					DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(
					"I:\\eclipse mars\\eclipse\\D\\workspace\\HealowHub\\src\\test\\java\\ReportConfig.xml"));
		}

		return extent;

	}

}
