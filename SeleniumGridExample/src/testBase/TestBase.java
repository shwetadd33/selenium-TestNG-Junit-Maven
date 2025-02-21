package testBase;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
public WebDriver driver = null;
public String gridURL = "http://192.168.0.31:4444";
	
public WebDriver getDriver(String browserName) throws Exception {
		
	if(browserName.equalsIgnoreCase("Chrome")) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--ignore-certificate-errors"); 
		chromeOptions.addArguments("--start-maximized");
		driver = new RemoteWebDriver(new URL(gridURL), chromeOptions);

	}else if (browserName.equalsIgnoreCase("Firefox")) {
		FirefoxOptions firefoxOptions = new FirefoxOptions();
			
		driver = new RemoteWebDriver(new URL(gridURL), firefoxOptions);

	}
	return driver;
}


@AfterTest
public void quitBrowser() {
	if(driver!=null) {
		driver.quit();
	}

}

}