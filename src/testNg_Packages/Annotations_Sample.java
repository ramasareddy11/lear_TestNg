package testNg_Packages;

import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListener.class)

public class Annotations_Sample {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass sample : target script");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod : main script");
	}
	
	@Test(groups= {"Annotations_Sample"})
	public void test1()
	{
		System.out.println("test1 : need to open test");
		
	}
	
	/*@Test
	public void tets2()
	{
		System.out.println("test2 : need to open test");
	}*/
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("aftermethod : need to clear all");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterclass : signout from the app");
	}
}
