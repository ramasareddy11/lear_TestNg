package testNg_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Facebook {
	
	public WebDriver driver=null;
	String username="reddyfornjoy@gmail.com";
	String password="Ani@9871";
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login");
	}
	
	@Test
	public void loginIntoFaceBook()
	{
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterTest
	public void logout()
	{
		driver.close();
	}
}
