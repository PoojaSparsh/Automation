package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

Thread.sleep(3000);

driver.manage().window().maximize();

Thread.sleep(2000);

driver.manage().window().minimize();

Thread.sleep(2000);

driver.manage().window().maximize();

Thread.sleep(2000);


driver.navigate().to("https://ssquareit.in/");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());


Thread.sleep(2000);

driver.navigate().back();

Thread.sleep(2000);

driver.navigate().forward();

Thread.sleep(2000);

//driver.close();

driver.quit();
	}

}
