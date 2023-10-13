package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//create object of action class 
		
		Actions a=new Actions(driver);
		
		WebElement MouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(2000);
		
		a.moveToElement(MouseHover).build().perform();
		
		Thread.sleep(2000);

		/*MouseHover.sendKeys(Keys.
		 * ARROW_DOWN);
		
		Thread.sleep(2000);
		
		MouseHover.sendKeys(Keys.ARROW_DOWN);

		MouseHover.sendKeys(Keys.ENTER);*/
		
		WebElement Top=driver.findElement(By.xpath("//a[@href='#top']"));

		Thread.sleep(2000);
		
		Top.click();
		
		Thread.sleep(2000);


		//WebElement Reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		
		//Reload.click();
		
		
		
	}

}
