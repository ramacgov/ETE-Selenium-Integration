package TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAjaxCall {

	
public static WebDriver driver;
	
	@Test
	   public void testCase1() throws InterruptedException {
	
	 WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   //Open application
	   
	   //ConfigFileReader CF=new ConfigFileReader();
	    	      	
	    driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
	    driver.manage().window().maximize();
	    
	    
	  
	  /*WebElement Frameelement=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
  	  driver.switchTo().frame(Frameelement);*/
  	  driver.findElement(By.xpath("//button[@id='loadContent']")).click();
  	  
  	  WebDriverWait WW=new WebDriverWait(driver,Duration.ofSeconds(3000));
  	  WebElement LoadElement = WW.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
  	  System.out.println(LoadElement.getText());
  	  
  	  String str1= LoadElement.getText();
  	  String str2= "AJAX Content Loaded";
  	  
	  Assert.assertEquals(str1, str2); 
	  System.out.println("Equals Assertion is successful");
	    
	
	}
}
