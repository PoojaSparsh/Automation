package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpathexbyvarsha {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		
		search.click();
		
		search.sendKeys("om sai ram");
		
		Thread.sleep(2000);
		
		search.submit();
		Thread.sleep(2000);
		
		WebElement Firstvdo=driver.findElement(By.cssSelector("div[class='style-scope ytd-video-renderer']"));
		
		Firstvdo.click();
		
		
		
	}

}
