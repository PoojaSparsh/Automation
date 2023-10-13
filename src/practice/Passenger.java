package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passenger {

	public static void main(String[] args) throws InterruptedException {
WebDriver d=new ChromeDriver();
d.get("https://rahulshettyacademy.com/dropdownsPractise/");
d.manage().window().maximize();
Thread.sleep(2000);

WebElement dwnarrow=d.findElement(By.xpath("//div[@id='divpaxinfo']"));

dwnarrow.click();
Thread.sleep(2000);

WebElement adultplus=d.findElement(By.xpath("//span[@id='hrefIncAdt']"));
Thread.sleep(2000);

for(int i=0;i<8;i++)
{
	adultplus.click();
	Thread.sleep(2000);

}


WebElement adultminus=d.findElement(By.xpath("//span[@id='hrefDecAdt']"));
Thread.sleep(2000);

for(int i=0;i<8;i++)
{
	adultminus.click();
	Thread.sleep(2000);

}

WebElement childplus=d.findElement(By.xpath("//span[@id='hrefIncChd']"));

for(int i=0;i<4;i++)
{
	childplus.click();
	Thread.sleep(2000);

}

WebElement childminus=d.findElement(By.xpath("//span[@id='hrefDecChd']"));

for(int i=0;i<4;i++)
{
	childminus.click();
	Thread.sleep(2000);

}

WebElement infantplus=d.findElement(By.xpath("//span[@id='hrefIncInf']"));

for(int i=0;i<4;i++)
{
	infantplus.click();
	Thread.sleep(2000);

}



WebElement infantminus=d.findElement(By.xpath("//span[@id='hrefDecInf']"));

for(int i=0;i<4;i++)
{
	infantminus.click();
	Thread.sleep(2000);

}

WebElement done=d.findElement(By.xpath("//input[@id='btnclosepaxoption']"));

done.click();
	
	}

}
