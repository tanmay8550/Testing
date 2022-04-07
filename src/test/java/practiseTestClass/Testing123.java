package practiseTestClass;

import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClassKite;
import PomClassesKite.KiteHomePage;
import PomClassesKite.KitePinPage;
import PomClassesKite.kiteLoginPage;

public class Testing123 extends BaseClassKite
{
	kiteLoginPage log ;
	KitePinPage Piin;
	KiteHomePage Home;
	@BeforeClass
	public void launchBrowser()
	{
		//we have to create and initialize the each pom class variable globally
		//for example if i have 3 pom classes then i have to create and initialize three
		//variable globally
		browserLaunch();
		log = new kiteLoginPage(driver);
		Piin=new KitePinPage(driver);
		Home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void login_to_app()
	{
//		log.EnterPasswordLoginPage();
	}
	
  @Test
  public void TC1() 
  {
  
  }
  
  @AfterMethod
  public void LogoutFromBrowser ()
  {
	Home.clickOnLogoutbutton();
  }
  
  @AfterClass
  public void close_browser()
  {
	  close_browser();
  }
}
