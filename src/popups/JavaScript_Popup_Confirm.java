package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup_Confirm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1:5501/popup/confirmation.html");
		
		String confirmationMsg=driver.switchTo().alert().getText();
		System.out.println(confirmationMsg);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
