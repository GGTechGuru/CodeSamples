
package search_a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author croesus
 */
public class SearchA {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
                
		driver.get("http://www.google.com");
                
                WebElement element = driver.findElement(By.name("q"));
                
                String searchStr = "Manual tester jobs, San Jose, CA";
                element.sendKeys(searchStr);
                element.submit();
                
                System.out.println("Page title found " + driver.getTitle());
                      
                (new WebDriverWait(driver, 10)).until(
                        ExpectedConditions.titleContains(searchStr));
                
		try	{
			TimeUnit.SECONDS.sleep(10);
		}
		catch (Exception e) {}
	
		driver.quit();
	
	}
}

