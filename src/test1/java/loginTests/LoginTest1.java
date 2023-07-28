package loginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomLoginPages.LoginPage;

public class LoginTest1 {
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
		LoginPage lp = new LoginPage(driver);
		lp.userName("rahul123");
		lp.password("hdfh");

	}

	@Test
	public void invalidLoginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.userName("Momumita123");
		lp.password("lljl;");
	}

	@Test
	public void boundaryLoginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.userName("Momumita123456789434");
		lp.password("lljl;");
	}

	@AfterMethod
	public void closeApplication() {
		if (driver != null) {
			driver.quit();
		}
	}

}
