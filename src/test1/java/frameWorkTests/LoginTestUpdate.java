package frameWorkTests;

import org.testng.annotations.Test;

import frameWorkPages.LoginPage;

public class LoginTestUpdate extends BaseTest{
	LoginPage lp;
	
	@Test(priority=1, groups={"smoke","regression"})
	public void validLoginTest() {
		lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	
	
	@Test(priority=2,groups="regression")
	public void invalidLoginTest() {
	    lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	
	@Test(priority=3, groups="regression")
	public void boundaryLoginTest() {
		lp = new LoginPage(driver);
		lp.userName("Asma");
		lp.enterPassword("asma123");
		lp.clickLoginButton();
	}
	

}
