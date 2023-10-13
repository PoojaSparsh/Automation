
package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);

		
		WebElement Resize=driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
		
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(3000);

		a.dragAndDropBy(Resize, 250, 150).build().perform();
		
		a.release().build().perform();
		
		
	}

}
