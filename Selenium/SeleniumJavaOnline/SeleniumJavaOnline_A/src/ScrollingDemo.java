import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollingDemo {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
				
		WebDriver driver = new FirefoxDriver();
                
		driver.get("http://www.seleniumhq.org/");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
                
		jse.executeScript("window.scrollBy(0, 300)", "");
                
                try { TimeUnit.SECONDS.sleep(5); } catch (Exception e) {}
                
		jse.executeScript("window.scrollBy(0, -300)", "");               
                try { TimeUnit.SECONDS.sleep(5); } catch (Exception e) {}
                
                jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");              
                try { TimeUnit.SECONDS.sleep(5); } catch (Exception e) {}
                
		driver.quit();
	
	}
}

