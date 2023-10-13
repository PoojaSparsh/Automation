package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggDropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

Thread.sleep(2000);

driver.manage().window().maximize();

WebElement dropdown=driver.findElement(By.xpath("//input[@id='autosuggest']"));

dropdown.click();

Thread.sleep(2000);

dropdown.sendKeys("ind");

Thread.sleep(2000);

/*dropdown.sendKeys(Keys.ARROW_DOWN);

Thread.sleep(2000);

dropdown.sendKeys(Keys.ARROW_DOWN);


Thread.sleep(2000);

dropdown.sendKeys(Keys.ENTER);*/

//using findelements
List <WebElement> a=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	
for(int i=0;i<a.size();i++)
{
	if(a.get(i).getText().equalsIgnoreCase("india"))
	{
		a.get(i).click();
		
	} 
}

	}

}
