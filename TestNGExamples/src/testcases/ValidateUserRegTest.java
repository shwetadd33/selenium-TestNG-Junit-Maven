package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegTest {
	
	@Test
	public void validate() {
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals("ABC", "ABC");
		softAssert.assertEquals("ABC", "PQR");
		softAssert.assertTrue(5>11,"Custom Error Message");
		softAssert.fail("404 Error");
		System.out.println("The End of the Program");
		
		softAssert.assertAll();  // Reports all the failure at the end of the program 
	}

}
