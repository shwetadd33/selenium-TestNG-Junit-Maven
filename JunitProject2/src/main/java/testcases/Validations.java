package testcases;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;

public class Validations {

	@Rule
	public ErrorCollector errCol = new ErrorCollector();   // If you don't want to break the flow of the program when first assertion is failed used error collector to collect all the errors and print at the end 
	
	@Test
	public void validate() {
		String expectedValue = "A";
		String actualValue = "A1";
		try {
			Assert.assertEquals(expectedValue, actualValue);    // To compare for expected and actual results
		}catch(Throwable e){
			System.out.println("Actual not equal to Expected");
			errCol.addError(e);
			
		}
		
		try {
			Assert.assertTrue("Error Message", 4<2);    // To compare for expected and actual results
		}catch(Throwable e){
			System.out.println("4 is not less than 2");
			errCol.addError(e);
		}
		
		
		
		//Assert.assertTrue("Error Message", 4>2);
		//Assert.assertFalse("false expected got true", true);
		//Assert.fail("----Had to be logged in but not logged in----");   // use this when you are sure the test is going to fail
	}
} 
