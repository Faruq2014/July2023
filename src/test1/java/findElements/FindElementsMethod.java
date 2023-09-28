package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod {
	WebDriver driver;
	@BeforeTest
	public void openApp() {
       WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	
	@Test
	public void findElementsWithEnhanceLoop() {
		List<WebElement> languageList=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
		System.out.println("How many language : "+languageList.size());
		
		//for each or enhance loop
		for (WebElement webElement : languageList) {
			System.out.println(webElement.getText());
			
		}
	}
}
