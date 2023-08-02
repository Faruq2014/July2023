package pfieLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryTwo {
	WebDriver driver;

	public LoginPageFactoryTwo(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}

	
	public void userName1(String enterUseName) {

		driver.findElement(By.id("email")).sendKeys(enterUseName);
	}
	
	@FindBy(how=How.ID, using="pass") private WebElement passWord;
	public void enterPassWord() {
		passWord.sendKeys("hello");
	}
}
