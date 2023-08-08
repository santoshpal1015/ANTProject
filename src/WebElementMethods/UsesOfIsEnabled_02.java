package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfIsEnabled_02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(3000);
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@name='submit']"));
		
		if(submitButton.isEnabled())
		{
			submitButton.click();
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
		driver.quit();
	}

}
