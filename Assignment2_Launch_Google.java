package selenium_assignments;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2_Launch_Google {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	}
}
