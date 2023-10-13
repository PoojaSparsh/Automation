package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(3000);

		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(3000);
		
		//method 1
		
		/*a.clickAndHold(drag).build().perform();
		
		a.moveToElement(drop).build().perform();
		
		a.release(drop).build().perform();*/

		//method 2
		
		//a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		//method 3
		
		a.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
