package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathAnd_XpathOr {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@Test(priority = 0)
	// what is the difference
	public void xPathAnd() {
		driver.findElement(By.xpath("//input[@name='email'and @id='email']")).sendKeys("jjjj@hhmail.com");
		//both of the xpath must be good
	}

	@Test(priority = 1)
	// what is the difference
	public void xPathOr() {

		driver.findElement(By.xpath("//input[@name='pass'or @id='pass456']")).sendKeys("hjjh");
		// @id='pass456'] is wrong xpath= one of the xpath must be good

	}

	@Test(priority = 3)
	// what is the difference
	public void xPathDouble() {

		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')][@name='login']")).click();
      //both of the xpath must be good
	}
	
	@AfterTest
	public void closeApplication() {
		if (driver != null) {
			driver.quit();
		}
	}
}
