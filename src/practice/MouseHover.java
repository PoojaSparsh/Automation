package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.manage().window().maximize();
		
		//To perform mouse related operations we need to create Actions class object
		
		Actions obj=new Actions(driver);
		
		WebElement mouse=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		obj.moveToElement(mouse);
		
		obj.build().perform();
		

		
		

		
	}

}
