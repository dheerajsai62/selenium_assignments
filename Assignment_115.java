package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_115 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.partialLinkText("Gm")).click();
	}

}
