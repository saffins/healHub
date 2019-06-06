package com.healowhub.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.healowcom.tc.LoginTest;
import com.healowhub.base.Base;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerListener   extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {

		test = report.startTest(result.getName().toUpperCase());

	}

	public void onTestSuccess(ITestResult result) {

		test.log(LogStatus.PASS, "passed the testcase " + result.getName().toUpperCase() + " passed  ");
		//test.log(LogStatus.PASS, test.addScreenCapture(Base.path));
		report.endTest(test);
		report.flush();
	}

	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "failed the testcase " + result.getName().toUpperCase() + " failed with exception : "
				+ result.getThrowable());
		report.endTest(test);
		report.flush();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
