package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");
		
		driver.findElement(By.linkText("About Us")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.className("emblem-resize")).click();
		
	//	driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/a/img")).click();
		
	//	driver.switchTo().alert().accept();
		
	
		
		
	}

}
