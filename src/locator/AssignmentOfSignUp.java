package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOfSignUp {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",  "D:\\AUTOMATION TESTING\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshay");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gaikwad");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("444456666");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='submit']")).click();
	
	Thread.sleep(5000);
	driver.close();
}
}
