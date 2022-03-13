package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",  "D:\\AUTOMATION TESTING\\chromedriver_win32\\chromedriver.exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Dec Batch");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789011");
	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	
	
}
}
