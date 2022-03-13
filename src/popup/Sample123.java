package popup;

public class Sample123 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);

}
