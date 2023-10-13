package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

Thread.sleep(2000);

driver.manage().window().maximize();

WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));

from.click();

WebElement bengaluru=driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));

bengaluru.click();

Thread.sleep(2000);

WebElement bhopal=driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[6]/a"));
bhopal.click();

//Thread.sleep(2000);


	}

}
