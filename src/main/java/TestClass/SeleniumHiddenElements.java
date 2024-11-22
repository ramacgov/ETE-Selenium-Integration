package TestClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumHiddenElements {
	
public static WebDriver driver;
	
	@Test
	   public void testCase1() throws InterruptedException {
	
	 WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   //Open application
	   
	   //ConfigFileReader CF=new ConfigFileReader();
	    	      	
	    driver.get("https://demo.opencart.com/en-gb?route=account/register");
	    driver.manage().window().maximize();
	    
	    List<WebElement> elements=driver.findElements(By.xpath("//form[@id='form-register']//label"));
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    
	    for(WebElement element:elements)
	    {
	    	
	    	String script="return window.getComputedStyle(arguments[0],'::before').getPropertyValue('content');";
	    	String content= js.executeScript(script,element).toString();
	    	System.out.println(content+element.getText());
}
}
}