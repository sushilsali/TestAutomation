package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightandDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/buttons");
		
		WebElement element = driver.findElement(By.id("rightClickBtn"));

		//WebElement singleclick=driver.findElement(By.xpath("//*[@id='XzITn']"));
		
	//	singleclick.click();
		Actions act=new Actions(driver);
		
		//act.contextClick(singleclick).perform();
		act.contextClick(element).perform();
		
		WebElement element1 = driver.findElement(By.id("doubleClickBtn"));
		
		act.doubleClick(element1).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		
		
	}

}
