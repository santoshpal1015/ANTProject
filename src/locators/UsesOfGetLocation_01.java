package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//getLocation() is a method of WebElement interface..
//getLocation() returns Point-c 
// In Point class there is two methods -i) getX() ii) getY()
public class UsesOfGetLocation_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Finding the position of emailTextField...............................................
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		Point locationOfEmailTextField=emailTextField.getLocation();
		
		int xAxisOfEmailTextField= locationOfEmailTextField.getX();
		int yAxisOfEmailTextField=locationOfEmailTextField.getY();
		System.out.println("Position of EmailTextField: X:"+xAxisOfEmailTextField+" Y:"+yAxisOfEmailTextField);
		
		driver.quit();
	}

}
