package testNg_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedBus_Annotation {
	WebDriver driver=null;

	/*@BeforeTest
	public void RedbusPopUp()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.com");
		driver.findElement(By.cssSelector("div.close")).click();

	}*/


	@Test
	public void Search()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.com");
		driver.findElement(By.cssSelector("div.close")).click();
		driver.findElement(By.className("cntrynm")).click();
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.id("dest")).sendKeys("Anantapur Bypass");
		driver.findElement(By.className("text-trans-uc")).sendKeys("11-Sep-2018");
		driver.findElement(By.cssSelector("button#search_btn")).click();*/
	}

	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
