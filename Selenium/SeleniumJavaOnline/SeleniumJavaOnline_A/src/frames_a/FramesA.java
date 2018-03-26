
package frames_a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FramesA {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	

                driver.get("http://demo.guru99.com/selenium/deprecated.html");
                
                driver.switchTo().frame("classFrame");
                
                driver.findElement(By.linkText("Deprecated")).click();
                
		try	{
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {}
                
                driver.close();
	
		driver.quit();
	
	}
}
