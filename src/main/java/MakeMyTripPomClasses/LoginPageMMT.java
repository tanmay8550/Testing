package MakeMyTripPomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageMMT 
{
@FindBy(xpath = "//li[@data-cy='account']") private WebElement loginButton;
@FindBy(xpath = "//input[@id='username']") private WebElement userIdField;
@FindBy(xpath = "//span[text()='Continue']") private WebElement continueButton;
@FindBy(xpath = "//a[text()='or Login via Password']") private WebElement loginViaPasswordButton;
//@FindBy(xpath = "//a[text()='or Login via Password']") private WebElement loginViaPasswordButton;

}
