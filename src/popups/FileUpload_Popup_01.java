package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popup_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement uploadFile=driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\SANTOSH\\Desktop\\selenium.txt");
		Thread.sleep(3000);
		WebElement termsAndCondition=driver.findElement(By.id("terms"));
		termsAndCondition.click();
		
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,500)");
		
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
		
		driver.quit();
	}

}
