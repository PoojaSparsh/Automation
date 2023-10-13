package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement UN=driver.findElement(By.name("username"));
		
		UN.click();
		
		UN.sendKeys("Pooja123");
		
		Thread.sleep(3000);

		
		WebElement Pwd=driver.findElement(By.name("password"));
		
		Pwd.click();
		
		Pwd.sendKeys("Pooja123");
		
		Thread.sleep(3000);

		WebElement LN=driver.findElement(By.tagName("button"));
		
		Thread.sleep(3000);

		LN.click();
		
		Thread.sleep(3000);

		driver.close();
		
		
	}

}
