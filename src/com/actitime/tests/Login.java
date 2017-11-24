package com.actitime.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Exceldata;
import com.actitime.pages.LoginPage;

public class Login extends BaseTest
{
	@Test
	public void testLoginPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String EM=Exceldata.getdata(input_xpath,"login",1,1);
		String pw=Exceldata.getdata(input_xpath,"login",1,2);
		
		LoginPage ll=new LoginPage(driver);
		ll.loginn();
		ll.email(EM);
		Thread.sleep(1000);
		ll.pwd(pw);
		Thread.sleep(1000);
		ll.sign();
		Thread.sleep(1000);
				
				
				

		
	}

}
