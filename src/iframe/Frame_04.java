package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_04 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	    
		WebDriver parentFrame=driver.switchTo().frame("iframeResult"); // control goes to parent frame
		driver.switchTo().frame(0); // control goes to child frame because it only have 1 child frame.
		
		String childFrameText=driver.findElement(By.xpath("//body/h1")).getText();
		System.out.println("Child Frame Text: "+childFrameText);
		
		driver.switchTo().parentFrame();// control goes from child to parent frame
		String parentFrameText=driver.findElement(By.xpath("//body/h2")).getText();
		System.out.println("Parent Frame Text: "+parentFrameText);
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		
		driver.quit();
		
		
		
	}

}
