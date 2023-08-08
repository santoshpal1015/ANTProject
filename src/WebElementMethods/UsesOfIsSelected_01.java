package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isSelected() method belongs to WebElement interface
//it is used for checkBoxx, RadioButton
public class UsesOfIsSelected_01 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(3000);
		 WebElement maleRadioButton=driver.findElement(By.xpath("//label[text()='Male']/..//input[@name='sex']"));
		 
		 if(maleRadioButton.isSelected())
		 {
			 System.out.println("Button is selected");
		 }
		 else
		 {
			 maleRadioButton.click();
			 System.out.println("Button is not selected");
		 }
		 
	}

}
