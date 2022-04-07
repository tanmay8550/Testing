package PomClassesKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class kiteLoginPage 
{
//declaration
	@FindBy(id ="userid") private WebElement userIDLogin;
	@FindBy(id = "password") private WebElement paaswordLogin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath = "//span[contains(text(),'User ID should be ')]")private WebElement userIDErrorMsg;
	@FindBy(xpath = "//span[contains(text(),'Password should be ')]")private WebElement passwordErrorMsg;
	
	
//initialization
	public kiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Utilization	

	public void EnterUserIDLoginPage(String USERID) 
	{		
		userIDLogin.sendKeys(USERID);
	}

	public void EnterPasswordLoginPage(String PWD) 
	{	
		paaswordLogin.sendKeys(PWD);
	}
	
	public String getUserIDErrorMsg()
	{
		 String expectedUserIDErrorMsg = userIDErrorMsg.getText();
		 return expectedUserIDErrorMsg;
	}
	
	public String getPasswordErrorMsg()
	{
		String expectedPasswordErrorMsg = passwordErrorMsg.getText();
		return expectedPasswordErrorMsg;
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
		
	}

	
}
