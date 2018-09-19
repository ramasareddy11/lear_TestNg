package testNg_Packages;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class ParameterTest 
{
	
	@Parameters({"firstname","lastname"})
	
	@Test
	public void test1(String f,String l)
	{
		System.out.println("firstname is  " +f+" lastname is "+l);
		assertEquals("name", f);
	}
}
