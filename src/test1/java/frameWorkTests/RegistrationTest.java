package frameWorkTests;

import org.testng.annotations.Test;

import frameWorkPages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	RegistrationPage rp;
	
	@Test
	public void signUpTestForRahul() {
		rp= new RegistrationPage(driver);
		rp.createNewAccount();
		rp.firstNameField("Rahul");
		rp.lastNameField("Molla");
		rp.emailField("rm@ymail.com");
		rp.passwordField("hjkjk");
		rp.monthDropDownField(10);
		rp.dayDropDownField(22);
		rp.yearDropDownField("1982");
		rp.radioButton("male");
	}
	
	@Test
	public void signUpTestForIsrak() {
		rp= new RegistrationPage(driver);
		rp.createNewAccount();
		rp.firstNameField("Israk");
		rp.lastNameField("Molla");
		rp.emailField("rm@ymail.com");
		rp.passwordField("hjkjk");
		rp.monthDropDownField(10);
		rp.dayDropDownField(22);
		rp.yearDropDownField("1982");
		rp.radioButton("male");
	}
	
	

}
