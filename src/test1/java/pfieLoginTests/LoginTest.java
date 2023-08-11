package pfieLoginTests;

import org.testng.annotations.Test;

public class LoginTest extends ParentTest{
	
	//WebDriver driver;


	public void init() {
		//openApp();
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	
	@Test
	public void validLoginTest() {
		//LoginPageFactory lpf= new LoginPageFactory(driver);
		lpf.userName1("Aoyon");
		//lpf.enterPassWord();
	}
@Test
public void invalidLoginTest() {
	lpf2.enterPassWord();
}
}
