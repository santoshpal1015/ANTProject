package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureDefaultSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/signup/");
		
		// printing default day from day dropdown
		WebElement dayDropDown=driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropDown);
		String defaultDaySelectedOption=daySelect.getFirstSelectedOption().getText();
		System.out.println("Default day selected:"+defaultDaySelectedOption);
		
		//printing default month from month dropdown
		WebElement monthdropDown=driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthdropDown);
		monthSelect.selectByIndex(10);
		String defaultMonthSelect=monthSelect.getFirstSelectedOption().getText();
		System.out.println("Default month selected:"+defaultMonthSelect);
		driver.quit();
		
	}

}
