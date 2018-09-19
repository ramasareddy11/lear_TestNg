package testNg_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makemytrip_Dataprovider {
	
	WebDriver driver=null;
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		//2 rows and 2 columns
		data[0][0]="anitha.ramasanireddy@gmail.com";
		data[0][1]="Ss@12345";
		
		data[1][0]="anitha@gmail.com";
		data[1][1]="s98710900";
		
		return data;
	}
	@Test(dataProvider="getData")
	
	public void makemytrip(String email,String pwd )
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://supportz.makemytrip.com/login");
		driver.findElement(By.id("mobileOrEmailId")).sendKeys(email);
		driver.findElement(By.cssSelector("input.otp-cta-email")).click();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input.otp-btn")).click();
		
	}
}
