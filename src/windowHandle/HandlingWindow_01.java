package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowHanlde=driver.getWindowHandle();
		System.out.println("Parent window:"+parentWindowHanlde);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String>allWindows=driver.getWindowHandles();
		for(String window:allWindows)
		{
			System.out.println(window);
			if(!(window.equals(parentWindowHanlde)))
			{
				driver.switchTo().window(window);
				driver.findElement(By.id("firstName")).sendKeys("santosh");
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowHanlde);
		driver.close();
		
		
		
		
		
		
		//driver.quit();
		
	}

}
