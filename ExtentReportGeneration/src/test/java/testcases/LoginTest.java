package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentManager;



public class LoginTest {
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		reports = ExtentManager.getReports();
		test = reports.createTest("LoginTest");
	}
	
	@AfterMethod
	public void quit() {
		reports.flush();   // finalizes and creates report file
	}

	@Test
	public void login() {
		
		test.log(Status.INFO, "Starting test case Login");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.FAIL, "404 Error");
		try {
			test.addScreenCaptureFromPath("C:\\GitHub\\selenium-projects\\ExtentReportGeneration\\Error\\404_erro.png","404 Error");
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		Assert.fail("404, Error");
		test.log(Status.PASS, "Test Passed");
		
	}
}
