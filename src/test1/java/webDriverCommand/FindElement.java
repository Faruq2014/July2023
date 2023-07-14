package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement {
	WebDriver driver;
	@Test
	public void findElement() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//what is find element method
		driver.findElement(By.id("email")).sendKeys("hh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jkj123");
		driver.findElement(By.name("login")).click();
	}

}
