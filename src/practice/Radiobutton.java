package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		List<WebElement> a=driver.findElements(By.xpath("(//input[@type='radio'])"));
		
		/*for(int i=0;i<a.size();i++)
		{
			
			System.out.println(a.get(i).isDisplayed());
			
			System.out.println(a.get(i).isEnabled());
			
			System.out.println(a.get(i).isSelected());

			a.get(i).click();
			Thread.sleep(2000);

			}*/
		
		for(WebElement k:a)
			
		{
			k.click();
			Thread.sleep(2000);

		}
	}

}
