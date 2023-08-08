package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.landrover.in/range-rover/index.html");
		WebElement vehiclesButton=driver.findElement(By.xpath("//span[text()='VEHICLES']"));
		WebElement exploreButton=driver.findElement(By.xpath("//a[@aria-label='EXPLORE LAND ROVER']//span[text()='EXPLORE']"));
		
		Actions a =new Actions(driver);
		a.moveToElement(vehiclesButton).pause(3000).moveToElement(exploreButton).perform();
		a.moveToElement(vehiclesButton, 0, 0).pause(3000).moveToElement(vehiclesButton, 225, 0).perform();
	
	}

}
