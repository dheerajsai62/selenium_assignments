package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Assignment120_RemoveElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
				//EdgeDriver driver=new EdgeDriver();
			       driver.get("https://grotechminds.com/registration/");
			       driver.manage().window().maximize();
		WebElement removeelement = driver.findElement(By.id("fname"));
		removeelement.sendKeys("Dheerajsai");
		removeelement.sendKeys(Keys.CONTROL ,Keys.BACK_SPACE);
	
			   }

}
