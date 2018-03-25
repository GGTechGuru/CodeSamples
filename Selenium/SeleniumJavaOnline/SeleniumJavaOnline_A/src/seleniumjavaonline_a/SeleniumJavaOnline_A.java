package seleniumjavaonline_a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumJavaOnline_A {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
                
		driver.get("http://www.seleniumhq.org/");

		String expTitle = "Selenium - Web Browser Automation";
		String actualTitle = driver.getTitle();

		if (!actualTitle.contentEquals(expTitle)) {
			System.err.println("Actual title " + actualTitle + " not as expected " + expTitle);
		}

		try	{
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {}
	
		driver.quit();
	
	}
}
