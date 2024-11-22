package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumAlerts {

	public static WebDriver driver;
	
	@Test
	   public void testCase1() throws InterruptedException {
	
	 WebDriverManager.firefoxdriver().setup();
	   //driver = new FirefoxDriver();
	   //Open application
	   
	   //ConfigFileReader CF=new ConfigFileReader();
	    	      	
	    //driver.get("https://testautomationpractice.blogspot.com/");
	   // driver.manage().window().maximize();
	    
	   // driver.findElement(By.id("alertBtn")).click();
	   // Thread.sleep(3000);
	    
	    // Approach #1- switchto method
	    //Alert alert=driver.switchTo().alert();
	    //alert.accept();
	    
	    //Approach #2-Explicit wait
	   // WebDriverWait WW=new WebDriverWait(driver,Duration.ofSeconds(3000));
	    //Alert al=WW.until(ExpectedConditions.alertIsPresent());
	    //al.accept();
	    
	    //Approach #2-Javascript Executor
	   /* JavascriptExecutor js =(JavascriptExecutor)driver;
	    try
	    {
	    	js.executeScript("window.alert=function()");
	    }
	    catch(Exception e)
	    {
	    	
	    }*/
	    
	    
	    FirefoxOptions options = new FirefoxOptions();
        options.setImplicitWaitTimeout(Duration.ofSeconds(10));
        options.addArguments("start-maximized");
        driver = new FirefoxDriver(options);
        //ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
 
        //Click on button to open Confirmation Box
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
 
        // accepting javascript alert
        Alert ConfirmationAlert = driver.switchTo().alert();
        String alertText = ConfirmationAlert.getText();
        System.out.println("Alert text is :" + alertText);
        ConfirmationAlert.accept();
 
        //Close the page
        driver.quit();
	    
	   
	    
	   
	}

	private void WebDriverWait(WebDriver driver2, Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}
	
}
