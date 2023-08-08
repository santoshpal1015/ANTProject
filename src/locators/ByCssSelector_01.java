package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		/*CssSelector syntax:- tagName[attributeName='att_value']*/
		String address="input[placeholder='Username']";
		
		
		WebElement userNameField=driver.findElement(By.cssSelector(address));
		
		userNameField.sendKeys("admin");
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
