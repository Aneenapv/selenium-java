package testNG.mavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("browser opened");
	}
	
	@Test(invocationCount=2)
	public void testSomething()
	{
		System.out.println("test something");
	}
	
	@Test
	
	public void testAnything()
	{
		System.out.println("test anything");
	}
	
	
	@Test(enabled= false)
	public void testNothing()
	{
		
	}
	
	@org.testng.annotations.AfterMethod
	public void closeBrowser()
	{
		System.out.println("browser closed");
	}




}
