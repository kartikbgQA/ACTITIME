package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	@FindBy(xpath = "(//div[text()='SS'])[1]")
	private WebElement profileBtn;
	
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//span[text()='Tasks']")
	private WebElement taskTab;
	
	public EnterTimeTrack(WebDriver driver) {
		PageFactory. initElements(driver, this); //initialization
	}

	public WebElement getProfileBtn() {
		return profileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getTaskTab() {
		return taskTab;
	}
	
	
	
	
}
