package testcases;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class PassingValuesTest {
	
	@Test(priority = 1)
	public void search(ITestContext context) {
		System.out.println("Search Phone");
		context.setAttribute("phoneName", "Iphone15");
	}
	
	@Test(priority = 2, dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		String phnName = (String) context.getAttribute("phoneName"); 
		System.out.println("Selecting Phone " + phnName);
		
	}
	
	boolean flag=false;			// To skip particular testcase. if true then skip the testcase if false run the testcase
	@Test(priority = 3, dependsOnMethods = {"search", "selectPhone"})  // If anyone of the test fails the checkout() will not run
	public void checkout(ITestContext context) {
		String phnName = (String) context.getAttribute("phoneName"); 
		
		if(flag)
			throw new SkipException("Skipping the test");
		
		System.out.println("checkout " + phnName);
	}
}
