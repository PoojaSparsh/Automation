package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://jqueryui.com/selectable/"); 
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement frm1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		
		frm1.click();
		
		
	}

}


