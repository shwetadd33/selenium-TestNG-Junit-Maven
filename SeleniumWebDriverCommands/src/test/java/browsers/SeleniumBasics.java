package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumBasics {

	@Test
	public void testApp() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
	}
}
