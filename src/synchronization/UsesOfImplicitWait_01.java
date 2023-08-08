package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfImplicitWait_01 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // implicit wait
		
		driver.get("https://demo.actitime.com/login.do/");
		
		WebElement userTextField=driver.findElement(By.id("username"));
		userTextField.sendKeys("admin");
		
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		passwordTextField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.xpath("//div[text()='Login ']"));
		
		loginButton.click();
		
		WebElement logoutButton=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_tips']/..//div[@class='popup_menu_icon']"));
		
		logoutButton.click();
		
		driver.quit();
	}

}
