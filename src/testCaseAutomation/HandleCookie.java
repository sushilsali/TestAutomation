package testCaseAutomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Cookie cookie1=new Cookie("Facebook","www.facebook.com");
				
		driver.manage().addCookie(cookie1);
		//driver.manage().deleteCookie(cookie1);
		
		
		driver.get("https://www.google.com/");
		Cookie cookie2=new Cookie("Google","www.google.com");
		
		driver.manage().addCookie(cookie2);
	//	driver.manage().deleteCookieNamed("Facebook");
		driver.manage().deleteAllCookies();
		
		
	//	Set <Cookie> listofcookies = driver.manage().getCookies();
		
	//	System.out.println(cookie1.getName());
	//	System.out.println(cookie1.getValue());
		
		/*
		 * for(Cookie cookie3 : listofcookies) { //
		 * System.out.println(cookie3.getValue()); }
		 */
		
		
		
		try {
		System.out.println(driver.manage().getCookieNamed("Facebook").getName());
		System.out.println(driver.manage().getCookieNamed("Facebook").getDomain());
			System.out.println(driver.manage().getCookieNamed("Facebook").getValue());
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		driver.quit();
	}

}
