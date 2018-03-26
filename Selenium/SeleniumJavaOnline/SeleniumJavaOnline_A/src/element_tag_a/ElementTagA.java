package element_tag_a;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ElementTagA {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
                
		driver.get("http://www.facebook.com");
                
                String tagName = driver.findElement(By.id("email")).getTagName();
                
                System.out.println("Tag name is " + tagName);
		try	{
			TimeUnit.SECONDS.sleep(5);
		}
		catch (Exception e) {}
	
		driver.quit();
	
	}
}


