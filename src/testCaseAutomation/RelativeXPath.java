package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");
		
		driver.findElement(By.xpath("//input[@name='search_block_form']")).sendKeys("vahan");
		
		driver.findElement(By.xpath("//*[@id=\"search-block-form\"]/div/div/div[1]/span/button")).click();
		
		driver.findElement(By.xpath("//input[@class = 'form-control form-text'or@id = 'edit-keys']")).sendKeys("dealer");
		
		//driver.findElement(By.xpath("//img[contains(@alt,'G20')]")).click();
		
		//driver.switchTo().alert().dismiss();
		//driver.close();
	}

}
