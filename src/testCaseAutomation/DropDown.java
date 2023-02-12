package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://whatisconvert.com/12-meters-in-feet");
		
		Select dropdown=new Select(driver.findElement(By.id("unitFrom")));

		//dropdown.selectByValue("inches");
//		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("Millimeters (mm)");
		
		driver.findElement(By.className("button-margin")).click();
	}

}
