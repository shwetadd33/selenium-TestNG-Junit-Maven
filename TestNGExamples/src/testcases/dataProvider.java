package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider
	public static Object[][] getData(Method m){
		
		System.out.println("Method/Test : " + m.getName());
		
		if(m.getName() == "create") {
			Object[][] data = new Object[3][3];
			
			data[0][0] = "ABC";
			data[0][1] = "Pass1";
			data[0][2] = 123;
			
			data[1][0] = "PQR";
			data[1][1] = "Pass2";
			data[1][2] = 123;
			
			data[2][0] = "XYZ";
			data[2][1] = "Pass3";
			data[2][2] = 123;
			
			return data;
		}
		
		else if (m.getName() == "delete") {
			Object[][] data = new Object[3][3];			// giving same data as above. Just showing we can set different data for different testcase in single dataProvider class
			
			data[0][0] = "ABC";
			data[0][1] = "Pass1";
			data[0][2] = 123;
			
			data[1][0] = "PQR";
			data[1][1] = "Pass2";
			data[1][2] = 123;
			
			data[2][0] = "XYZ";
			data[2][1] = "Pass3";
			data[2][2] = 123;
			
			return data;
		}
		
		else {
			return null;
		}
	}
}

