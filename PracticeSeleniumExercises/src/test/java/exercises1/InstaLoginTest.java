package exercises1;

import org.testng.annotations.Test;
import baseClass.TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaLoginTest extends TestBase {
	
	@Test(enabled = false)
	public void LoginTest() {
		
		getDriver("chrome");
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("shweta.deshmukh");
		driver.findElement(By.name("password")).sendKeys("Spendlesstime20@");
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		driver.close();
		
	}
	
	@Test 
	public void AmericanCart() {
		getDriver("chrome");
		driver.get("https://www.americangolf.co.uk/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tid = 'banner-accept']")));
		driver.findElement(By.xpath("//button[@data-tid = 'banner-accept']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.icon.icon-basket")));
		driver.findElement(By.cssSelector("i.icon.icon-basket")).click(); //click on card icon
		driver.close();
	}

}
