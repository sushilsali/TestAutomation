package testCaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver2=new EdgeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		driver.findElement(By.partialLinkText("Terms")).click();
	//	driver.findElement(By.linkText("Account")).click();
		
		try
		{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		if(driver.findElement(By.linkText("Help")).isDisplayed())
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		/*
		 * String str1=driver.getPageSource();
		 * System.out.println("Page source is: "+str1);
		 * 
		 * String str2=driver.getCurrentUrl();
		 * System.out.println("Current URL is: "+str2);
		 * 
		 * if(str2.contains("amazon")) { System.out.
		 * println("The navigation to Amazon is successful and test case is passed"); }
		 * else { System.out.
		 * println("The navigation to Amazon is not successful. Test case failed"); }
		 */
		
		/*
		 * driver.findElement(By.id("search")).sendKeys("table");
		 * 
		 * driver.findElement(By.id("searchButton")).click();
		 * 
		 * try { Thread.sleep(4000); } catch(Exception e) { System.out.println(e); }
		 * 
		 * WebElement first=driver.findElement(By.className("clipCard__price-offer"));
		 * 
		 * if(first!=null) { System.out.println("Test Case passed"); } else {
		 * System.out.println("Test case failed"); }
		 */
		
		
		//driver.findElement(By.id("searchButton")).click();
		
		/*
		 * driver.findElement(By.linkText(
		 * "https://www.pepperfry.com/partner-with-us.html?partner=seller&&type=header")
		 * ).click();
		 * 
		 * boolean second=driver.findElement(By.linkText(
		 * "https://ii2.pepperfry.com/media/catalog/product/e/l/494x544/elegant-solid-wood-armchair-in-honey-oak-finish-by-woodsworth-elegant-solid-wood-armchair-in-honey-o-dmkctz.jpg"
		 * )).isDisplayed();
		 * 
		 * boolean first=driver.findElement(By.className("cat-wrap-ttl")).isDisplayed();
		 * 
		 * if(second==true) { System.out.println("Test Case passed"); } else {
		 * System.out.println("Test case failed"); }
		 */
		
		
		/*
		 * String str="clipCard__ttl marginBottom8"; String
		 * str1=driver.findElement(By.className("clipCard__ttl.marginBottom8")).toString
		 * ();
		 * 
		 * //driver.findElement(By.className("clipCard__ttl marginBottom8"))
		 * 
		 * if(str==str1) { System.out.println("Test case passed !"); } else {
		 * System.out.println("Test case failed"); }
		 */
		
		//driver.findElement(By.linkText("https://www.pepperfry.com/terms-of-use.html")).click();
		
		// driver.close();
		/*
		 * String str=driver.getTitle(); System.out.println("Page Title is: "+str);
		 * 
		 * driver.get("https://www.rediff.com/");
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.navigate().to("https://login.yahoo.com/?.intl=in&rl=1&.src=ym");
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.navigate().forward();
		 */
		
		
		
		//driver.quit();
		
		
	//	driver2.findElement(By.name("ZUkOIc")).click();				
			//	className("M6CB1c.yZqNl")).click();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive");
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
	}

}
