package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathFunctions {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@Test(priority = 0)
	
	public void xPathFunction() {
		WebElement h2Text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
		System.out.println(" header text  "+h2Text.getText());
		//both of the xpath must be good
	}
}
