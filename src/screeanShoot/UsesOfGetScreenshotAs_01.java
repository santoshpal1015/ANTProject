package screeanShoot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetScreenshotAs_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screenshot= ts.getScreenshotAs(OutputType.FILE);
		String absolutepath=screenshot.getAbsolutePath();
		System.out.println(absolutepath);  // Screenshot path
		
		Thread.sleep(30000); //After 30 seconds ScreenShot will be deleted
		driver.quit();
		
		
	}

}
