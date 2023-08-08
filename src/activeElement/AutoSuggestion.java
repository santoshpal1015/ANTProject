package activeElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestion {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("selenium");
		List<WebElement> autoSugg=driver.findElements(By.xpath("//div[@role='presentation']/ul[@role='listbox']/li"));
		for(WebElement opt:autoSugg)
		{
			String option=opt.getText();
			if(option.contains(" download"))
			{
				opt.click();  // Generates StateElementException, use break.
				break;  
			}
		}
		driver.quit();
	}

}
