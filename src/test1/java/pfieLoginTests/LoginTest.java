package pfieLoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pfieLoginPages.LoginPageFactory;

public class LoginTest {
	
	WebDriver driver;

	@BeforeMethod
	public void openApp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	
	@Test
	public void validLoginTest() {
		LoginPageFactory lpf= new LoginPageFactory(driver);
		lpf.userName1("Aoyon");
	}

}
