package testNg_Packages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Listeners(Listeners_Test.class)

public class Parameter_Makemytrip {
	
	WebDriver driver=null;
	
	@Parameters({"username","password"})
	
	@Test
	
	public void login(String name,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://supportz.makemytrip.com/login");
		driver.findElement(By.id("mobileOrEmailId")).sendKeys(name);
		driver.findElement(By.cssSelector("input.otp-cta-email")).click();
		
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input.otp-btn")).click();
		
		//assertEquals("name",name);
		Assert.assertFalse(true, "both are not equal");
		
		
	}
	
}
