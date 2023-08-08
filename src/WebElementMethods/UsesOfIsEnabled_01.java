package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// isEnabled() method belongs from WebElement interface
// It is used for <input> , <button> tag
public class UsesOfIsEnabled_01 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
		
		if(loginButton.isEnabled())
		{
			loginButton.click();
			System.out.println("Login button is enabled");
		}
		else
		{
			System.out.println("Login button is disabled");
		}
		driver.quit();
	}

}
