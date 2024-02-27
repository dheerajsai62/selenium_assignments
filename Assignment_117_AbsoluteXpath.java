package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117_AbsoluteXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("file:///E:/learningHTML1.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("dheeraj");	}

}
