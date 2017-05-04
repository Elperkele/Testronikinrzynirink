package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "/home/givota/Eclipse/geckodriver");
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver.get("http://www.google.com");
		driver.quit();

	}

}
