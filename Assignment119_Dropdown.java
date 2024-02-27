package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment119_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	  WebElement cat_dd_shoes=  driver.findElement(By.id("searchDropdownBox"));
			  //cat_dd_shoes.click();
	  Select s2= new Select(cat_dd_shoes);
	  Thread.sleep(4000);
	  s2.selectByIndex(11);
	}

}
