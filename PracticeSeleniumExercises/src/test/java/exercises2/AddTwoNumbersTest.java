package exercises2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class AddTwoNumbersTest extends TestBase {
	@Test
	public void AddTest() {
		getDriver("Chrome");
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_numbers_add");
		int x = Integer.valueOf(driver.findElement(By.cssSelector("div.CodeMirror-code > pre:nth-child(12) >span > span:nth-child(7)")).getText());
		int y = Integer.valueOf(driver.findElement(By.cssSelector("div.CodeMirror-code > pre:nth-child(13) >span > span:nth-child(7)")).getText());
		
		int add = x+y;
		String addS = String.valueOf(add);
		
		driver.switchTo().frame("iframeResult");  // Or use WebElement

		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
		
		String addExp = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(addExp);
		
		Assert.assertEquals(addS,addExp,"The Addition is wrong");
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
