package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Resources.Utility;

public class DriverInstance {
 public	WebDriver driver;
	
 @BeforeMethod
	public void intiateDriverInstance() throws IOException {
		if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
			driver = new ChromeDriver();
			System.out.println("Driver Instance Driver Value" + driver);
			 
		}
		else if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		driver.get(Utility.fetchProperty("applicationURL").toString());
	}
 @AfterMethod
	 public void closeDriverInstance() {
		 driver.quit();
	 }
}
