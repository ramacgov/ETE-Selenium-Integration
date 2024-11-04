package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestClass {
	
	public static WebDriver driver;
	
	
	// test case 1
	   @Test
	   public void testCase1() {
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		   //Open application
		    driver.get("https://www.saucedemo.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    driver.findElement(By.id("login-button")).click();
		    //Thread.sleep(5000);
		    driver.findElement(By.id("react-burger-menu-btn")).click();
		    driver.findElement(By.id("logout_sidebar_link")).click();
		    //Thread.sleep(5000);
		    driver.quit();
	   }
	

}
