package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;
import utils.Testutils;

public class LoginPage extends Baseclass  {
          
	      @FindBy(xpath=("//input[@name='uid']"))
	      private WebElement Uid;
	      
	      @FindBy(xpath=("//input[@name='password']"))
	      private WebElement Password;
	      
	      @FindBy(xpath=("//input[@name='btnLogin']"))
	      private WebElement Loginbutton;
	      
	      @FindBy(xpath=("//a[text()='Log out']"))
	      private WebElement Logoutbutton;

		private WebDriver driver;
	      
	      
	      public LoginPage(WebDriver driver) {
	    	  
	    	   PageFactory.initElements(driver, this);
	    	   this.driver=driver;
	      }
	      
	      public void EnterLoginPage(String Username,String PassWord){
	    	  
	    	   Uid.sendKeys(Username);
	    	   Password.sendKeys(PassWord);
	    	   Loginbutton.click();
	      }
	    	   
	    	   
	    	   public void ClickLogout() {
	    		  
	    	   Logoutbutton.click();
	      }
	    	   
}

	    	  
	    	  
	

	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\OneDrive\\Desktop\\Grid\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(options);
		driver.get(" http://www.demo.guru99.com/V4/");
		
		WebElement Uid = driver.findElement(By.xpath("//input[@name='uid']"));
		          Uid.sendKeys("mngr558971");
		          
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		         Password.sendKeys("UvEhEhA");
		         
		         WebElement Loginbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		         
		         Loginbutton.click();
		         
		         
		         String actualTitle = driver.getTitle();
		         System.out.println(actualTitle);
		         
		         if (actualTitle.contains(actualTitle)) {
		        	 
		        	 System.out.println("TestPassed");
		        	 
		         }
		         else {
		        	 System.out.println("TestFailed");
		         }
		         
		       driver.close();*/
		       
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
	