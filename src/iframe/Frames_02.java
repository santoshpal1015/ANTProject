package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		
		WebElement link=driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']"));
		link.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		WebElement alertLink=driver.findElement(By.xpath("//span[text()='Alert']"));
		alertLink.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
