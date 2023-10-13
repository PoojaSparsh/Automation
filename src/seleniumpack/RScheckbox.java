package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RScheckbox {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.manage().window().maximize();

Thread.sleep(2000);

WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

checkbox1.click();

//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

System.out.println(checkbox1.isDisplayed()); //to check its presence on webpage

Thread.sleep(2000);


System.out.println(checkbox1.isEnabled());  

Thread.sleep(2000); 

System.out.println(checkbox1.isSelected());  

Thread.sleep(2000);

//checkbox1.click();

WebElement checkbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));

//checkbox2.click();

System.out.println(checkbox2.isDisplayed());

Thread.sleep(2000);

System.out.println(checkbox2.isEnabled()); 

Thread.sleep(2000);

System.out.println(checkbox2.isSelected());  

checkbox2.click();

WebElement checkbox3=driver.findElement(By.cssSelector("input[id='checkBoxOption3']"));

checkbox3.click();

System.out.println(checkbox3.isDisplayed());

Thread.sleep(2000);


System.out.println(checkbox3.isEnabled()); 


Thread.sleep(2000);


System.out.println(checkbox3.isSelected()); 

Thread.sleep(2000);

checkbox3.click();



	}

}
