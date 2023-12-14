package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DriverClass {

	public WebDriver driver;
	String baseUrl = "http://eoaadmin.onlinetestplatform.com/default.aspx" ; 
	
	@BeforeTest
	public void openBrowser() {
		
		driver = new ChromeDriver ();
		
	}	
}
