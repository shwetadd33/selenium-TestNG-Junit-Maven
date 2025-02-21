package testcases;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pages.LaunchPage;

public class LoginTest {
	@Test 
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--ignore-certificate-errors"); 
		options.addArguments("--start-maximized");
		WebDriver driver  = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LaunchPage lp = new LaunchPage();
		lp.navigateToHomePage(driver);
	}

}
