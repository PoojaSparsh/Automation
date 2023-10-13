package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ssquareit {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.ssquareit.in/about.php#");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement jobs= d.findElement(By.xpath("//a[@href='jobs.php']"));
		
		jobs.click();
		
		
		
	}

}
