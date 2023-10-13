package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
WebDriver d=new ChromeDriver();
d.get("https://www.amazon.com/");
Thread.sleep(10000);

d.manage().window().maximize();
Thread.sleep(2000);


WebElement line=d.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
line.click();

WebElement electronics=d.findElement(By.xpath("(//i[@class='nav-sprite hmenu-arrow-next'])[4]"));
Thread.sleep(2000);

		electronics.click();
	
WebElement cellphones=d.findElement(By.xpath("(//ul[@data-menu-id='5']/li/a)[5]"));
Thread.sleep(2000);


cellphones.sendKeys(Keys.ENTER);


		
	}

}
