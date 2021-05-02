package TestBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class DropDownSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(staticDropDown);
	
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());;
	dropdown.selectByVisibleText("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());;
	dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());;
	}

}
