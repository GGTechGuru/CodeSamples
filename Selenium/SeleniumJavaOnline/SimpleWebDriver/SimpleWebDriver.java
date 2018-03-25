import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SimpleWebDriver {
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.seleniumhq.org/");
		
		try	{
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {}
	
		driver.quit();
	
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
				
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		try	{
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {}
	
		driver.quit();
	}
}
