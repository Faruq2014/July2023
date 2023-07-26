package loginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void positiveLoginTest() {
		driver.findElement(By.id("email")).sendKeys("sujr234@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("suman123");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test(priority=1)
	public void negativeLoginTest() {
		driver.findElement(By.id("email")).sendKeys("asma234@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("suman123");
		driver.findElement(By.name("login")).click();
		
	}
	@Test(priority=1)
	public void negativeUserNameLoginTest() {
		driver.findElement(By.id("email")).sendKeys("dipy234@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("suman123");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterTest
  public void closeApplication() {
	driver.quit();
}
	
	
}
