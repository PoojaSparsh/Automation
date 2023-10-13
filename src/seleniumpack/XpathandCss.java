package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCss {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement UN=driver.findElement(By.xpath("//input[@name=\"username\"]"));

UN.click();

UN.sendKeys("Pooja123");

WebElement PW=driver.findElement(By.xpath("//input[@type=\"password\"]"));

PW.click();

PW.sendKeys("PoojaSparsh");

Thread.sleep(2000);

WebElement Login=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

Login.click();

Thread.sleep(2000);

driver.close(); 

	
		
	}

}
