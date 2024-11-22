package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageClasses.LoginPageClass;
//import PageClasses.LoginPageClass;
import Utilities.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestClass {
	
	public static WebDriver driver;
	
	
	// test case 1
	   @Test
	   public void testCase1() throws InterruptedException {
		   
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		   //Open application
		   
		   ConfigFileReader CF=new ConfigFileReader();
		   
		   LoginPageClass LP= new LoginPageClass(driver);
		    
		   	driver.get(CF.getURL());
		    driver.manage().window().maximize();
		    
		    System.out.println(CF.getUsername());
		    
		    System.out.println(CF.getPassword());
		   
		        
		    LP.setUserName(CF.getUsername());
		    
		    Thread.sleep(3000);
		    LP.setPassword(CF.getPassword());
		    //driver.findElement(By.id("user-name")).sendKeys("standard_user");
		    Thread.sleep(3000);
		    //driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    //Thread.sleep(5000);
		    //driver.findElement(By.id("login-button")).click();
		    LP.Clickbutton();
		    Thread.sleep(3000);
		    LP.Menuclick();
		    Thread.sleep(3000);
		    LP.Logout();
		    //driver.findElement(By.id("")).click();
		    //driver.findElement(By.id("")).click();
		    //Thread.sleep(5000);
		    //driver.quit();*/
	   }
	

}
