package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));

		
		from.click();
		
		WebElement bengaluru=driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));
	
		bengaluru.click();
		
		Thread.sleep(2000);

	
		WebElement bhopal=driver.findElement(By.xpath("(//a[@text='Bhopal (BHO)'])[2]"));

		bhopal.click();
	
	}

}
