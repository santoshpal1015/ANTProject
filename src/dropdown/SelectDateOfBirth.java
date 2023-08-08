package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDateOfBirth {
	@Test
	public void DOB() throws InterruptedException
	{
	            //Pre-Condition
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.facebook.com/signup/");
				// selecting date of birth
				//Selecting day
				Thread.sleep(3000);
				WebElement dayDropDown=driver.findElement(By.id("day"));
				Select daySelect=new Select(dayDropDown);
				daySelect.selectByIndex(14); // index starts with 0
				
				//selecting month
				Thread.sleep(3000);
				WebElement monthdropDown=driver.findElement(By.id("month"));
				Select monthSelect=new Select(monthdropDown);
				monthSelect.selectByValue("10");
				
				//selecting year
				Thread.sleep(3000);
				WebElement yearDropDown=driver.findElement(By.id("year"));
				Select yearSelect=new Select(yearDropDown);
				yearSelect.selectByVisibleText("1997");
				
				//Post Condition
				driver.manage().window().minimize();
				driver.quit();
				
	}
}
