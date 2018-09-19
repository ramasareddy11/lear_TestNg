package testNg_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Trivago {
	WebDriver driver = null;
	//String email = "anith@gmail.com";
	String password = "Sunanda";
	Select select=null;
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://access.trivago.com/oauth/en-IN/register");
		driver.get("https://access.trivago.com/oauth/en-IN/login");
	}
	@Test
	public void trivago_SighUp()
	{
		/*driver.findElement(By.id("registration_email")).sendKeys("anithareddy.ramasani@gmail.com");
		driver.findElement(By.id("registration_password")).sendKeys("password");
		driver.findElement(By.cssSelector("input#registration_agreement_agree_terms_and_conditions")).click();
		driver.findElement(By.cssSelector("input#registration_agreement_agree_privacy_policy")).click();
		driver.findElement(By.className("btn--signup")).click();
		driver.findElement(By.className("text-direction-ltr")).click();
		driver.findElement(By.cssSelector("input#horus-querytext")).sendKeys("bangalore");
		driver.findElement(By.cssSelector("button.horus-btn-search")).click();*/
		
		driver.findElement(By.id("login_email")).sendKeys("ramasani.sivareddy@gmail.com");
		driver.findElement(By.className("js_password")).sendKeys("Sunanda");
		driver.findElement(By.cssSelector("button.login-btn")).click();
		//new Select(driver.findElement(By.id("member-text")));
		//select.selectByIndex(1);
		//select.selectByVisibleText("Log in");
	}
	public void logOut()
	{
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body.sticky-header")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}
