package pfieLoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pfieLoginPages.LoginPageFactory;
import pfieLoginPages.LoginPageFactoryTwo;

public class BaseTest {
	WebDriver driver;
	LoginPageFactory lpf;
	LoginPageFactoryTwo lpf2;

	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		lpf= new LoginPageFactory(driver);
        lpf2= new LoginPageFactoryTwo(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	
	@AfterTest
	public void closeApplication() {
		if(driver !=null) {
			driver.quit();
		}
	}

}
