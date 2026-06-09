package com.Actitime.testscripts;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Actitime.generic.BaseClass;
import com.Actitime.generic.FileLib;
import com.Actitime.pom.EnterTimeTrack;
import com.Actitime.pom.TaskList;

@Listeners(com.Actitime.generic.ListnersImplementation.class)
public class customerModule_CreateCustomer extends BaseClass{   
	@Test
	public void createCust() throws InterruptedException, EncryptedDocumentException, IOException {
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.getTaskTab().click();
		TaskList t = new TaskList(driver);
		t.getAddnewbtn().click();
		t.getNewCustomerBtn().click();
		FileLib f = new FileLib();
		String Customername = f.getExcelData("CreateCustomer", 1, 4);
		String Customerdesc = f.getExcelData("CreateCustomer", 1, 5);
		Reporter.log(Customername,true);
		Reporter.log(Customerdesc,true);
		t.getCustomerNameTbx().sendKeys(Customername);
		t.getCustomerDescriptionTbx().sendKeys(Customerdesc);
//		t.getCustomerNameTbx().sendKeys("HDFC_1");
//		t.getCustomerDescriptionTbx().sendKeys("Banking Project");
		t.getSelectCustemerDropdown().click();	
		Thread.sleep(2000);
		t.getOurComanyDropdown().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomerName(), Customername));
		String actualCustomername = t.getActualCustomerName().getText();
		Reporter.log("==================================================================");
		Reporter.log(actualCustomername,true);
		Assert.assertEquals(actualCustomername, Customername);	
		
		//		EnterTimeTrack e = new EnterTimeTrack(driver);
		//		WebElement logut = e.getLogoutBtn();
		//		WebDriverCommonLib w = new WebDriverCommonLib();
		//		w.mouseHover(driver, logut);
		//Assert.fail();
	}
}
