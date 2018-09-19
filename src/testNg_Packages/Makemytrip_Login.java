package testNg_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Makemytrip_Login {
	
	WebDriver driver = null;
		
	
	@BeforeTest
	public void login()
	{
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://supportz.makemytrip.com/login");
	//driver.manage().window().maximize();
	
	//System.out.println("before test makemytrip");
	}
	
	@Test(groups= {"Makemytrip_Login"})
	public void credentials()
	{
		
		driver.findElement(By.id("mobileOrEmailId")).sendKeys("anitha.ramasanireddy@gmail.com");
		driver.findElement(By.cssSelector("input.otp-cta-email")).click();
		driver.findElement(By.name("password")).sendKeys("Ss@12345");
		driver.findElement(By.cssSelector("input.otp-btn")).click();
		assertEquals()
		//System.out.println("test annotations makemytrip");
	}
	
	
	
	
	
	
	/*@AfterTest
	public void logout()
	{
		//driver.get("https://supportz.makemytrip.com/CustomerSupport/HelpCentre");
		//WebDriverWait wait=new WebDriverWait(driver,30L);
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("ch__loggedinUser")));
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@mt-id='username']")).click();
		//driver.findElement(By.cssSelector("div.ch-switch-section")).click();
		Select select=new Select(driver.findElement(By.cssSelector("select.ch__upArrowIcon")));
		//select.selectByVisibleText("Logout");
		select.selectByIndex(8);
		
		driver.close();
		System.out.println("logging out from makemytrip");
		}*/
	
	@AfterTest
	public void logout()
	{
		driver.close();
	}
	
}
