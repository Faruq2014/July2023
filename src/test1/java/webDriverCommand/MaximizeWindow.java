package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MaximizeWindow {
	//open application
	//click on login button
	WebDriver driver;
	@Test
	public void openAppAndMaximize() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//how do you maximize a window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		
		driver.manage().window().maximize();
		
	}

}
