package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector_02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icc-cricket.com/homepage");
		Thread.sleep(3000);
		
		//Finding menu option
		WebElement menuButton = driver.findElement(By.cssSelector("button[class='hamburger js-sidebar-btn']"));
		menuButton.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.close();
		
		
		
	}

}
