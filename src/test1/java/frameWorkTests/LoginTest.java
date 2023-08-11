package frameWorkTests;

import org.testng.annotations.Test;

import frameWorkPages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage lp;
	
	@Test(priority=1)
	public void validLoginTest() {
		lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	
	
	@Test(priority=2)
	public void invalidLoginTest() {
	    lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	
	@Test(priority=3)
	public void boundaryLoginTest() {
		lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	

}
