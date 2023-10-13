package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C {
		
	public static WebDriver driver;

	@BeforeMethod
	public void launchUrl() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void closeUrl()
	{
		driver.close();
	}
	
@Test
	public void scrollDownOperation() throws InterruptedException
	{
		WebElement mousehover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",mousehover);
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		//create obj for action class
		
		a.moveToElement(mousehover).build().perform();
		
		Thread.sleep(2000);

		//locate reload option and click operation on reload
		
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		
		Thread.sleep(2000);
		
		reload.click();

		
	}
}
