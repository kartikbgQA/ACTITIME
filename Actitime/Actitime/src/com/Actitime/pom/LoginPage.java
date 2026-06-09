package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement unTbx;
	
	@FindBy(name = "pwd")
	private WebElement pwdTbx;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory. initElements(driver, this); //initialization
	}
	
	public void setLogin(String un, String pw) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pw);
		LoginBtn.click();
	}
     
}
