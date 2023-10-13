package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ColourSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		
		
		WebElement Red=driver.findElement(By.xpath("//span[@tabindex='0']"));
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		//operation by click and hold methhod
		//a.clickAndHold(Red).build().perform();
		//a.moveByOffset(50, 0).build().perform();

		//operation by drag and drop method
		a.dragAndDropBy(Red, -230, 0).build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDropBy(Red, 90, 0).build().perform();

		a.release().build().perform();
		
		Thread.sleep(2000);

		
		WebElement green=driver.findElement(By.xpath("//div[@id='green']/span")); //here i have taken parent child xpath
		
		a.clickAndHold(green).moveByOffset(-150, 0).build().perform();
		
		a.dragAndDropBy(green, 130, 0).build().perform();
		
		Thread.sleep(2000);
		
		
		
		WebElement blue=driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		
		a.clickAndHold(blue).moveByOffset(-50, 0).build().perform();
		
		a.dragAndDropBy(blue, 100, 0).build().perform();
		
		
		driver.close();

		
		
	
	}

}
