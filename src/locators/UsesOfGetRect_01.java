package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// getRect() is the method of WebElement interface 
// getRect() returns Rectangle-c
// in Rectangle class there are 4  methods -i)getHeight() ii)getWidth() iii)getX() iv) getY()
// to find the alignment of the components we use getRect() method.
public class UsesOfGetRect_01 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		// finding left- alignment of email textField..........................................................
		 WebElement emailTextField=driver.findElement(By.id("email"));
		 Rectangle AlignmentOfEmailTextField=emailTextField.getRect();
		 int startXofEmailTextField=AlignmentOfEmailTextField.getX();
		 int widthOfEmailTextField=AlignmentOfEmailTextField.getWidth();
		 
		 int endXofEmailTextField= startXofEmailTextField+widthOfEmailTextField;
		 System.out.println();
		 
		// finding left-alignment of password textField.........................................................
		 
		 WebElement passwordTextField=driver.findElement(By.id("pass"));
		 Rectangle alignmentOfPasswordTextField=passwordTextField.getRect();
		 int startXofPasswordTextField= alignmentOfPasswordTextField.getX();
		 int widthOfPasswordTextField= alignmentOfPasswordTextField.getWidth();
		 
		 int endXofPasswordTextField= startXofPasswordTextField+ widthOfPasswordTextField;
		 
		 
	}

}
