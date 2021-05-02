package TestBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksCountInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\\
		//1.Links Count
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(driver.findElements(By.tagName("a")).size());
	//2.Links Count of Footer Section
	WebElement footer=driver.findElement(By.id("gf-BIG"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	//3.Subsection sLinks Count of Footer Section
	WebElement ColDriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(ColDriver.findElements(By.tagName("a")).size());
	
	//4.Click each link on the col & verify page is opening
	
	for(int i=1;i<ColDriver.findElements(By.tagName("a")).size();i++){
		
		String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		ColDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		Thread.sleep(5000);
	}
		//Has next tells whether next index is present or not
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
	
		while(it.hasNext()){
			//it next - new window id
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
	
	

	

}
