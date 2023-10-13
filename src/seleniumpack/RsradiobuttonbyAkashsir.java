package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RsradiobuttonbyAkashsir {
	
	public static void main(String[]args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	

WebElement r1=driver.findElement(By.xpath("//input[@value='radio1']"));


WebElement r2=driver.findElement(By.xpath("//input[@value='radio2']"));
	
WebElement r3=driver.findElement(By.xpath("//input[@value='radio3']"));

System.out.println(r1.isDisplayed());
System.out.println(r2.isDisplayed());
System.out.println(r3.isDisplayed());

System.out.println(r1.isEnabled());
System.out.println(r2.isEnabled());
System.out.println(r3.isEnabled());


System.out.println(r1.isSelected());

System.out.println(r2.isSelected());

System.out.println(r3.isSelected());

r1.click();

Thread.sleep(2000);

r2.click();
Thread.sleep(2000);

r3.click();
Thread.sleep(2000);


	//using findElements method

/*List<WebElement> a=driver.findElements(By.xpath("//input[@name='radioButton']"));

 for(int i=0;i<a.size();i++)
{
	
	
	System.out.println(a.get(i).isDisplayed());
	
	System.out.println(a.get(i).isEnabled());
	
	System.out.println(a.get(i).isSelected());

	a.get(i).click();
	Thread.sleep(2000);*/

}




}
