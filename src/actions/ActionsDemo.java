package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.fb.com/");
//		driver.get("https://www.google.com/");
	//	driver.get("https://www.flipkart.com/");-->we can handle the flipkart pop up
		
		WebElement loginButton = driver.findElement(By.name("login"));
		Actions actions = new Actions(driver);
//		actions.click(loginButton).perform();
		// For RightClick---->ContextFiled
//actions.contextClick(loginButton).perform();
//		actions.contextClick().perform();
		// WebElement passwordTextField = driver.findElement(By.id("pass"));
		// actions.sendKeys(passwordTextField, "123@abc").perform();
		driver.switchTo().activeElement();
//		actions.sendKeys("qspiderBtm").perform();
		actions.click().perform();
	}

}
