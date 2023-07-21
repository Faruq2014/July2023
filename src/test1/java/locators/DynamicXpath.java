package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicXpath {
WebDriver driver;
@BeforeMethod
public void setUp() {

	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

}


@Test(invocationCount=3, priority=0)
// what is the difference 
public void dynamicXpath1() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jjjj@hhmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hjjh");
	driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
}
@Test(priority=1)
 
public void dynamicXpath2() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jjjj@hhmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hjjh");
	driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
}
@Test(priority=2)

public void dynamicXpath3() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jjjj@hhmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hjjh");
	driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
}
@AfterMethod
public void closeApplication() {
	if (driver != null) {
		driver.quit();
	}
}


}
