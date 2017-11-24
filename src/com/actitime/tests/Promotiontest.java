package com.actitime.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

//import org.testng.annotations.Listeners;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Exceldata;
import com.actitime.pages.PromotionPage;


public class Promotiontest extends BaseTest
{
	
@Test
public void testPmodule() throws Exception, InvalidFormatException, IOException
{
String PN=Exceldata.getdata(input_xpath,"Promote",1,1);

PromotionPage pm=new PromotionPage(driver);
pm.createnew();
pm.subcrete();
pm.promotename(PN);
pm.StartDate();
}
}



