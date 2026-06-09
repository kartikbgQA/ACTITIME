package com.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.generic.BaseClass;
import com.Actitime.pom.EnterTimeTrack;
import com.Actitime.pom.TaskList;
@Listeners(com.Actitime.generic.ListnersImplementation.class)
public class customerModule_DeleteCustomer extends BaseClass {
	@Test
	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.getTaskTab().click();
		TaskList t = new TaskList(driver);
		t.selectCustomerName("HDFC_1").click();
		t.getEditButton("HDFC_1").click();
		t.getActionsBtn().click();
		t.getDeleteBtn().click();
		t.getDeletePermanantlyBtn().click();
		Thread.sleep(5000);
	}
}
