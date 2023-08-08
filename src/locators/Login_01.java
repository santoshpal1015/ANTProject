package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		
		WebElement usernameField=driver.findElement(By.id("username"));
		usernameField.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement passwordField=driver.findElement(By.name("pwd"));
		passwordField.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement loginButton=driver.findElement(By.linkText("Login"));
		loginButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		
	}

}
