package testCaseAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://www.rediff.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait hold=new WebDriverWait(driver,10);
		
		WebDriverWait pause=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement frame1=pause.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
		
		frame1.click();
		
		//WebDriverWait explicitwait = new WebDriverWait (driver, 10);
		
		//WebElement frame1=explicitwait.until(null)
		
		
		
		//WebElement frame=driver.findElement(By.id("moneyiframe"));
		
		//driver.switchTo().frame(frame);
		
	//	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/a")).click();
		
		driver.quit();
		
		System.out.println("Explicit Wait");
	}

}
