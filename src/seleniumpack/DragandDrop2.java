package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html\r\n");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Washington=driver.findElement(By.xpath("//div[@id='box3']"));
		
		Thread.sleep(3000);
		
		WebElement US=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(3000);

		a.dragAndDrop(Washington, US).build().perform();
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		
		Thread.sleep(3000);
		
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Thread.sleep(3000);

		a.dragAndDrop(rome, italy).build().perform();
		
		

		
		
		
		
	}

}
