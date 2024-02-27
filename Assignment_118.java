package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_118 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
WebElement email=driver.findElement(By.id("email"));
email.sendKeys("Dheeraj sai");
email.sendKeys(Keys.CONTROL+"A");
email.sendKeys(Keys.CONTROL+"c");
WebElement password =driver.findElement(By.id("pass"));
password.sendKeys(Keys.CONTROL +"v");

	}

}
