package testPackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.LoginPage;

public class VerifyLoginPage extends Baseclass{
	LoginPage L;
	
	
	 @BeforeTest
	 public void LaunchSite() throws IOException {
		 
		 driver=initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 }
	 
	 
	 @Test
	 public void VerifyLogin() {
		 
		 L = new LoginPage(driver);
		 L.EnterLoginPage(prop.getProperty("Uid"), prop.getProperty("password"));
		 String Title = driver.getTitle();
	     System.out.println(Title);
		 
		 
		 
	 }
	 
	 
	 @AfterTest
	 public void LogOut() {
		 L.ClickLogout();
	 }
	 
	   
	   
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }