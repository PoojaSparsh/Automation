package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {	
	
	
/**
 * @throws InterruptedException
 */
@Test

public void windowH() throws InterruptedException
{
WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

Thread.sleep(2000);

driver.manage().window().maximize();

Thread.sleep(2000);

System.out.println(driver.getWindowHandle());

WebElement window=driver.findElement(By.xpath("//button[@id='openwindow']"));

window.click();

System.out.println(driver.getCurrentUrl());


//we use a interface called set which stores the values saved in getwindowhandles method(remember list???)

Set<String> a=driver.getWindowHandles();

//here we use a interface(Iterator)and a method (iterator) 

Iterator<String> it=a.iterator();

String Parent_window=it.next();		//here rahulshetty webpage is parent

String child_window=it.next();		// qaacademy acts as child

//we know that we need to switch the control from parent to child so achieve this we need to mention a window 
//inside window(),to do this,we are declaring two variables as parent window and child window
driver.switchTo().window(child_window);

WebElement courses=driver.findElement(By.xpath("//a[@href='https://www.udemy.com/user/testing-minds/']"));

courses.click();

System.out.println(driver.getCurrentUrl());

driver.switchTo().window(Parent_window);

System.out.println(driver.getCurrentUrl());


}

}
