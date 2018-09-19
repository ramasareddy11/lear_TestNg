package testNg_Packages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Test implements ITestListener {
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println(" failure message from onTestFailure method");
		System.out.println(" method name is "+ Result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stubsys
		
		System.out.println("Test started");
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
