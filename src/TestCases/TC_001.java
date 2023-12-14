package TestCases;

import org.junit.Test;

import Base.DriverInstance;
import Pages.LoginPage;

public class TC_001 extends DriverInstance {

	@Test
	public void loginCheck () throws Exception {
		
	LoginPage login = new LoginPage(driver);
	login.enterUserName("usname");
	login.enterPassword("pass");
	login.clickGo();
			
		
	}
}
