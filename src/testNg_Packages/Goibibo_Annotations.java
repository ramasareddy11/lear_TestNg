package testNg_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Goibibo_Annotations 
{
	WebDriver driver = null;
	
	@BeforeTest
	public void goibibo()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://in.bookmyshow.com/bengaluru/events");
		driver.manage().window().maximize();
	}
	@Test
	public void signUp()
	{
		driver.findElement(By.cssSelector("button#wzrk-cancel")).click();
		driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.xpath("//input[@name='gi_traveltype']")).click();
		driver.findElement(By.id("iUserName")).sendKeys("7019579843");
		driver.findElement(By.cssSelector("div.submit-form")).click();
		driver.findElement(By.cssSelector("div._1fub")).click();
		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_5xrj']")).click();
	}
	@AfterTest
	public void quit()
	{
		driver.findElement(By.linkText("profileNameId")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
	}
}
