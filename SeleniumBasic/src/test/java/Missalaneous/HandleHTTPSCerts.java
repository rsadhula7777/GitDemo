package Missalaneous;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleHTTPSCerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ssl certs
		DesiredCapabilities ch =new  DesiredCapabilities();
		
		ch.acceptInsecureCerts();//1st way
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); // 2nd way
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//local browser
		ChromeOptions co = new ChromeOptions();
		co.merge(ch);
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(co);

		driver.get("https://www.path2usa.com/travel-companions");

	}

}
