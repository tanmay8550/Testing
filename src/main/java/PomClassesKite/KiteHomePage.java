package PomClassesKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	String ActuallUserIDHomePage;
//declaration
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userIDHomePage;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
//initialization
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Utilization
	public String getActuallUserIdHomePage()
	{
		ActuallUserIDHomePage = userIDHomePage.getText();
		return ActuallUserIDHomePage;
	}
	
	public void clickOnLogoutbutton()
	{
		userIDHomePage.click();
		logoutButton.click();
	}
}
