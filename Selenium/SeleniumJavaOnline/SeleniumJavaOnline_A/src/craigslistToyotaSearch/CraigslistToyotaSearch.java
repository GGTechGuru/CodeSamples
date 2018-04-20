package craigslistToyotaSearch;

import java.util.List;
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
public class CraigslistToyotaSearch {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.gecko.driver",
				"/home/croesus/node_modules/geckodriver/geckodriver");
						
		WebDriver   driver = new FirefoxDriver();	
                WebDriverWait wait = new WebDriverWait(driver, 5);

                driver.get("https://sfbay.craigslist.org/");
                
                WebElement searchField = driver.findElement(By.id("query"));               
                searchField.sendKeys("Toyota");
                searchField.submit();
                
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("next >")));
                driver.findElement(By.linkText("next >")).click();                                      
                
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='result-title hdrlnk']")));
                List<WebElement> resultRows = driver.findElements(By.xpath("//a[@class='result-title hdrlnk']"));               
                for (WebElement row : resultRows) {
                    System.out.println(row.getText());
                }
                
                driver.findElement(By.linkText("save search")).click();
                
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputEmailHandle")));
                WebElement emailField = driver.findElement(By.id("inputEmailHandle"));               
                emailField.sendKeys("gerard.mba.mscs@gmail.com");
                
                WebElement pwdField = driver.findElement(By.id("inputPassword"));
                pwdField.sendKeys("PoBox5533");
                pwdField.submit();
                
                // Verify it's in saved searches.
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("search terms: Toyota,")));               

                driver.findElement(By.linkText("log out")).click();
		
                driver.quit();
	
	}
}
