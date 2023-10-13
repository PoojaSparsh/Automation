package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	
	public static void main(String[] args) throws InterruptedException {
 
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ssquareit.in/coursedetails.php?id=19");
 
		Thread.sleep(2000);
 
		driver.manage().window().maximize();
 
 Thread.sleep(2000);
 
 WebElement aboutus=driver.findElement(By.xpath("( //a[@href='about.php'])[1]"));
 
 aboutus.click();
 

 

	}

}

