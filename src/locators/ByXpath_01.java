package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://shop.malaicha.com/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Accept cookies']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.close();
		
	}

}
