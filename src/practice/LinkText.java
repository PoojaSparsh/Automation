package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
	 
			Thread.sleep(2000);
	 
			driver.manage().window().maximize();
	 
			Thread.sleep(2000);
			
			WebElement link=driver.findElement(By.linkText("Forgot Your Password?"));
	
			System.out.println(link.isDisplayed());
			System.out.println(link.isEnabled());
			//System.out.println(link.isSelected()); //this method is applicable for radio and check box
			
			Thread.sleep(2000);

			link.click();
			
			Thread.sleep(2000);

			//System.out.println(link.isDisplayed());
			//System.out.println(link.isEnabled());
			

			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);

			WebElement link2=driver.findElement(By.partialLinkText("Use"));
	
			link2.click();
	}
}
