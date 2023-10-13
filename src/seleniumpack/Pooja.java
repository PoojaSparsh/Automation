package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pooja {

	public static void main(String[] args) throws InterruptedException {
		
	
WebDriver driver=new ChromeDriver();
	driver.get("https://ssquareit.in/");   //to launch the browser
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.manage().window().minimize();
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl()); 

	
	driver.navigate().to("https://www.facebook.com/");
	
	Thread.sleep(3000);

	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	
	driver.navigate().back();
	
	Thread.sleep(3000);

	
	System.out.println("done");
	
	driver.navigate().forward();
	
	Thread.sleep(3000);

	
	driver.navigate().to("https://ssquareit.in/");
	
	
	Thread.sleep(3000);

	
	driver.close();
	
	}
	

}
