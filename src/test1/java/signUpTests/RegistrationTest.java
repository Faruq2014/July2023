package signUpTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import signUpPages.RegistrationPage;

public class RegistrationTest {
	WebDriver driver;

	@BeforeTest
	public void openApp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	
	@Test
	public void createNewAccount() {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.createNewAccount();
		rp.firstNameField("Asma");
		rp.lastNameField("Khan");
		rp.emailField("ak@kmail.com");
		rp.passwordField("ak1234");
		rp.monthDropDownField(10);
		rp.dayDropDownField(22);
		rp.yearDropDownField("1982");
		rp.radioButton("male");
		//rp.signupButton();
		
	}

}
