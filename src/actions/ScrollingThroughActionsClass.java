package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingThroughActionsClass {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.fb.com");
	WebElement developersLink=driver.findElement(By.linkText("Developers"));
	Actions actions=new Actions(driver);
	actions.scrollToElement(developersLink).click(developersLink).build().perform();
	actions.scrollByAmount(0, 1000).perform();
	
}
}
