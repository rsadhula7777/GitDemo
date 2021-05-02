package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement drappoble = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(draggable, drappoble).build().perform();
		
		driver.switchTo().defaultContent();
		
		

	}

}
