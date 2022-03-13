package listbox1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.vel.config.Configuration;

public class Custom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Actions acts=new Actions(driver);
		
		acts.moveToElement(day).perform();
		Thread.sleep(2000);
		acts.click().perform();
		Thread.sleep(2000);
		for(int i=0; i<=13; i++){
		acts.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
	}
		acts.sendKeys(Keys.ENTER).perform();
	
	for(int i=0; i<=9; i++) {
		acts.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
	}
	acts.sendKeys(Keys.ENTER).perform();
	
	

	}
}
