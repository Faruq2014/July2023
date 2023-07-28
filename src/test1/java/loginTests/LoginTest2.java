package loginTests;

import org.testng.annotations.Test;

import pomLoginPages.LoginPage;

public class LoginTest2 {
	
	@Test
	public void validLoginTest() {
		LoginTest1 lp1 = new LoginTest1();
		lp1.openApp();
		lp1.invalidLoginTest();
	}

	
	
}
