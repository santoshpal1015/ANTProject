package synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfPageLoadTimeout_01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		try
		{
			driver.get("https://www.flipkart.com/");
		}
		catch(TimeoutException t)
		{
			System.out.println("Application is not having the capacity to load whole page within 2 seconds");
		}
		driver.quit();
	}

}
