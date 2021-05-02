package TestBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTravelWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")){
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		//April 27
		//Grab the common attribute - put it into list & Iterate
		List<WebElement> days=driver.findElements(By.cssSelector(".day"));
        for(int i=0;i<days.size();i++){
        	
        	String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
        	
        	if(text.equalsIgnoreCase("7")){
        		
        		driver.findElements(By.cssSelector(".day")).get(i).click();
        		break;
        	}}
	}

}
