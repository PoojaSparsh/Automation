package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
WebDriver d=new ChromeDriver();
d.get("https://rahulshettyacademy.com/dropdownsPractise/");
d.manage().window().maximize();
Thread.sleep(1000);

WebElement calender=d.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));

calender.click();

//for the month of october
List<WebElement>c=d.findElements(By.xpath("//a[@class='ui-state-default']"));

for(int i=0;i<c.size();i++)
{
	if(c.get(i).getText().equalsIgnoreCase("20"))
			{ c.get(i).click();
}
	}



//november month
/*List<WebElement>n=d.findElements(By.xpath("//a[@class='ui-state-default']"));

for(int i=0;i<n.size();i++)
{
	if(n.get(i).getText().equalsIgnoreCase("10"))
			{ n.get(i).click();
			Thread.sleep(1000);
}
	}*/


//using for each loop
/*for(WebElement k:n)
{
	if(k.getText().equalsIgnoreCase("10"))
	{
		k.click();
		break;
	}
}*/



}
}