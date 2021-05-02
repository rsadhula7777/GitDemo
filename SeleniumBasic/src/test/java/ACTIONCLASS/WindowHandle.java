package ACTIONCLASS;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String>windowId=driver.getWindowHandles();
		System.out.println(windowId.size());
		//driver.switchTo().window(nameOrHandle)
		Iterator<String>itr=windowId.iterator();
		
		String parentWindow=itr.next();
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emaild=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emaild);
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("username")).sendKeys(emaild);
		
		
		

	}

}
