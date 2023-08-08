package locators;
// getSize() is the method of WebElement interface
// getSize() returns Dimension-c 
// in Dimension class there is two methods -i) getHeight() ii) getWidth()

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetsize_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Finding heigth & width of emailTextField.............................................................
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		Dimension sizeOfEmailTextField=emailTextField.getSize();
		int heigthOfEmailTextField=sizeOfEmailTextField.getHeight();
		int widthOfEmailTextField=sizeOfEmailTextField.getWidth();
		
		System.out.println("emailTextField: heigth="+heigthOfEmailTextField+" width="+widthOfEmailTextField);
		//Finding heigth & width of passwordTextField............................................................
		WebElement passwordTextField=driver.findElement(By.id("pass"));
		
		Dimension sizeOfPasswordTextField=passwordTextField.getSize();
		 int heigthofPasswordTestField=sizeOfPasswordTextField.getHeight();
		 int widthOfPasswordTextField=sizeOfPasswordTextField.getWidth();
		 System.out.println("passwordTextField: heigth="+heigthofPasswordTestField+" width="+widthOfPasswordTextField);
		 
		 
		 driver.quit();
		  
		
	}

}
