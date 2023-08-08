package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorClass_01 {
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.manage().window().maximize();
		
		WebElement passwordField=driver.findElement(By.name("pwd"));
		passwordField.sendKeys("manager");
		
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
