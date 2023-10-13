package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B {
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This method will execute before core code");
	}

	
	@Test
	public void M1()
	{
		System.out.println("This is core code which performs perticular action");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This method will execute after core code");
	}
}
