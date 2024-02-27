package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_navigate_forward {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//it will lauch empty browser
		driver.navigate().to("https://www.google.com");
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
