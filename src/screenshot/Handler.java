package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Configuration;

public class Handler {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.appURL);
		driver.manage().window().maximize();
		
		//source file
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Date date = new Date();
		 System.out.println(date);
		 
		 String filename = date.toString().replace(":","-");
		 //destination file
		  File f = new File(Configuration.screenshotPath+filename+".jpg");
		  FileHandler.copy(source, f);
		 
	}

}
