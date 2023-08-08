package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		WebElement logo=driver.findElement(By.className("_2xm1JU"));
		
		String actualTitle=logo.getAttribute("title");
		
		System.out.println(actualTitle);
		driver.quit();
	}

}
