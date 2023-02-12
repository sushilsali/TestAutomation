package testCaseAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		String parenthandle=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"pre-footer\"]/div/footer/div[1]/div/div[3]/div[2]/div/div/a[3]")).click();
		
	
		//driver.findElement(By.xpath("//*[@id=\"pre-footer\"]/div/footer/div[1]/div/div[3]/div[2]/div/div/a[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"pre-footer\"]/div/footer/div[1]/div/div[3]/div[2]/div/div/a[5]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.className("input__input")).sendKeys("username");
		//driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/button/icon/svg")).click();
		
		//driver.findElement(By.className("input__input")).sendKeys("abc@gmail.com");
		
		//driver.findElement(By.className("linkedin-text")).click();
	
		
		Set<String> handles= driver.getWindowHandles();
		
		Iterator it=handles.iterator();
		
		String parent=(String) it.next();
		String child=(String) it.next();
		
		
		driver.switchTo().window(child);
		
		Actions act=new Actions(driver);
		
		WebElement text=driver.findElement(By.xpath("//input[@id='search']"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.keyDown(Keys.SHIFT).build().perform();
		text.sendKeys("h");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.keyUp(Keys.SHIFT).build().perform();
		text.sendKeys("ello");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(parenthandle);
		
		driver.findElement(By.id("search")).sendKeys("table");
		
		driver.findElement(By.xpath("//*[@id=\"regPopUp\"]/a")).click();
		
		driver.findElement(By.id("searchButton")).click();
		System.out.println("Test case passed !");
		
	}

}
