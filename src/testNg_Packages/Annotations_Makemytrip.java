package testNg_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Makemytrip {
	WebDriver driver = null;
	//String userName = "ramasani.sivareddy@gmail.com";
	//String password = "9871096810";
	//int ph = 701-957-9843;
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void makemytrip()
	{	
		driver.findElement(By.xpath("//a[@id='ch_signup_icon']")).click();
		driver.findElement(By.id("ch_signup_email")).sendKeys("anitha.ramasanireddy@gmail.com");
		driver.findElement(By.id("ch_signup_phone")).sendKeys("7019579843");
		driver.findElement(By.id("ch_signup_password")).sendKeys("Ss@9871096810");
		driver.findElement(By.xpath("//button[@id='ch_signup_btn']")).click();
		driver.findElement(By.id("ch_mobile_number")).sendKeys("7019579843");
		driver.findElement(By.xpath("//button[@id='ch_otpButton_hdr']")).click();
	}
}
