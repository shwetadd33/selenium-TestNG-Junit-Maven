package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class RegistrationTest {
	
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		reports = ExtentManager.getReports();
		test = reports.createTest("RegistrationTest");
	}
	
	@AfterMethod
	public void quit() {
		reports.flush();   // finalizes and creates report file
	}
	
	@Test
	public void register() {
		test.log(Status.INFO, "Starting test case Registration");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Ending test case Registration");
		test.log(Status.PASS, "Register Test Passed");
		
	}

}
