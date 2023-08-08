package screeanShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetScreenshotAs_02 {
 public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String currentDateTime=LocalDateTime.now().toString().replace(':','_');
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		TakesScreenshot ts=(TakesScreenshot)driver;  // (WebDriver to TakesScreenshot) parent to parent type casting
		
		File tempCC= ts.getScreenshotAs(OutputType.FILE); // temporary screenshot.
		File permCC= new File("./erroeshots/"+currentDateTime+"irctcwebpage.png"); // file location 
		
		FileUtils.copyFile(tempCC, permCC);  // storing temporary screenshot
		
		driver.quit();
		

  }
}
