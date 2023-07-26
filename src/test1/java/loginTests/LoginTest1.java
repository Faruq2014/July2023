package loginTests;

import loginPages.LoginPage;

public class LoginTest1 {
	
	
	public void validLoginTest() {
	LoginPage lp = new LoginPage();
	lp.userName("rahul123");
	lp.password("hdfh");
	
	}

	
	public void invalidLoginTest() {
		LoginPage lp = new LoginPage();
		lp.userName("Momumita123");
		lp.password("lljl;");
		}
	public void boundaryLoginTest() {
		LoginPage lp = new LoginPage();
		lp.userName("Momumita123456789434");
		lp.password("lljl;");
		}
	
}
