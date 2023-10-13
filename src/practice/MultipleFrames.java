package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html"); 
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame1);
		
		System.out.println("Enter into frame1");

		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		Thread.sleep(3000);

		dropdown.click();
		
		//to bring the control back to main page
		driver.switchTo().defaultContent();
		
		//to enter into 2nd frame
		WebElement frame2=driver.findElement(By.xpath("//*[@id=\"frm2\"]"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame2);
		
		WebElement basicControl=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		
		basicControl.click();

		
		
	}

}
