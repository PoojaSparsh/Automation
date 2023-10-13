package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTab {
	
@Test
public void tabhandle() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	WebElement tab=driver.findElement(By.xpath("//a[@id='opentab']"));
	
	tab.click();
	
	System.out.println(driver.getWindowHandle());
	
	System.out.println(driver.getCurrentUrl());
	
	Set<String> a=driver.getWindowHandles();
	
	Iterator<String> it=a.iterator();
	
	String parent_window=it.next();
	
	String child_window=it.next();
	
	driver.switchTo().window(child_window);
	
	WebElement courses=driver.findElement(By.xpath("(//a[@href='https://www.udemy.com/user/testing-minds/'][1])"));
	
	courses.click();
	
	
	
	
	

}

}
