package testNg_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Gmail {
	
	WebDriver driver = null;
	String userName = "ramasani.sivareddy@gmail.com";
	String password = "9871096810";
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		
	}
	@Test
	public void gmailLogin()
	{
		driver.findElement(By.className("whsOnd")).sendKeys("userName");
		driver.findElement(By.className("RveJvd")).click();
		driver.findElement(By.className("zHQkBf")).sendKeys("password");
		driver.findElement(By.className("RveJvd")).click();
		driver.findElement(By.cssSelector("body#yDmH0d")).sendKeys("9871096810");
		driver.findElement(By.className("RveJvd")).click();
		
	}
	@AfterTest
	public void logout()
	{
		driver.findElement(By.cssSelector("span.gb_9a")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
	}
}
