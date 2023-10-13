package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=Vvvg-pfZt6E");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Play=driver.findElement(By.xpath("//div[@id='player']"));
		
		Play.click();
		
		

	}

}
