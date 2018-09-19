package testNg_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Jabong_Annotation {
	WebDriver driver = null;
	
//	@Parameters({"firstname","lastname"})
	
	@BeforeTest
	public void Jabong()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jabong.com");
	}
	
	@Test
	public void signUp(String f,String l)
	{
		//driver.findElement(By.xpath("//a[@data-custom-class='signup-nltr-modal']")).click();
		//driver.findElement(By.xpath("//label[@for='firstname']")).sendKeys("anit");
		//driver.findElement(By.xpath("//label[@for='lastname']")).sendKeys("reddy");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anitha.ramasanireddy@gmail.com");
		//driver.findElement(By.xpath("//label[@for='accessKey']")).sendKeys("9871096810");
		///driver.findElement(By.xpath("//label[@for='mobile']")).sendKeys("9871096810");
		//driver.findElement(By.cssSelector("input#female")).click();
		//driver.findElement(By.cssSelector("button#btn-signup")).click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='dialogify']")).click();
		driver.findElement(By.id("login-email")).sendKeys(f);
		driver.findElement(By.xpath("//label[@for='login-pwd']")).sendKeys(l);
		driver.findElement(By.className("sign-in")).click();
	}
	
	@AfterTest
	public void logout()
	{
		driver.findElement(By.linkText("Hey, ani")).click();
		driver.findElement(By.id("user-logout")).click();
		driver.quit();
	}
}
