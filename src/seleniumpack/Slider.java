package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(frame);

		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Thread.sleep(2000);

		Actions a =new Actions(driver);
		
		a.clickAndHold(slider).build().perform();
		
		a.moveByOffset(50, 0).build().perform();
		
		a.release().build().perform();
		
		Thread.sleep(2000);

		//a.clickAndHold(slider).build().perform();
		
		
		//a.moveByOffset(-20, 0).build().perform();
		
		a.dragAndDropBy(slider, -30, 0).build().perform();
		
		driver.close();
		
		

	}

}
