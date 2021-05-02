package TestBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		/*
		 * for (WebElement option : options) {
		 * 
		 * System.out.println(option.getSize()); if
		 * (option.getText().equalsIgnoreCase("India")) {
		 * 
		 * option.click(); break; }
		 * 
		 * }
		 */

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("India")) {

				options.get(i).click();
				break;
			}
		}
	}

}
