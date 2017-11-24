package com.actitime.generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Basepage 
{
public static WebDriver driver;

public Basepage(WebDriver driver)
{
     this.driver=driver;	
}

//to verify the title
public static void verifyTitle(String etitle)
{
	WebDriverWait wait=new WebDriverWait(driver,10);

	wait.until(ExpectedConditions.titleIs(etitle));

	{
		Reporter.log("title is matching",true);
	}
	
	
	
	
}
public static void VerifyElement(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present:" +element.getText());
	}
	catch(Exception e)
	{
		Reporter.log("element is not found");
	}
}


{
	
}
	
}
