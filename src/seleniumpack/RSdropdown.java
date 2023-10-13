package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RSdropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

Thread.sleep(2000);
driver.manage().window().maximize();

WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

dropdown.click();

WebElement option1=driver.findElement(By.xpath("//option[@value='option1']"));
option1.click();

Thread.sleep(2000);

WebElement option2=driver.findElement(By.xpath("//option[@value='option2']"));

option2.click();

Thread.sleep(2000);

WebElement option3=driver.findElement(By.xpath("//option[@value='option3'])"));

option3.click();
	}

}	

