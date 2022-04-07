package TestClassKite;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BasePackage.BaseClassKite;
import PomClassesKite.KiteHomePage;
import PomClassesKite.kiteLoginPage;
import PomClassesKite.KitePinPage;
import UtlityPackage.Utility;

//@Listeners(listener.Listener.class)
public class KiteTestClass extends BaseClassKite 
{	
	kiteLoginPage login;
	KitePinPage Pin;
	KiteHomePage home;
	
	@BeforeClass
  public void launchBrowser() 
  {
	  browserLaunch();//base class method
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	  login=new kiteLoginPage(driver);
	  Pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
  }
  
  @BeforeMethod
  public void LoginToKiteApp() throws EncryptedDocumentException, IOException
  {
	 login.EnterUserIDLoginPage(Utility.readDataFromExcel("Sheet4", 0, 0));
	 login.EnterPasswordLoginPage(Utility.readDataFromExcel("Sheet4", 0, 1));
	 login.clickOnLoginButton();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	 
	 Pin.EnterPasswordPInPage(Utility.readDataFromExcel("Sheet4", 0, 2));
	 Pin.clickOnContinueButton();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
  }

  @Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException
  {
	  
	  String ActuallUserIDHomepage = home.getActuallUserIdHomePage();
	  String ExpectedUserIDHomepage=Utility.readDataFromExcel("Sheet4", 0, 5);
	  Assert.assertEquals(ActuallUserIDHomepage, ExpectedUserIDHomepage,"Actuall and expected Not Matching");
//	  Utility.getScreenshot(driver, TCID);
	  Reporter.log("The validaton of UserIDHomePage is succesfull",true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp()
  {
      home.clickOnLogoutbutton();
  }
  
  @AfterClass
  public void closingbrowser()
  {
	  closingBrowser();
  }
}
