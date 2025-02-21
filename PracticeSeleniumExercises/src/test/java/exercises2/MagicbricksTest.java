package exercises2;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class MagicbricksTest extends TestBase {
	
	@Test
	public void RentClick() {
		getDriver("Chrome");
		

		driver.get("https://www.magicbricks.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='rentheading']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='rentheading']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='rentheading']")));
		
		driver.findElement(By.xpath("//a[@id='rentheading']")).click();
		
		System.out.println(driver.findElement(By.xpath("//li//a[contains(text(),'Furnished')]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//li//a[contains(text(),'Furnished')]")).isEnabled());
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li//a[contains(text(),'Furnished')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Furnished')]")));
		
		// In CSS selector we can use space for getting all the descendant tags under a parent tag
		//List<WebElement> rentLinks = driver.findElements(By.cssSelector("div#staticSwiperSliderRent li"));
		List<WebElement> rentLinks = driver.findElements(By.xpath("//div[@id ='staticSwiperSliderRent']/descendant::li"));
		System.out.println(rentLinks.size());
		
		Random rand = new Random();
        
		int randomInt = rand.nextInt(rentLinks.size());
        System.out.println("Random int is" + randomInt);
        
        String name = rentLinks.get(randomInt).getText();
        System.out.println(name);
        rentLinks.get(randomInt).click();
        
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li//a[contains(text(),'Furnished')]")));
        //System.out.println(driver.getCurrentUrl());
        
        //System.out.println(driver.getTitle());
        
		
	}

}
