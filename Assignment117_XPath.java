package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Assignment117_XPath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("file:///E:/learningHTML1.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//input[@value='Submit']")).click();
	       

	}

}
