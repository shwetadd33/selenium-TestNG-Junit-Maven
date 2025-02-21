package exercises3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class WebTableTest extends TestBase {
	
	@Test
	public void TestScrollPosts() throws InterruptedException {
		
		
		getDriver("Chrome");
		driver.get("https://encodedna.com/javascript/demo/dynamically-add-or-remove-table-rows-using-javascript-and-save-data.htm#google_vignette");
		//Thread.sleep(2);
		driver.findElement(By.id("bt")).click();
		
		//int totalRowsBefore = driver.findElements(By.cssSelector("table#empTable tr")).size();
		//System.out.println(totalRowsBefore);
		
		//driver.findElement(By.id("addRow")).click();
		
		//int totalRowsAfter = driver.findElements(By.cssSelector("table#empTable tr")).size();
		//System.out.println(totalRowsAfter);
		//Assert.assertTrue((totalRowsAfter-totalRowsBefore) == 2, "Row not added");
		
		for(int i=0; i<5; i++) {

			int totalRowsAfter = driver.findElements(By.cssSelector("table#empTable tr")).size();
			System.out.println(totalRowsAfter);
			driver.findElement(By.id("addRow")).click();
			addData("A1","E1",1,totalRowsAfter+1);
			Thread.sleep(1000);
			
		}
		
		
		// put values for name,designation and age
		//driver.findElement(By.xpath("//table[@id='empTable']//tr[2]/td[2]/input")).sendKeys("abc");
		//driver.findElement(By.xpath("//table[@id='empTable']//tr[2]/td[3]/input")).sendKeys("engineer");
		//driver.findElement(By.xpath("//table[@id='empTable']//tr[2]/td[4]/input")).sendKeys("32");
		
	}
	
	public void addData(String name, String designation, int Age,int size) {
		driver.findElement(By.xpath("//table[@id='empTable']//tr["+size+"]/td[2]/input")).sendKeys(""+name+"");
		driver.findElement(By.xpath("//table[@id='empTable']//tr["+size+"]/td[3]/input")).sendKeys(""+designation+"");
		driver.findElement(By.xpath("//table[@id='empTable']//tr["+size+"]/td[4]/input")).sendKeys(""+Age+"");
	}

}
