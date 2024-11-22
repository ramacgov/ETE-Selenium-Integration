package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	private WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement MenuItem;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement LogOut;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    //Set user name in textbox

    public void setUserName(String strUserName){

    	username.sendKeys(strUserName);   	  
    }
    
  //Set user name in textbox

    public void setPassword(String strpassword){

    	pwd.sendKeys(strpassword);   	  
    }
    
    public void Clickbutton(){

    	loginbutton.click(); 	  
    }
    
    public void Menuclick(){

    	MenuItem.click(); 	  
    }
        
    public void Logout(){

    	LogOut.click(); 	  
    }
    
    
}
