package craigslistToyotaSearch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author croesus
 */
public class CraigslistToyotaSearch {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
						
		WebDriver   driver = new FirefoxDriver();	

                driver.get("https://sfbay.craigslist.org/");
                
                WebElement searchField = driver.findElement(By.id("query"));               
                searchField.sendKeys("Toyota");
                searchField.submit();
                
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                driver.findElement(By.linkText("save search")).click();
                
                // driver.findElement(By.linkText("my account")).click();
                
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                WebElement emailField = driver.findElement(By.id("inputEmailHandle"));               
                emailField.sendKeys("gerard.mba.mscs@gmail.com");
                
                WebElement pwdField = driver.findElement(By.id("inputPassword"));
                pwdField.sendKeys("PoBox5533");
                pwdField.submit();
                              
            	try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                // driver.findElement(By.linkText("log out")).click();
		
                // driver.quit();
	
	}
}
