package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotGoForClassName_Contain_Space_01 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		WebElement passwordTextField=driver.findElement(By.className("textField pwdfield"));// class attribute contain space
																							//so, InvalidSelectorException.
	}

}
