package signUpPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.XPATH, using = "//a[starts-with(@id,'u_0_0_')]")
	private WebElement newAccount;

	public void createNewAccount() {
		newAccount.click();
	}

	@FindBy(how = How.NAME, using = "firstname")
	private WebElement firstName;

	public WebElement firstNameField(String enterFirstName) {
		firstName.sendKeys(enterFirstName);
		return firstName;
	}

}
