package testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)     // Batch Running all the testcase files. 
@SuiteClasses({
	LoginTest.class,
	ShopMobilePhone.class, 
	Validations.class
	})
	
public class CustomProjectRunner {
		
	}


