package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAndScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript(window.sc, args)
		//js.executeScript("window.s")
		
		driver.findElement(By.partialLinkText("About Us")).click();
		
		driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click();
		
		String str=driver.getCurrentUrl();
		
		if(str.contains("about-us"))
		{
			System.out.println("Navigation is successful");
		}
		else
		{
			System.out.println("Navigation is not successful");
		}
		
		System.out.println("Test case passed");
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * WebElement source = driver.findElement(By.id("credit2"));
		 * 
		 * WebElement target = driver.findElement(By.id("bank"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.dragAndDrop(source, target).build().perform();
		 */
		
		//Action act = new Action(driver);
		
		
		//driver.findElement(By.id("nav_automobile")).click();
		
	//	driver.findElement(By.id("enterinsurantdata")).click();
		
	//	driver.findElement(By.id("file-upload")).sendKeys("D:\\image.jpg");

		//driver.findElement(By.id("file-submit")).click();
	}

}
