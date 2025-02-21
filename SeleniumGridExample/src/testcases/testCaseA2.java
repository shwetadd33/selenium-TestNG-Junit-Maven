package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseA2 extends TestBase{
	
@Test
public void TestA2() throws Exception {
	
	getDriver("Chrome");
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	System.out.println("Output from TestA2");
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}


}