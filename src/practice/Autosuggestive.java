package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
Thread.sleep(1000);


//simple method
WebElement country=driver.findElement(By.xpath("//input[@id='autosuggest']"));
country.click();
country.sendKeys("Ind");
Thread.sleep(1000);

//with the help of keyboard operations
/*country.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(1000);
country.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(1000);
country.sendKeys(Keys.ENTER);*/

//with the help of list

List<WebElement>a=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
for(int i=0;i<=2;i++)
{
	if(a.get(i).getText().equals("India"))
	{
		a.get(i).click();
	}
	
}

}}
