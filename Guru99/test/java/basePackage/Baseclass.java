package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		 prop = new Properties();
		 
		 FileInputStream file = new FileInputStream("C:\\Users\\sagar\\eclipse-workspace\\Guru99\\test\\java\\basePackage\\data.properties");
		 
		 prop.load(file);
		 
		 String browserName = prop.getProperty("browser");
		 if(browserName.equals("chrome")) {
			 
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Grid\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		      driver = new ChromeDriver();
		       
		      return driver;
		 }
		 
		 driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		return driver;
		
		
	}
	
	
	
	
	

}
