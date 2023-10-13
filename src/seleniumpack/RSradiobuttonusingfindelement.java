package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSradiobuttonusingfindelement {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.manage().window().maximize();

Thread.sleep(2000);

WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='radio1']"));

radiobutton1.click();

System.out.println(radiobutton1.isDisplayed());

Thread.sleep(2000);


System.out.println(radiobutton1.isEnabled());


Thread.sleep(2000);

System.out.println(radiobutton1.isSelected());

Thread.sleep(2000);

WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='radio2']"));

radiobutton2.click();

System.out.println(radiobutton2.isDisplayed());

Thread.sleep(2000);


System.out.println(radiobutton2.isEnabled());
Thread.sleep(2000);


System.out.println(radiobutton2.isSelected());
Thread.sleep(2000);


WebElement radiobutton3=driver.findElement(By.xpath("//input[@value='radio3']"));


radiobutton3.click();

System.out.println(radiobutton3.isDisplayed());
Thread.sleep(2000);

System.out.println(radiobutton3.isEnabled());
Thread.sleep(2000);


System.out.println(radiobutton3.isSelected());
Thread.sleep(2000);





	}

}

