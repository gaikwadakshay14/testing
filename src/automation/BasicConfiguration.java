package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicConfiguration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
}
