
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class GridExample {

public static void main(String[] args) throws Exception {
	WebDriver driver = null;
	String gridURL = "http://192.168.0.31:4444";
	
	//ChromeOptions chromeOptions = new ChromeOptions();
	//chromeOptions.addArguments("--start-maximized");
	//driver = new RemoteWebDriver(new URL(gridURL), chromeOptions);
	
	FirefoxOptions firefoxOptions = new FirefoxOptions();
		
	driver = new RemoteWebDriver(new URL(gridURL), firefoxOptions);
	
	driver.get("https://www.google.com");
	driver.quit();
	
}

}
