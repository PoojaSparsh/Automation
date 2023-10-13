package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		
		Thread.sleep(3000);
		
		
		username.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		
		username.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(2000);

		username.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		WebElement pwd=driver.findElement(By.name("password"));
		
		pwd.sendKeys(Keys.CONTROL+"v");

		Thread.sleep(2000);
		
		pwd.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(2000);

		pwd.sendKeys(Keys.CONTROL.DELETE);
		
		Thread.sleep(2000);

		pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		pwd.sendKeys(Keys.ENTER);

		
		
		

		
		
	}
	}

