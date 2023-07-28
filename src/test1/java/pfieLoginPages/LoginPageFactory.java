package pfieLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}

	public void userName1(String enterUseName) {

		driver.findElement(By.id("email")).sendKeys(enterUseName);
	}
}
