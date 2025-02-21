package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class testCaseA4 extends TestBase{
	
@Test
public void TestA4() throws Exception {
	
	getDriver("Firefox");
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	System.out.println("Output from TestA4");
}

@AfterTest
public void quitBrowser() {
	driver.quit();
}


}