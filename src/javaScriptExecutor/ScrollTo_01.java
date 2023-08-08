package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_01 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,5000)");  // JavaScript instruction in the form of String
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollTo(0,3000)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,-3000"); //back to staring position ie,0
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
