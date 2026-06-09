package com.Actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.generic.BaseClass;

public class TaskList extends BaseClass {
   @FindBy(xpath="//div[@class='addNewButton']")
   private WebElement addnewbtn;
   
   @FindBy(xpath ="//div[text()='New Customer']")
   private WebElement newCustomerBtn;
   
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name' and @class]")
   private WebElement customerNameTbx;
   
   @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   private WebElement customerDescriptionTbx;
   
   @FindBy(xpath="//div[contains(@class,'emptySelection')]")
   private WebElement selectCustemerDropdown;
   
   @FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
   private WebElement ourComanyDropdown;
   
   @FindBy(xpath="//div[text()='Create Customer']")
   private WebElement createCustomerBtn;
   
   @FindBy(xpath="//div[@class='titleEditButtonContainer']")
   private WebElement ActualCustomerName;
   
    
   @FindBy(xpath="(//div[@class='actionButton']/child::div[@class='action'])[1]")
   private WebElement ActionsBtn;
   
   @FindBy(xpath="(//div[@class='deleteButton']/child::div[@class='title' and text()='Delete'])[1]")
   private WebElement DeleteBtn;
   
   
   @FindBy(xpath="(//span[text()='Delete permanently']")
   private WebElement DeletePermanantlyBtn;
   
   public TaskList(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }

   public WebElement getAddnewbtn() {
	return addnewbtn;
   }

   public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
   }

   public WebElement getCustomerNameTbx() {
	return customerNameTbx;
   }

   public WebElement getCustomerDescriptionTbx() {
	return customerDescriptionTbx;
   }

   public WebElement getSelectCustemerDropdown() {
	return selectCustemerDropdown;
   }

   public WebElement getOurComanyDropdown() {
	return ourComanyDropdown;
   }

   public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
   }

   public void setCustomerDescriptionTbx(WebElement customerDescriptionTbx) {
	   customerDescriptionTbx.sendKeys("BankingProject");
   }

   public WebElement getActualCustomerName() {
	return ActualCustomerName;
   }
   
   
   public WebElement getActionsBtn() {
	return ActionsBtn;
}
   
   

   public WebElement getDeleteBtn() {
	return DeleteBtn;
}

   public WebElement getDeletePermanantlyBtn() {
	return DeletePermanantlyBtn;
   }

   public WebElement selectCustomerName(String customerName) {
	    return driver.findElement(
	        By.xpath("//div[@class='text' and text()='" + customerName + "']")
	    );
	}
   
   public WebElement getEditButton(String customerName) {
	    return driver.findElement(
	        By.xpath("//div[@class='title'][.//div[@class='text' and text()='" 
	                  + customerName + 
	                  "']]/following-sibling::div[@class='editButton']")
	    );
	}
   
}
