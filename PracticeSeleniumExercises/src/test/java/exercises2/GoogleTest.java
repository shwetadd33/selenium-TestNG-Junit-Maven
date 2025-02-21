package exercises2;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class GoogleTest extends TestBase{
	
	@Test
	public void SearchTest() throws InterruptedException {
		
		String searchSelection = "hello fresh";
		getDriver("Chrome");
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea[title=Search]")));
		
		
		driver.findElement(By.cssSelector("textarea[title=Search]")).sendKeys("hello");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
		
		List<WebElement> searchDropDown = driver.findElements(By.xpath("//div[@class = 'wM6W7d']//span[contains(text(), 'hello') or contains(text(), 'Hello')]"));
		System.out.println(searchDropDown.size());
		
		for(WebElement element : searchDropDown) {
			System.out.println("-----");
			System.out.println(element.getText());
		}
		
		// clicking on a link with text matching with the searchSelection String
		int flag = 0;
		for(WebElement element : searchDropDown) {
			String el = element.getText();
			if(el.equalsIgnoreCase(searchSelection)) {
				System.out.println("-------Match Found----");
				element.click();
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			Assert.fail("No clickable link");
		}else
		{
			Assert.assertEquals(flag, 1, "Clickable link");
		}
        
		
		/*clicking on a random link
        
		Random rand = new Random();
        
		int randomInt = rand.nextInt(searchDropDown.size());
        System.out.println("Random int is" + randomInt);
        
        String name = searchDropDown.get(randomInt).getText();
        System.out.println(name);
        searchDropDown.get(randomInt).click();
        */
		
		
        
		
		//driver.quit();
	}

}
