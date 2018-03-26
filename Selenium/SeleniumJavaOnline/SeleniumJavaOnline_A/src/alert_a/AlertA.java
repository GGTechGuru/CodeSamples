package alert_a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AlertA {
    
	public static void main(String[] argv)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"/home/croesus/node_modules/chromedriver/lib/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	

                driver.get("http://jsbin.com/usidix/1");
                        
                driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
                
                String alertText = driver.switchTo().alert().getText();
                System.out.println("Alert text " + alertText);               
 		try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {}
                
                driver.switchTo().alert().accept();               
                try	{ TimeUnit.SECONDS.sleep(5); } catch (Exception e) {}             	
		
                driver.quit();
	
	}
}

