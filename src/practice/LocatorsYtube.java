package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsYtube {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
 
		Thread.sleep(2000);
 
		driver.manage().window().maximize();
 
		Thread.sleep(2000);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
		
		searchBox.click();
		
		Thread.sleep(2000);

		searchBox.sendKeys("java");
		
		Thread.sleep(2000);

		searchBox.submit();
		
		WebElement vdo=driver.findElement(By.xpath("(//span[@id='video-title'])[3]"));
		
		Thread.sleep(2000);

		vdo.click();
		
		Thread.sleep(2000);

		
		System.out.println("Done");
	}

}
