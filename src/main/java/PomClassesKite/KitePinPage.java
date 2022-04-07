package PomClassesKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class KitePinPage 
{
	//declaration
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	//initialization
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void EnterPasswordPInPage(String Pin)
	{
		pin.sendKeys(Pin);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
		Reporter.log("Entering HomePage",true);
	}

	
}
