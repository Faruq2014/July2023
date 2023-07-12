package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GetUrl {

	WebDriver driver; // this is an instance variable
	//WebDriver = data type
	//driver = variable name
@Test
public void openApplication() {
	// how to open a browser
	 driver = new ChromeDriver();
	 //new ChromeDriver() = implementing class for WebDriver
	
	 // WebDriver driver= new ChromeDriver();
	 //WebDriver is the interface
	 // driver is the name of the variable
	 // new is the constructor or key word to create object
	 //ChromeDriver() is the implementing class for WebDriver.
	 
	 
	 //how to open an application
	 driver.get("https://www.facebook.com/");
}

 @Test
public void openApplicationWithEdgeDriver() {
	
	  driver= new EdgeDriver(); 
	 driver.get("https://www.facebook.com/");
}


}
