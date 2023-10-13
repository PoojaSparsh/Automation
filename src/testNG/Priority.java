package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	
	@Test (priority='y')
	public void verifyLogin()
	{
		System.out.println("This code is to verify login");
	}
	
	
	@Test (priority='x')
	public void launchUrl()
	{
		System.out.println("Code to Launch Url");
	}

	
	@Test (priority='z')
	public void close()
	{
		System.out.println("close");
	} 
	
	
	/*@Test 
	public void close()
	{
		System.out.println("This code is to verify login");
	}
	
	
	@Test
	public void closer()
	{
		System.out.println("Code to Launch Url");
	}*/

	
	

}
