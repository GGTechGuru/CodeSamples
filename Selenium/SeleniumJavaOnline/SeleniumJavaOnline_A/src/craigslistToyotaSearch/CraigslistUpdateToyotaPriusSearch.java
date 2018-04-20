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
 * @author croesus
 */
public class CraigslistUpdateToyotaPriusSearch {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
						
		WebDriver   driver = new FirefoxDriver();
                
                WebDriverWait wait = new WebDriverWait(driver, 5);

                driver.get("https://sfbay.craigslist.org/");
                
                // WebElement searchField = driver.findElement(By.id("query"));               
                // searchField.sendKeys("Toyota");
                // searchField.submit();
                
                // try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                // driver.findElement(By.linkText("save search")).click();
                
                driver.findElement(By.linkText("my account")).click();
                
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                WebElement emailField = driver.findElement(By.id("inputEmailHandle"));               
                emailField.sendKeys("gerard.mba.mscs@gmail.com");
                
                WebElement pwdField = driver.findElement(By.id("inputPassword"));
                pwdField.sendKeys("PoBox5533");
                pwdField.submit();
                              
            	try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                driver.findElement(By.linkText("searches")).click();
                
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                // WebElement searchToEdit = driver.findElement(By.xpath("//input[@value='Toyota']"));
                
                driver.findElement(By.partialLinkText("search terms: Toyota,")).click();
                
                // WebElement searchToEditParent = driver.findElement(By.xpath(".."));
                              
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {} 
                // driver.findElement(By.xpath(".//button[text()='edit']")).click();                
                                
                // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("query")));
                WebElement savedSearchField = driver.findElement(By.id("query")); 
		
                savedSearchField.clear();
                savedSearchField.sendKeys("Toyota Prius");
                
                
                driver.findElement(By.linkText("save search")).click();
                // searchField.submit();
                // driver.quit();
	
	}

    
}
