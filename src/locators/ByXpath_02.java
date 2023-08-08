package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath_02 {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mcdonalds.com/us/en-us.html");
		
		WebElement rewordsField=driver.findElement(By.xpath("(//a)[51]"));
		
		rewordsField.click();
		
		driver.manage().window().minimize();
		driver.close();
		
		
		
	}

}
