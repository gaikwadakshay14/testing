package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBYtext {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver",  "D:\\AUTOMATION TESTING\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
