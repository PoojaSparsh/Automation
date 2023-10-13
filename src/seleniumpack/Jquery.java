package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://jqueryui.com/selectable/"); 
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//With the help of index
		
		//driver.switchTo().frame(0);
		
		//With the help of webelement
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(iframe);

		
		WebElement item=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		
				
		Thread.sleep(3000);

		item.click();
		
		WebElement item2=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		
		item2.click();
		
		//driver.switchTo().defaultContent();

	}

}