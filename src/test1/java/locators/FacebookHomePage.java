package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookHomePage {
	
	WebDriver driver;

	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("hh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jkj123");
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void listOfLanguage() {

		WebElement language = driver.findElement(By.id("pageFooter"));
		List<WebElement> childLanguage = language.findElements(By.tagName("li"));
		System.out.println("language list = " + childLanguage.size());

		for (WebElement i : childLanguage) {
			System.out.println(i.getText());
		}

	}

	@Test
	public void linkList() {

		WebElement element = driver.findElement(By.id("pageFooterChildren"));

		// Get all the elements available with tag name 'p'
		List<WebElement> elements = element.findElements(By.tagName("li"));
		System.out.println("how many elements== " + elements.size());
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}

	}
	
    @AfterTest
	public void closeApplication() {
    	if(driver !=null) {
    		driver.quit();
    	}
		
	}

}
