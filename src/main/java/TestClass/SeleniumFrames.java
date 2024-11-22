package TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFrames {
public static WebDriver driver;
	
	@Test
	   public void testCase1() throws InterruptedException {
	
	 WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   //Open application
	   
	   //ConfigFileReader CF=new ConfigFileReader();
	    	      	
	    driver.get("https://ui.vision/demo/webtest/frames/");
	    driver.manage().window().maximize();
	    
	    
	  
	  /*WebElement Frameelement=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
  	  driver.switchTo().frame(Frameelement);
  	  driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");*/
  	  
  	  WebDriverWait WW=new WebDriverWait(driver,Duration.ofSeconds(3000));
  	  WW.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_3.html']")));
  	  driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");  
	    
	   
	    
	
	}
}

	
