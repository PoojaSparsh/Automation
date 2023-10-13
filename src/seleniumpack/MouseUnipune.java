package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseUnipune {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.unipune.ac.in/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions p=new Actions(driver);
		
		WebElement Home=driver.findElement(By.xpath("//span[@id='stUI3_txt']"));
		
		Thread.sleep(3000);

		p.moveToElement(Home).build().perform();
		
		Thread.sleep(2000);
		
		WebElement About=driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		
		p.moveToElement(About).build().perform();
		
		Thread.sleep(2000);
		
		WebElement Academics=driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
		
		p.moveToElement(Academics).build().perform();
		
		Thread.sleep(2000);
		
		WebElement Research=driver.findElement(By.xpath("//span[@id='stUI184_txt']"));
		
		p.moveToElement(Research).build().perform();
		
		Thread.sleep(2000);
		
		WebElement Administration=driver.findElement(By.xpath("//span[@id='stUI194_txt']"));
		
		p.moveToElement(Administration).build().perform();
		
		Thread.sleep(2000);

		WebElement BOD=driver.findElement(By.xpath("//span[@id='stUI215_txt']"));
		
		p.moveToElement(BOD).build().perform();
		
		Thread.sleep(2000);
		
		WebElement studentscorner=driver.findElement(By.xpath("//span[@id='stUI229_txt']"));
		
		p.moveToElement(studentscorner).build().perform();
		
		Thread.sleep(2000);
		
		WebElement UsefulLinks=driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
		
		p.moveToElement(UsefulLinks).build().perform();
		
		Thread.sleep(2000);

		WebElement Elearning=driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
		
		p.moveToElement(Elearning).build().perform();

		Thread.sleep(2000);

		
		

		
		
	}

}
