package testPackage;

import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CookieKliker {

	static int cookies = 1;
	
	public static void main(String[] args) {
		
		//this imports the WebD driver object
		WebD browse = new WebD();
		//This launches the webdriver
		browse.launch();
		//Thanks to passing the driver from a different class, we can now manipulate it in this one
		browse.driver.get("http://orteil.dashnet.org/cookieclicker");
		for (int i = 0; i < 15; i++){
			  browse.driver.findElement(By.xpath(".//*[@id='bigCookie']")).click();
			  //i+1 because 0 indexing lol
			  cookies = i+1;
			  System.out.println(cookies);
			 if (i == 14){
				 browse.driver.findElement(By.xpath(".//*[@id='product0']")).click();
			 }
		}
		browse.driver.findElement(By.xpath(".//*[@id='bakeryName']")).click();
		browse.driver.findElement(By.xpath(".//*[@id='bakeryNameInput']")).sendKeys("Orteil");
		browse.driver.findElement(By.xpath(".//*[@id='promptOption0']")).click();

	}

}
class WebD {
	
	WebDriver driver;
	
	public void launch() {
		System.setProperty("webdriver.firefox.marionette", "/home/givota/Eclipse/geckodriver");
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
	}
}

