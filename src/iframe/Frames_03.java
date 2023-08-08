package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_03 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://demo.automationtesting.in/Frames.html");
	    
	    driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	    
	    WebElement outerFrame=driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	    driver.switchTo().frame(outerFrame);
	    WebElement innerFrame=driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	    driver.switchTo().frame(innerFrame);
	    WebElement textField=driver.findElement(By.xpath("//input[@type='text']"));
	    textField.sendKeys("Abhay ");
		
		
	}

}
