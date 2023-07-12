package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class QuitAndClose {

	WebDriver driver;	
@Test
public void openApplication() {	
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.close();
}

@Test
public void openApplicationWithEdgeDriver() {	
	  driver= new EdgeDriver(); 
	 driver.get("https://www.facebook.com/");
	 driver.quit();
	 //close will close current window
	 // quit will kill the browser 
	 
}


}
