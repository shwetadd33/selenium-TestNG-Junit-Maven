package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Defined an order in which the testcases should be run(Alphabetically ascending order)
public class ShopMobilePhone {
	
	@Test     // Annotation to specify that this is a testcase
	public void test_a_searchForMobile() {
		System.out.println("Searching for mobile");
	}
	
	@Test
	public void test_b_selectMobile() {
		System.out.println("Selecting Mobile");
	}
	
	//@Ignore   // Use to skip the testcase in run
	@Test
	public void test_c_checkout() {
		Assume.assumeTrue(false);  // Or use this instead of @Ignore to skip the test
		System.out.println("Checkout Mobile");
	}
}
