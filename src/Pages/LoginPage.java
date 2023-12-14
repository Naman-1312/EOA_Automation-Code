package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import Base.DriverInstance;
import Resources.Utility;

public class LoginPage  {

	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver Value = " + driver );
		System.out.println("Driver Value = " + this.driver );
	}
	public void enterUserName (String uname) throws Exception {
		driver.findElement(By.xpath(Utility.elementLocator("login_username_xpath"))).sendKeys(uname);
				
	}
	
	public void enterPassword (String pass) throws Exception {
		driver.findElement(By.xpath(Utility.elementLocator("login_password_xpath"))).sendKeys(pass);
	}
	
	public void clickGo () throws Exception {
		driver.findElement(By.xpath(Utility.elementLocator("login_signup_xpath"))).click();
	}
}
