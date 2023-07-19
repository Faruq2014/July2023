package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DirectLoctors {
WebDriver driver;
@BeforeTest
public void openApp() {

	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

}

@Test
public void linkText() {
	driver.findElement(By.linkText("Español")).click();
	//System.out.println(driver.findElement(By.linkText("Español")).getAttribute("title"));
	
}

@Test
public void partialLinkText() {
	driver.findElement(By.partialLinkText("Français")).click();
	//System.out.println(driver.findElement(By.partialLinkText("Français")).getAttribute("title"));
}

@AfterMethod
public void closeApplication() {
	if (driver != null) {
		driver.close();
	}
}
}
