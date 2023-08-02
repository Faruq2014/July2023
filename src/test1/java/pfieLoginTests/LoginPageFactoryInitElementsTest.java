package pfieLoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pfieLoginPages.LoginPageFactoryInitElements;

public class LoginPageFactoryInitElementsTest {
	WebDriver driver;

	  @BeforeMethod
			public void init() {
				
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

			}
  
  @Test
  public void validLoginTest() {
	  LoginPageFactoryInitElements lpf= new LoginPageFactoryInitElements(driver); 
	  lpf.userName("Ishrak");
	  lpf.enterPassword("ulkj");
	  lpf.clickLoginButton();
  }
}
