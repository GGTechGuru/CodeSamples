package craigslistToyotaSearch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Gerard Anthony Gold
 * Change the Craigslist Toyota saved search to a Toyota Prius search.
 * Then delete it from saved searches.
 */
public class CraigslistUpdateToyotaPriusSearch {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
						
		WebDriver   driver = new FirefoxDriver();
                
                WebDriverWait wait = new WebDriverWait(driver, 5);

                driver.get("https://sfbay.craigslist.org/");
                
                // Login
                wait.until(ExpectedConditions.elementToBeClickable(By.linkText("my account")));
                driver.findElement(By.linkText("my account")).click();
                
                wait.until(ExpectedConditions.elementToBeClickable(By.id("inputEmailHandle")));
                WebElement emailField = driver.findElement(By.id("inputEmailHandle"));               
                emailField.sendKeys("gerard.mba.mscs@gmail.com");
                
                WebElement pwdField = driver.findElement(By.id("inputPassword"));
                pwdField.sendKeys("PoBox5533");
                pwdField.submit();
                
                // Click on the "searches" tab.
            	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("searches")));
                driver.findElement(By.linkText("searches")).click();
                
                // Find the search for "Toyota"
                wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("search terms: Toyota,")));             
                driver.findElement(By.partialLinkText("search terms: Toyota,")).click();

                wait.until(ExpectedConditions.elementToBeClickable(By.id("query")));
                WebElement savedSearchField = driver.findElement(By.id("query")); 
		
                // Change it to Toyota Prius
                savedSearchField.clear();
                savedSearchField.sendKeys("Toyota Prius");
                
                driver.findElement(By.linkText("save search")).click();
                
                // Verify that there is a Toyota Prius search
                wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("search terms: Toyota Prius,")));          
                WebElement priusLink = driver.findElement(By.partialLinkText("search terms: Toyota Prius,"));               
                
                
                // Go up a couple of levels to stay in the same row, find and click Delete.
                WebElement searchToDeleteAncestor = priusLink.findElement(By.xpath("../.."));
                searchToDeleteAncestor.findElement(By.xpath(".//button[text()='delete']")).click();  
                
                // Wait for the logout button to be clickable.
                wait.until(ExpectedConditions.elementToBeClickable(By.linkText("log out")));
                
                // Leaving this commented out now.
                // driver.findElement(By.linkText("log out")).click();                
                // driver.quit();
	
	}

    
}
