package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class BaseTest implements Autoconst

{
	public static WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{   System.setProperty(Chrom_key, Chrom_value);
		driver= new ChromeDriver();
		driver.navigate().to("https://crm.zoho.com/crm/CreateEntity.do?module=Campaigns");
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

}
