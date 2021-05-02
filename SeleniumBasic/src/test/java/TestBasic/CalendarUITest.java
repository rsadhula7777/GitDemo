package TestBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUITest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		//.ui-state-default.ui-state-highlight.ui-state-active
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
