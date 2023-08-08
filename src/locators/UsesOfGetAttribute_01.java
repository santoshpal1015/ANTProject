package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetAttribute_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.id("email"));
		String expectedPlaceholder=email.getAttribute("placeholder");
		String actualPlaceholder="Email address or phone number";
		Thread.sleep(3000);
		
		if(actualPlaceholder.equalsIgnoreCase(expectedPlaceholder))
		{
			System.out.println("Test passed....");
		}
		driver.close();
	}

}
