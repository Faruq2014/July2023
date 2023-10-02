package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperMethodForScreenShot {
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
 	public void userName() {
 		WebElement user=driver.findElement(By.id("email"));
 		webElementScreenShot(user, "user");
 		
 	}
 	
	@Test
 	public void facebookTest() {
 		
		screenShot("facebooktest");
 		
 	}
	
	public void webElementScreenShot(WebElement user, String screenShotName) {
		File SrcFile=user.getScreenshotAs(OutputType.FILE);
		long time=System.currentTimeMillis();
		String fileWithPath="screenShot/"+time+screenShotName+".png";
		File DestFile=new File(fileWithPath);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
	public void screenShot(String screenShotName) {
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		long time=System.currentTimeMillis();
		String fileWithPath="screenShot/"+time+screenShotName+".png";	
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
	
}
