package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public WebDriver driver = null;
	
	public WebDriver getDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--ignore-certificate-errors"); 
			//options.addArguments("--start-maximized");
			driver  = new ChromeDriver(options);
			driver.manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			 	System.setProperty("webdriver.gecko.driver", "C:\\firefox_driver\\geckodriver.exe");
		        // Initialize WebDriver
		        driver = new FirefoxDriver();

		}
		return driver;
	}

}
