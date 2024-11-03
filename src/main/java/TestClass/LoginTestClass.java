package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestClass {
	
	public static String browsername="Firefox";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
			if (browsername.equals("Firefox"))
			{
				driver = new FirefoxDriver();
			}
			else if (browsername.equals("Chrome"))
			{
				System.out.println("Chrome Execution");
				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browsername.equals("Edge"))
			{
				System.out.println("Edge Execution");
				//WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			
			// Open application
		    driver.get("https://www.saucedemo.com/");
		    driver.manage().window().maximize();
		    String crturl = driver.getCurrentUrl();
		    String title = driver.getTitle();
		    System.out.println(title);
		    System.out.println(crturl);
		    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    driver.findElement(By.id("login-button")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("react-burger-menu-btn")).click();
		    driver.findElement(By.id("logout_sidebar_link")).click();
		    Thread.sleep(5000);
		   //driver.close();  
		   driver.quit();
		    
		    
	}
}
