package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OperatesModifierKeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");

		WebElement emailTextField = driver.findElement(By.id("email"));
		WebElement passwordTextField = driver.findElement(By.id("pass"));

		Actions actions = new Actions(driver);

		// Enter in emaill Selenium then Select all copy it and paste it in Password
		// Field
		actions.keyDown(emailTextField, Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL)
				.sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB)
				.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		// we can't user two command in one keys like--(keys.CONTROL+"A)-->not used
		// actions.keyDown(emailTextField,
		// Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys(passwordTextField,
		// "abc").build().perform();
		driver.quit();
	}

}
