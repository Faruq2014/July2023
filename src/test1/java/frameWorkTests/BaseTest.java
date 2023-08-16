package frameWorkTests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod(groups={"smoke","regression"})
	public WebDriver openApplication() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	return driver;
	}
	
	
   @AfterMethod(groups={"smoke","regression"})
	public void closeApplication() {
		if (driver !=null ) {
			driver.quit();
		}
	}

}
