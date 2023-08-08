package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotGoForId_DynamicId {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement loginButton=driver.findElement(By.id("u_0_5_or"));  // here, id is Dynamic in nature, NoSuchElementFoundException
			loginButton.click();
			
	}


}
