package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_127_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.name("q")).sendKeys("chenn");
	       Thread.sleep(3000);
	       List<WebElement>   sk=   driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));//one way to find auto suggesttion instead we can use another way
	    int count= sk.size();
	    System.out.println(count);
	       //Thread.sleep(3000);
          //sk.get(4).click(); 
	}

}
