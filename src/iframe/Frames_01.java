package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='overview-frame.html']"));
		// Transfaring driver control to first frame.
		driver.switchTo().frame(firstFrame);
		
		WebElement seleniumLink=driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']"));
		seleniumLink.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
