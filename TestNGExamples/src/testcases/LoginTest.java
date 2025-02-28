package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void beforeTest1() {
		System.out.println("This block is method is called at the start of the test run");
		//example : We can start the browser here
	}
	
	@AfterTest
	public void AfterTest1() {
		System.out.println("This block is method is called at the end of the test run");
		//example : We can close the browser here
	}
	
	@BeforeMethod
	public void init() {
		System.out.println("****Before Method****");
		
		// So we can write this if we want to do some initialization before every testcase 
	}
	
	@AfterMethod
	public void end() {
		System.out.println("****After Method****");
		// ex: We want to close report files after every testcase 
	}
	
	@Test
	public void doLogin(){
		
		System.out.println("Logging user");
		
		String expectedResult ="A";
		String actualResult ="A";
		
		Assert.assertEquals(actualResult, expectedResult);
		
		Assert.assertTrue(5>2,"User Given Error Message"); // (condition,ErrorMessgae)
		
		//Assert.fail("Custom Error -  Error 404");
		
		// If run fails on any of assertion the run will break in between , to avoid it use soft assertion to continue flow of the program.
		// Refer ValidateUserRegTest.java for that
		
	}
	
	@Test
	public void checkUser(){
		System.out.println("Checking for User authentication");
	}

}
