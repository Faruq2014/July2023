package webDriverCommand;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement {
	//what is SearchContext interface
	/* the root interface of selenium
	 * it has two methods 
	 * 
	 */
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
	
	
	@Test
	public void findElements() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//what is find element method
		 WebElement element = driver.findElement(By.id("pageFooterChildren"));

         // Get all the elements available with tag name 'p'
         List<WebElement> elements = element.findElements(By.tagName("li"));
         System.out.println("how many elements== "+elements.size());
         for (WebElement e : elements) {
             System.out.println(e.getText());
	}

}
	
	@Test
	public void findListOfLanguage() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//what is the data type of find elements method=WebElement
		WebElement language=driver.findElement(By.id("pageFooter"));
		List<WebElement> childLanguage=language.findElements(By.tagName("li"));
          System.out.println("language list = " +childLanguage.size());
          
      for (WebElement i : childLanguage) {
		System.out.println(i.getText());
	}
		
	}
}
