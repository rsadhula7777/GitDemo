package Missalaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();
		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responseCode = con.getResponseCode();
			System.out.println(responseCode);
			
			a.assertTrue(responseCode<400, "The link with text"+link.getText()+"is broken with code" +responseCode);
			
			}
		a.assertAll();
		}
		// 1.Get all the urls tied up to the links using selenium
		// 2.Java methods will call urls and gets the status codes

		// if status code > 400 - URL is broken

		// a[href*="soapui"]

	}


