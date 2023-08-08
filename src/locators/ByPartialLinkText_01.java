// when LinkText is lengthy , we go for partial linkText.
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://alvas.org/");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.partialLinkText("Medical Laboratory Technology"));
		Thread.sleep(5000);
		link.click();
		Thread.sleep(4000);
		driver.navigate().back();
	
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
