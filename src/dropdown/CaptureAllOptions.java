package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://districts.ecourts.gov.in/");
		WebElement stateDropdown=driver.findElement(By.xpath("//select[@id='sateist']"));
		
		Select stateSelect=new Select(stateDropdown);
		
		List<WebElement> allStates=stateSelect.getOptions();
		for(WebElement st:allStates)
		{
//			System.out.println(st.getText());
			if((st.getText().equals("Please Select Your State/UT")))
		   {
			  //System.out.println(st.getText());
			    stateSelect.selectByVisibleText(st.getText());
		   }
			
		}
		if(stateDropdown.isSelected())
		{
			System.out.println("Pass: All states are selected");
		}
		else
		{
			System.out.println("Failed: All states are not selected");
		}
		driver.quit();
	}

}
