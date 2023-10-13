package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickAcademyHW {
	
	public static WebDriver driver;
	@BeforeClass
	public void bc() throws InterruptedException {
driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	}		
		@Test
		public void ac()
		{
		WebElement openwindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
		
		openwindow.click();
		
		//WebElement access=driver.findElement(By.xpath("(//div[@class='button float-left']/a)"));
		
		//access.click();
		
		System.out.println(	driver.getCurrentUrl());
	
		System.out.println(	driver.getWindowHandle());
	
	}

		@AfterClass
		public void am() {
			
		driver.close();
		}
}
