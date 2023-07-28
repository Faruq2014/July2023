package pomLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void userName(String enterUseName) {

		driver.findElement(By.id("email")).sendKeys(enterUseName);
	}

	public void password(String enterPassword) {

		driver.findElement(By.id("pass")).sendKeys(enterPassword);
	}

}
