package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en/content/about-us");
		
		WebElement tooltip=driver.findElement(By.id("edit-search-block-form--2"));
		
		String tooltiptitle=tooltip.getAttribute("title");
		System.out.println(tooltiptitle);
		
	//	WebElement str=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[4]"));

		//String email=str.getText();
		
		//System.out.println(email);
		
	//	WebElement emailid=driver.findElement(By.xpath("//div[@class='container']//form//div//div//input[2]"));
	//	emailid.sendKeys("abc@gmail.com");
		
		
		
	}

}
