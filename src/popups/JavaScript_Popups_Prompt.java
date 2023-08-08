package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popups_Prompt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("http://127.0.0.1:5501/popup/prompt.html");
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("25");
		String promptMsg=driver.switchTo().alert().getText();
		System.out.println(promptMsg);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
