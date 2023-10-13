package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A {
	@BeforeClass
	public void pqr() {
		System.out.println("this code will execute before class");
	}
	
	@AfterClass
	public void abc() {
		System.out.println("this code will execute after class");
	}
	
	@Test
	public void xyz() {
		System.out.println("Hello!!!!!");
	}
	
	
}
