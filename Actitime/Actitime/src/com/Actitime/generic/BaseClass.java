package com.Actitime.generic;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.Actitime.pom.EnterTimeTrack;
import com.Actitime.pom.LoginPage;


public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws IOException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 FileLib fl = new FileLib();
	 String url = fl.getPropertyData("url");
	 driver.get(url);
	Reporter.log("Open Browser");
	}
    @AfterTest
	public void CloseBrowser() {
    	driver.close();
    	Reporter.log("Close Browser");
	}
    
    @BeforeMethod
	public void Login() throws IOException {
      LoginPage l = new LoginPage(driver);
      FileLib fl = new FileLib();
    	  String un = fl.getPropertyData("username");
      String pw = fl.getPropertyData("password");
      l.setLogin(un, pw); 
	}
  
	@AfterMethod
	public void Logout() {
    EnterTimeTrack e = new EnterTimeTrack(driver);
    e.getProfileBtn().click();
    e.getLogoutBtn().click();
	}
}
