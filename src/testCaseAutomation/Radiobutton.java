package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yatra.com/cabs");
		
		WebElement radiobutton2=driver.findElement(By.id("BE_cab_local"));
		
		System.out.println(radiobutton2.isDisplayed());
		System.out.println(radiobutton2.isEnabled());
		System.out.println(radiobutton2.isSelected());
		
		radiobutton2.click();
		
		System.out.println(radiobutton2.isSelected());
		
		
	//	driver.findElement(By.id("nav_camper")).click();
		
	}

}
