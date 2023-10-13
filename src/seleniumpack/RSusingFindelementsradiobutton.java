package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSusingFindelementsradiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

Thread.sleep(2000);

driver.manage().window().maximize();


Thread.sleep(3000);

List<WebElement> a=driver.findElements(By.xpath("//input[@name='radioButton']"));

 for(int i=0;i<a.size();i++)
{
	a.get(i).click();
	Thread.sleep(2000);
}

	
}
}