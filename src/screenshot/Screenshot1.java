package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Configuration;

public class Screenshot1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.appURL);
		driver.manage().window().maximize();
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File f = new File("D:\\AUTOMATION TESTING\\Screenshot\\image1.jpg");
		 FileHandler.copy(source, f);
		 
		
	}

}
