package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathIndex {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@Test(priority = 0)
	// what is the difference
	public void xPathIndex() {
		driver.findElement(By.xpath("(//div[@id='pageFooterChildren']/ul/li)[6]")).click();
		//both of the xpath must be good
	}
	
	@Test(priority = 1)
	// what is the difference
	public void xPathIndex2() {
		driver.findElement(By.xpath("(//div[@id='pageFooter']/ul/li)[5]")).click();
		//both of the xpath must be good
	}

}
