package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/doodles");
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		while(true)
		{
			try {
				driver.findElement(By.xpath("//a[text()='Dragon Boat Festival 2023']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				jse.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
