package Missalaneous;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowserDeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	//	driver.manage().deleteCookieNamed("asdf");

		driver.get("https://www.path2usa.com/travel-companions");

	}

}
