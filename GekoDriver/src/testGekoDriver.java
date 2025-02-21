import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testGekoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "C:\\firefox_driver\\geckodriver.exe");

        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open a website
        driver.get("https://www.google.com");

	}

}
