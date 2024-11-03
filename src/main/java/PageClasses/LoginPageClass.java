package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	WebDriver driver;
	
	@FindBy(id="User-name")
	WebElement username;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    //Set user name in textbox

    public void setUserName(String strUserName){

    	username.sendKeys(strUserName);   	  
    }
}
