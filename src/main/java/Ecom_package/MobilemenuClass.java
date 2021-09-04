package Ecom_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class MobilemenuClass {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		//in this FileInputStream - we have to mention where the file is exactly located.
		
		FileInputStream ip = new FileInputStream("D:\\Selenium Stuff\\Selenium Sessions\\src\\SeleniumPackage\\config.properties");
		
		// now we have to load this file by using properties object reference(prop) & by using a method name 'load'.
		
		prop.load(ip); 
		
		//chrome browser
		System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriverpath"));
		WebDriver driver = new FirefoxDriver(); //launch chrome // here WebDriver is the Interface and ChromeDriver is a Class.
		
	    

		driver.get("https://www.javatpoint.com/selenium-webdriver-running-test-on-firefox-browser-gecko-driver");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
