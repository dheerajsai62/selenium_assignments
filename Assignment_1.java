package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement wr = driver.findElement(By.id("fname"));
		wr.sendKeys("Dheeraj");
		WebElement zr = driver.findElement(By.id("lname"));
		zr.sendKeys("sai");
		WebElement cr = driver.findElement(By.id("Username"));
		cr.sendKeys("dheerajsai224@gmail.com");
		WebElement kr = driver.findElement(By.id("password"));
		kr.sendKeys("Test@123");
		WebElement button = driver.findElement(By.id("Male"));
		button.click();
		WebElement Address = driver.findElement(By.id("Address"));
		Address.sendKeys("87-1342-venkatadrinagar-near nandyal check post kurnool");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("518002");
		WebElement sr = driver.findElement(By.id("w3review"));
		sr.sendKeys("87-1362-venkatadrinagar");
		WebElement uploadfile = driver.findElement(By.id("Resume"));
		uploadfile.sendKeys("C:\\Users\\dheeraj sai\\OneDrive\\Desktop");
		uploadfile.click();// How to upload file form grow tech minds registration form
	}

}
