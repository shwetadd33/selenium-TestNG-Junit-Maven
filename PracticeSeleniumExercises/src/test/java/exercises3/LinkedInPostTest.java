package exercises3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class LinkedInPostTest extends TestBase{
	@Test
	public void TestScrollPosts() throws InterruptedException {
		
		//List<WebElement> postProfiles;
		List<WebElement> postProfiles = new ArrayList<>();
		getDriver("Chrome");
		driver.get("https://www.linkedin.com/feed/");
		
		driver.findElement(By.id("username")).sendKeys("shwetadd33@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Professional20@");
		driver.findElement(By.cssSelector("div.login__form_action_container>button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.global-nav__content")));
		
		int count = 0;
		while(true) {
			postProfiles = driver.findElements(By.cssSelector("span.update-components-actor__title >span:nth-child(1) > span >span:nth-child(1)"));
			System.out.println(count + "----" + postProfiles.size());
			if(count >= 20) {
				break;
			}
			count = postProfiles.size();
			// y cordinate of last element before scroll
			int y  = postProfiles.get(postProfiles.size()-1).getLocation().y;
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+y+")");
			Thread.sleep(3000);
		}
		
		for(WebElement element : postProfiles) {
			System.out.println(element.getText());
		}
		
	}

}
