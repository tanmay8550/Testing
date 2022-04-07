package BasePackageMMT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class BaseClassMMT 
{
	protected static WebDriver driver;
	public void browserLaunch()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanma\\OneDrive\\Desktop\\velocity 11 dec\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.manage().window().maximize();
	  Reporter.log("Browser succesfully Launched",true);
	}
	
	public void getScreenshot(String TCName) throws IOException
	 {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("D:\\Screenshot\\TC"+TCName+"MMTScreenshot.png");
		 FileHandler.copy(src,dest);
		 Reporter.log("Screenshot is taken for TC"+TCName,true);
	 }
	
	public void closingBrowser()
	{
		driver.close();
		Reporter.log("Browser succesfully Closed");
	}
}
