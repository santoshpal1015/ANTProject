package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class UsesOfGetCssValue_01 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(3000);
		
		String cssValue=loginButton.getCssValue("font-family");
		System.out.println(cssValue);
		String col=loginButton.getCssValue("background-color");
		System.out.println("RGB VALUE: "+col); //24,119,242,1(Chrome)
		
		// Converting RGB value to hex color code value...
		String hexCol=Color.fromString(col).asHex();
		
		System.out.println("HEX VALUE: "+hexCol); //18772f(Chrome)
		
		driver.quit();
		
		
		
	}

}
