package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
	//method 1(locating individual options separately	
	/*	WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		dropdown.click();
		
		WebElement o1=driver.findElement(By.xpath("//option[@value='option1']"));
		
		System.out.println(o1.isDisplayed());
		System.out.println(o1.isEnabled());
		System.out.println(o1.isSelected());
		
		o1.click();
		System.out.println(o1.isSelected());
		Thread.sleep(2000);

		
		WebElement o2=driver.findElement(By.xpath("//option[@value='option2']"));
		
		System.out.println(o2.isDisplayed());
		System.out.println(o2.isEnabled());
		System.out.println(o2.isSelected());
		
		o2.click();
		System.out.println(o2.isSelected());
		Thread.sleep(2000);


		WebElement o3=driver.findElement(By.xpath("//option[@value='option3']"));
		
		System.out.println(o3.isDisplayed());
		System.out.println(o3.isEnabled());
		System.out.println(o3.isSelected());
		
		o3.click();
		System.out.println(o3.isSelected());
		Thread.sleep(2000); */

//2nd method locating using find elements
		
	/* List<WebElement>a=driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
		
		for(int i=0;i<a.size();i++)
		{
			a.get(i).click();
			Thread.sleep(1000); */
	
//using for each loop
	/*	List<WebElement>a=driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
		
		for(WebElement k:a)
		{
			k.click();
			Thread.sleep(1000);
		} */
				
//using select class
		
	/*	WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
//with the help of select class
//create select class object and pass webelements in parenthesis
		
		Select s=new Select(dropdown);
		
//with the help of selectByIndex method
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
//with the help of text on webpage(by selectByVisibleText
		
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);
//with the help of value of value attribute by inspecting
		
		s.selectByValue("option3");
		Thread.sleep(2000);

//to retrieve all options using getOptions() method */
	
	List<WebElement>retrievealloptions=driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
	
	for(int i=0;i<retrievealloptions.size();i++)
	{System.out.println(retrievealloptions.get(i).getText());
		
	}

}
}