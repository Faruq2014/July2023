package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Date {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	@Test
	public void selectDateByVisibleText() {
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]")).click();
		
		WebElement month=driver.findElement(By.id("month"));
		Select dropdown= new Select(month);
		dropdown.selectByVisibleText("Nov");
		
	}
	
	@Test
	public void selectByIndex() {
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]")).click();
		WebElement birthDay=driver.findElement(By.name("birthday_day"));
		Select select = new Select(birthDay);
		select.selectByIndex(0);			
		
	}
	@Test
	public void selectByValue() {
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]")).click();
		WebElement birthYear=driver.findElement(By.id("year"));
		Select select = new Select(birthYear);
		select.selectByValue("1928");
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
