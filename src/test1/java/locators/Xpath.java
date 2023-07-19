package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath {
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test
	public void regularXpath() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jjjj@hhmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hjjh");
	}
	
	@Test
	public void goodNode() {
		String para=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println("h2 text is  "+para);
	}
	@Test
	public void goodNodeLink() {
		String linkText=driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[10]")).getText();
		System.out.println("h2 text is  "+linkText);
		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[10]")).click();
	}
	
	@AfterMethod
	public void closeApplication() {
		if (driver != null) {
			//driver.close();
		}
	}

}
