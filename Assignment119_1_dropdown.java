package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment119_1_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	       WebElement cat_ed_car=  driver.findElement(By.id("searchDropdownBox"));
               for(int i=0;i<=11; i++) {
            	   //Thread.sleep(3000);
            	   cat_ed_car.sendKeys(Keys.ARROW_DOWN);
               }
      WebElement   search_software=driver.findElement(By.id("twotabsearchtextbox"));
      search_software.sendKeys("car and motorbike care");
      search_software.sendKeys(Keys.ENTER);
	}

}
