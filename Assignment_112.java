package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("email")).sendKeys("Dheeraj sai");
	       driver.findElement(By.name("pass")).sendKeys("Sai@123");
	       driver.findElement(By.name("login")).click();
	}

}
