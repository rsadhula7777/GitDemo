package ECommerce;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductToCart {
	
	public static void addItemsToCart(WebDriver driver, String veggies[]) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedProductName = name[0].trim();

			// Check whether name you extracted is present in array or not

			// Convert array to array list

			List itemsNeeded = Arrays.asList(veggies);

			if (itemsNeeded.contains(formattedProductName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 3)
					break;

			}
		}

	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		
		String veggies[] = { "Cucumber", "Brocolli", "Beetroot" };
		
		addItemsToCart(driver,veggies);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("promoBtn"))));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());

	}

}
