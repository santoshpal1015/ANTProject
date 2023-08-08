package screeanShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenshot_01 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timeStamp=LocalDateTime.now().toString().replace(':', '-');
		
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		
		
		File tempCC=loginButton.getScreenshotAs(OutputType.FILE);
		File permCC=new File("./bugshots/FacebookLoginButton"+timeStamp+".png");
		
		FileUtils.copyFile(tempCC, permCC);
		
		driver.quit();
	}

}
