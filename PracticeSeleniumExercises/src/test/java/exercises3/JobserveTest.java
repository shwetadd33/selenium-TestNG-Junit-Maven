package exercises3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class JobserveTest extends TestBase{
	
	@Test
	public void TestDropDown() {
		
		String selectOption = "Healthcare & Medical";
		getDriver("Chrome");
		driver.get("https://jobserve.com");
		
		System.out.println(driver.findElement(By.cssSelector("#ddcl-selInd-ddw")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#ddcl-selInd-ddw")).isEnabled());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#industryDisplay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#industryDisplay")));
		
		driver.findElement(By.xpath("//span[@id='ddcl-selInd']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ddcl-selInd-ddw")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ddcl-selInd-ddw")));
		

		System.out.println(driver.findElement(By.cssSelector("#ddcl-selInd-ddw")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#ddcl-selInd-ddw")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//label[@for = 'ddcl-selInd-i0']//preceding-sibling::input[@type='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//label[@for = 'ddcl-selInd-i0']")).click();
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//label[@for = 'ddcl-selInd-i0']//preceding-sibling::input[@type='checkbox']"), false));
		System.out.println(driver.findElement(By.xpath("//label[@for = 'ddcl-selInd-i0']//preceding-sibling::input[@type='checkbox']")).isSelected());
		
		// Clicking a particular checkbox with text
		//driver.findElement(By.xpath("//label[contains(text(),'Legal')]")).click();
		//System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Legal')]//preceding-sibling::input[@type='checkbox']")).isSelected());
		
		//List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[starts-with(@id,'ddcl-selInd-i')]"));
		List<WebElement> labels = driver.findElements(By.xpath("//label[starts-with(@for,'ddcl-selInd-i')]"));
		
		for(int i =0;i<labels.size();i++) {
			
			if(labels.get(i).getText().equalsIgnoreCase(selectOption)) {
				labels.get(i).click();
				break;
			}
		}
		
	}
}
