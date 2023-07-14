package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplcitWait {
WebDriver driver;
@Test
public void openApplication() {
	driver =new ChromeDriver();
	driver.get(null);
	driver.manage().window().maximize();
	//what is implicitlyWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
}
}
